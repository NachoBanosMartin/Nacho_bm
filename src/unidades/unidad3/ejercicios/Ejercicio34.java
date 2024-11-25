package unidades.unidad3.ejercicios;

import java.util.Scanner;

public class Ejercicio34 {
    
    /* Realiza un algoritmo que introducidas las notas de N alumnos nos indicará cuántos aprobados y cuántos suspensos hay.
       Generaliza este ejercicio para una cantidad indefinida de notas (pararemos con una nota negativa). Amplía el 
       ejercicio indicando no solo cuántos aprobados hay, también cuántos sobresalientes, notables, bienes, aprobados
       y suspensos. */

    public static void main(String[] args) {

        double nota;
        int sobresalientes = 0;
        int notables = 0;
        int bienes = 0;
        int suficientes = 0;
        int insuficientes = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        while (true) {
            System.out.println("Indique su nota: ");
            nota = entrada.nextDouble();
            
            if (nota < 0) {
                break;
            }
            
            if (nota >= 9 && nota <= 10) {
                sobresalientes++;
            } else if (nota >= 7) {
                notables++;
            } else if (nota >= 6) {
                bienes++;
            } else if (nota >= 5) {
                suficientes++;
            } else {
                insuficientes++;
            }
            
            System.out.println("----Resultados----");
            System.out.println("Sobresalientes: " + sobresalientes);
            System.out.println("Notables: " + notables);
            System.out.println("Bienes: " + bienes);
            System.out.println("Aprobados: " + suficientes);
            System.out.println("Suspensos: " + insuficientes);
        }
        
        System.out.println("----Resultados----");
        System.out.println("Sobresalientes: " + sobresalientes);
        System.out.println("Notables: " + notables);
        System.out.println("Bienes: " + bienes);
        System.out.println("Aprobados: " + suficientes);
        System.out.println("Suspensos: " + insuficientes);
        
        entrada.close();
    }
}