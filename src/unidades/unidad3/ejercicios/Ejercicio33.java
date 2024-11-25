package unidades.unidad3.ejercicios;

import java.util.Scanner;

public class Ejercicio33 {

    /* Los empleados de una fábrica trabajan por turnos: diurno y nocturno. Se debe calcular el jornal diario de acuerdo
       con los siguientes puntos:

            - La tarifa por horas diurnas es de 20 €.

            - La tarifa por horas nocturnas es de 35 €.

            - Caso de ser domingo, la tarifa se incrementará en 10 € más para el turno diurno y 15 € más para el nocturno.
     */
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Seleccione el turno en el que vaya a trabajar (diurno/nocturno) para calcular el salario: ");
        String turno = entrada.nextLine().toLowerCase();
        
        System.out.println("Indique el número de horas trabajadas: ");
        int horasTrabajadas = entrada.nextInt();
        
        System.out.println("¿Es domingo? (si/no): ");
        entrada.nextLine();
        String domingo = entrada.nextLine().toLowerCase();
        
        int tarifa = 0;
        
        if (turno.equals("diurno")) {
            tarifa = 20;
            if (domingo.equals("si")) {
                tarifa += 10;
            }
        } else if (turno.equals("nocturno")) {
            tarifa = 35;
            if (domingo.equals("si")) {
                tarifa += 15;
            }
        } else {
            System.out.println("Turno no válido.");
            entrada.close();
            return;
        }
        
        int jornalDiario = tarifa * horasTrabajadas;
        
        System.out.println("El jornal diario es: " + jornalDiario + " €");
        
        entrada.close();
    }
}