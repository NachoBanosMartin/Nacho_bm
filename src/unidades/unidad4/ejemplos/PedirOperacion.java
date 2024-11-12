package unidades.unidad4.ejemplos;

import java.util.Scanner;

public class PedirOperacion {
    
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        
        char operacion = pedirOperacion();
        int numVeces = pedirNumeroVecesOperacion();
        char opcion;
        
        do {
            realizarOperacion(operacion, numVeces);
            System.out.print("¿Desea realizar otra operación? (S/N): ");
            opcion = entrada.next().toUpperCase().charAt(0);
        } while (opcion == 'S');
        
        entrada.close();
    }

    static void realizarOperacion(char operacion, int numVeces) {
        
        switch (operacion) {
            case 'S': 
                mostrarMensaje("Operación elegida: sumar " + numVeces + " veces");
                for (int i = 0; i < numVeces; i++) {
                    System.out.print("Ingrese el primer número: ");
                    int num1 = leerEntero();
                    System.out.print("Ingrese el segundo número: ");
                    int num2 = leerEntero();
                    int resultado = sumar(num1, num2);
                    mostrarMensaje("Resultado de la suma: " + resultado);
                }
                break;
            
            case 'R': 
                mostrarMensaje("Operación elegida: restar " + numVeces + " veces");
                for (int i = 0; i < numVeces; i++) {
                    System.out.print("Ingrese el primer número: ");
                    int num1 = leerEntero();
                    System.out.print("Ingrese el segundo número: ");
                    int num2 = leerEntero();
                    int resultado = restar(num1, num2);
                    mostrarMensaje("Resultado de la resta: " + resultado);
                }
                break;
        }
    }

    static int pedirNumeroVecesOperacion() {
        
        int veces = 0;
        
        do {    
            mostrarMensaje("Introduzca el número de veces entre el 1 y el 3");
            veces = entrada.nextInt();
        } while (veces <= 0 || veces > 3);
                
        return veces;
    }

    static char pedirOperacion() {
        
        char operacion;
        
        do {    
            mostrarMensaje("Introduzca la operación S para sumar o R para restar");
            operacion = entrada.next().toUpperCase().charAt(0);
            
        } while (operacion != 'S' && operacion != 'R');
        
        return operacion;
    }

    static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    
    static int sumar(int sumando1, int sumando2) {
        return sumando1 + sumando2;
    }
    
    static int restar(int sumando1, int sumando2) {
        return sumando1 - sumando2;
    }
    
    static int leerEntero() {
        return entrada.nextInt();
    }
}
