package unidades.desdeCasa.gasolinera;

import java.io.*;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static final Scanner entrada = new Scanner(System.in);
	public static Usuario[] usuarios;
    public static Usuario usuarioRegistrado = null;

	public static void main(String[] args) {

        usuarios = cargarUsuarios("usuariosGasolinera.txt");

        if (!acceso(usuarios)) {
            System.out.println("Credenciales incorrectas. Saliendo del sistema.");
            return;
        }

        int opcion;

        Surtidor[] surtidores = {
			            new Surtidor("Gasolina95", 1000, 800, 1.545),
			            new Surtidor("Gasolina98", 1000, 800, 1.727),
			            new Surtidor("Diésel", 1000, 600, 1.462)
        };

        do {
            mostrarMenu();
            opcion = entrada.nextInt();
            entrada.nextLine();
            
            switch (opcion) {
                case 1:
                    repostar(surtidores, usuarioRegistrado);
                    break;
                case 2:
                    verComprobantes(usuarioRegistrado); 
                    break;
                case 3:
                    mostrarEstadisticasPersonales();
                    break;
                case 4:
                    reabastecerSurtidores(surtidores); 
                    break;
                case 5:
                    mostrarEstadisticasGenerales(surtidores);
                    break;
                case 6:
                    System.out.println("Gracias por usar la gasolinera. Vuelva cuando quiera.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 6);

        guardarUsuarios();
    }

    

    public static boolean acceso(Usuario[] usuarios) {
        System.out.println("---- INICIO DE SESIÓN ----");
        System.out.println("Usuario: ");
        String nombre = entrada.next();
        System.out.println("Contraseña: ");
        String contrasena = entrada.next();

        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombre) && usuario.getContrasena().equals(contrasena)) {
                usuarioRegistrado = usuario;
                return true;
            }
        }
        return false;
    }

    public static Usuario[] cargarUsuarios(String nombreFichero) {
        int numUsuarios = obtenerNumUsuReg(nombreFichero);
        Usuario[] usuarios = new Usuario[numUsuarios];

        try (BufferedReader lector = new BufferedReader(new FileReader(nombreFichero))) {
            String linea;
            int i = 0;

            while ((linea = lector.readLine()) != null && i < numUsuarios) {
                String[] datos = linea.split(";");
                if (datos.length == 6) {
                    String nombre = datos[0];
                    String contrasena = datos[1];
                    double litros = Double.parseDouble(datos[2]);
                    double importe = Double.parseDouble(datos[3]);
                    int puntos = Integer.parseInt(datos[4]);
                    int cupones = Integer.parseInt(datos[5]);

                    usuarios[i] = new Usuario(nombre, contrasena, litros, importe, puntos, cupones);
                    i++;
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer los usuarios: " + e.getMessage());
        }

        return usuarios;
    }

    public static int obtenerNumUsuReg(String nombreFichero) {
        int contador = 0;
        try (BufferedReader lector = new BufferedReader(new FileReader(nombreFichero))) {
            while (lector.readLine() != null) {
                contador++;
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }
        return contador;
    }

    public static void guardarUsuarios() {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter("usuariosGasolinera.txt"))) {
            for (Usuario usuario : usuarios) {
                escritor.write(usuario.toString());
                escritor.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error guardando usuarios: " + e.getMessage());
        }
    }


    public static void repostar(Surtidor[] surtidores, Usuario usuarioRegistrado) {
        System.out.println("Indique el tipo de combustible: ");
        String tipo = entrada.nextLine();

        Surtidor surtidor = buscarSurtidorPorTipo(surtidores, tipo);
        if (surtidor == null) {
            System.out.println("Tipo de combustible no encontrado.");
            return;
        }

        System.out.println("Indique la cantidad a repostar: ");
        double litros = entrada.nextDouble();

        if (litros > surtidor.getLitrosDisponibles()) {
            System.out.println("No hay suficientes litros disponibles.");
            return;
        }

        double importe = litros * surtidor.getPrecioPorLitro();
        usuarioRegistrado.aplicarDescuento(importe);

        surtidor.setLitrosDisponibles(surtidor.getLitrosDisponibles() - litros);
        usuarioRegistrado.setTotalLitrosRepostados(usuarioRegistrado.getTotalLitrosRepostados() + litros);
        usuarioRegistrado.acumuladorPuntos(litros);

        Date fecha = new Date();
        Comprobante comprobante = new Comprobante(fecha, tipo, importe, litros, surtidor.getLitrosDisponibles());
        guardarComprobante(comprobante);

        System.out.println("Repostaje completado.");
    }

    public static Surtidor buscarSurtidorPorTipo(Surtidor[] surtidores, String tipo) {
        for (Surtidor surtidor : surtidores) {
            if (surtidor.getTipoCombustible().equalsIgnoreCase(tipo)) {
                return surtidor;
            }
        }
        return null;
    }

    public static void guardarComprobante(Comprobante comprobante) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter("comprobantes.txt", true))) {
            escritor.write(guardarFormato(comprobante));
            escritor.newLine();
        } catch (IOException e) {
            System.out.println("Error al guardar el comprobante.");
        }
    }

    private static String guardarFormato(Comprobante c) {
        return "Comprobante;" + c.getFecha().getTime() + ";" + c.getTipoCombustible() + ";" +
               c.getImporte() + ";" + c.getLitrosSuministrados() + ";" + c.getLitrosRestantesDeposito();
    }

    public static void verComprobantes(Usuario usuarioRegistrado) {
        File archivo = new File("comprobantes.txt");

        if (!archivo.exists()) {
            System.out.println("No hay comprobantes guardados.");
            return;
        }

        try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
            String linea;
            boolean encontrado = false;

            while ((linea = lector.readLine()) != null) {
                Comprobante comprobante = Comprobante.impresion(linea);
                if (comprobante != null) {
                    comprobante.mostrar();
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.println("No tienes comprobantes aún.");
            }

        } catch (IOException e) {
            System.out.println("Error al leer comprobantes.");
        }
    }


    public static void mostrarEstadisticasPersonales() {
        System.out.println("------ ESTADÍSTICAS ------");
        System.out.println("Usuario: " + usuarioRegistrado.getNombre());
        System.out.println("Litros repostados: " + usuarioRegistrado.getTotalLitrosRepostados());
        System.out.println("Importe total gastado: " + usuarioRegistrado.getImporteGastado());
        System.out.println("Puntos acumulados: " + usuarioRegistrado.getPuntosAcumulados());
        System.out.println("Cupones disponibles: " + usuarioRegistrado.getCuponesDisponibles());
    }

    public static void mostrarEstadisticasGenerales(Surtidor[] surtidores) {
        System.out.println("------ ESTADÍSTICAS GENERALES ------");
        for (Surtidor surtidor : surtidores) {
            System.out.println("Tipo: " + surtidor.getTipoCombustible());
            System.out.println("Capacidad total: " + surtidor.getMaxLitros());
            System.out.println("Litros disponibles: " + surtidor.getLitrosDisponibles());
            System.out.println("-----------------------------");
        }
    }

    public static void reabastecerSurtidores(Surtidor[] surtidores) {
        for (Surtidor surtidor : surtidores) {
            surtidor.setLitrosDisponibles(surtidor.getMaxLitros());
        }
        System.out.println("Todos los surtidores han sido reabastecidos.");
    }

    private static void mostrarMenu() {
        System.out.println("------GASOLINERA------");
        System.out.println("1. Repostar.");
        System.out.println("2. Ver comprobantes.");
        System.out.println("3. Consultar estadísticas personales.");
        System.out.println("4. Reabastecer depósitos.");
        System.out.println("5. Consultar estadísticas generales.");
        System.out.println("6. Salir.");
        System.out.println("Seleccione la opción que desee: ");
    }

}

