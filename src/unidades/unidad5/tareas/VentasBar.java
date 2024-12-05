package unidades.unidad5.tareas;

import java.util.Scanner;

public class VentasBar {

    static Scanner entrada = new Scanner(System.in);
    static final int NUM_DIAS = 6;

    public static void main(String[] args) {

        String [] diasSemana = {"MARTES", "MIÉRCOLES", "JUEVES", "VIERNES", "SÁBADO", "DOMINGO"};
        int dias [] = new int[NUM_DIAS];
        int maximo;
        int minimo;

        
        for (int i = 0; i < NUM_DIAS; i++) {
            System.out.print("Ingrese las ventas del " + diasSemana [i] + ": ");
            dias [i] = entrada.nextInt();
        }
	       
	        maximo = obtenerMaximo(dias);
	        minimo = obtenerMinimo(dias);
        
        System.out.println("Las ventas máximas fueron: " + maximo);
        System.out.println("Las ventas mínimas fueron: " + minimo);
    }
    
    static int obtenerMaximo(int[] dias) {
        int maximo = dias [0];
        for (int i = 1; i < dias.length; i++) {
            if (dias [i] > maximo) {
                maximo = dias[ i];
            }
        }
        return maximo;
    }
  
    static int obtenerMinimo(int[] dias) {
        int minimo = dias [0];
        for (int i = 1; i < dias.length; i++) {
            if (dias [i] < minimo) {
                minimo = dias [i];
            }
        }
        return minimo;
    }
}


