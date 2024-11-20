package unidades.unidad4.ejercicios;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        /*En esta tarea, se escribe una clase Secuencia que muestra una secuencia comenzando con los números 1 y 1. 
         Los números sucesivos en la secuencia son la suma de los dos números anteriores. Por ejemplo:1 1 2 3 5 8 13.
         Siga estos pasos para crear la clase:

                    a) Escriba una clase llamada Secuencia que contenga un método llamado mostrarSecuencia.
                    
                    b) El método deberá contener un bucle while
         */
        
        
         Secuencia secuencia = new Secuencia();
            secuencia.mostrarSecuencia(10); // Puedes cambiar el número para mostrar más elementos de la secuencia
            
         
        }
    }



    class Secuencia {
        public void mostrarSecuencia(int n) {
            int a = 1, b = 1;
            int contador = 0;

            while (contador < n) {
                System.out.println(a + " ");
                int siguiente = a + b;
                a = b;
                b = siguiente;
                contador++;
            }
        }
    }
		
		
		
		
		
		
		
		
		
		
		
		
