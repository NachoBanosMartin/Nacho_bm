package unidades.unidad5.tareas;

import java.util.Scanner;

public class Ascensor {
	
	static Scanner entrada = new Scanner(System.in);
	static int plantaActual = 1; 
    static int plantaObjetivo;
    static int opcion;

	public static void main(String[] args) {
	
	
        while (true){          //Se muestra el menú
            System.out.println("------ Ascensor ------");
            System.out.println("1.Marcar planta");
            System.out.println("2.Abrir puerta");
            System.out.println("3.Cerrar puerta");
            System.out.println("4.Apagar..");
                       
            opcion = entrada.nextInt();
            
            switch (opcion){
                case 1: 
                    System.out.print("Ingrese el número de la planta (0 a 5): ");
                   plantaObjetivo = entrada.nextInt();
                    if (plantaObjetivo >= 0 && plantaObjetivo <= 5){ //Comprobar que está dentro de rango
                        while (plantaActual != plantaObjetivo){  // Mientras la planta actual no sea igual a la planta objetivo, mover el ascensor.
                            if (plantaActual < plantaObjetivo){
                                System.out.println("Subiendo una planta.");
                                plantaActual++;             //Sube
                            }else{
                                System.out.println("Bajando una planta.");
                                plantaActual--;   //Baja
                            }
                            System.out.println("Planta: " + plantaActual);
                        }
                    }else{
                        System.out.println("Número de planta no válido. Intentelo de nuevo.");
                    }
                    break;
                case 2:             //En el caso 2 se abre la puerta
                    System.out.println("Puerta abierta.");
                    break;
                case 3:             // En el caso 3 se cierra la puerta
                    System.out.println("Puerta cerrada.");
                    break;
                case 4:              // EN el caso 4 se apaga el ascensor
                    System.out.println("Ascensor apagado.");
                    entrada.close();
                    return;
                default:            // Si no la opción no es válida
                    System.out.println("Opción inválida. Intentelo de nuevo.");
            }
        }
   }
}
