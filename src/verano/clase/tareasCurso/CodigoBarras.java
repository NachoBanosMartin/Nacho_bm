package verano.clase.tareasCurso;

import java.util.HashMap;
import java.util.Scanner;

public class CodigoBarras {

    private static final int CODIGO_EAN8 = 8;
    private static final int CODIGO_EAN13 = 13;
    private static final Scanner entrada = new Scanner(System.in);
    private static final HashMap<String, String> paises = new HashMap<>();

    public static void main(String[] args) {

        paises.put("00", "EE.UU.");
        paises.put("45", "Japón");
        paises.put("69", "China");
        paises.put("78", "Chile");
        paises.put("38", "Bulgaria");
        paises.put("46", "Japón");
        paises.put("75", "México");
        paises.put("79", "Brasil");
        paises.put("40", "Alemania");
        paises.put("50", "Reino Unido");
        paises.put("77", "Colombia");
        paises.put("84", "España");

        while (true) {
            System.out.println("Introduce el código de barras (0 para salir):");
            String codigo = entrada.next();

            if (codigo.equals("0")) {
                break;
            }

            if (codigo.length() < CODIGO_EAN13 && codigo.length() > CODIGO_EAN8) {
                while (codigo.length() < CODIGO_EAN13) {
                    codigo = "0" + codigo;
                }
            } else if (codigo.length() < CODIGO_EAN8) {
                while (codigo.length() < CODIGO_EAN8) {
                    codigo = "0" + codigo;
                }
            }

            if (codigo.length() == CODIGO_EAN8) {
                // control EAN-8
                long codigoNumerico = Long.parseLong(codigo);
                int digitoComprobacion = (int)(codigoNumerico % 10);
                int sumaTotal = 0;
                int aux;

                codigoNumerico = codigoNumerico / 10;

                for (int i = 1; i < CODIGO_EAN8; i++) {
                    aux = (int)(codigoNumerico % 10);

                    if (i % 2 != 0) {
                        aux = aux * 3;
                    } else {
                        aux = aux * 1;
                    }

                    sumaTotal += aux;
                    codigoNumerico = codigoNumerico / 10;
                }

                int digitoEsperado = (10 - (sumaTotal % 10));

                if (digitoEsperado == digitoComprobacion) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }

            } else if (codigo.length() == CODIGO_EAN13) {
                // control EAN-13
                long codigoNumerico = Long.parseLong(codigo);
                int digitoComprobacion = (int)(codigoNumerico % 10);
                int sumaTotal = 0;
                int aux;

                codigoNumerico = codigoNumerico / 10;

                for (int i = 1; i < CODIGO_EAN13; i++) {
                    aux = (int)(codigoNumerico % 10);

                    if (i % 2 != 0) {
                        aux = aux * 3;
                    } else {
                        aux = aux * 1;
                    }

                    sumaTotal += aux;
                    codigoNumerico = codigoNumerico / 10;
                }

                int digitoEsperado = (10 - (sumaTotal % 10));

                if (digitoEsperado == digitoComprobacion) {
                    System.out.println("SI");
                    String prefijo = codigo.substring(0, 2);
                    if (paises.containsKey(prefijo)) {
                        System.out.println(paises.get(prefijo));
                    } else {
                        System.out.println("Desconocido");
                    }
                } else {
                    System.out.println("NO");
                }

            } else {
                System.out.println("Código inválido");
            }
        }

        System.out.println("Findel programa");
    }
}
