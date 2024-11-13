package unidades.unidad4.tareas;

import java.util.Scanner;

public class Tarea_Plasma {

	 static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        
        	int edad = pedirEdad();
	        int veces = pedirVeces();     
	        char estadoSalud = pedirEstado();
	       	   
	        
	        comprobarRequisitos(edad,veces,estadoSalud);
	        
        scanner.close();
    }
    
    
    
    private static void comprobarRequisitos(int edad, int veces, char estadoSalud) {
		
    	     if(edad<18) {
    	    	 System.out.println("No puedes donar por ser menor de edad");
    	     }else if(veces>4) {
    	    	 System.out.println("No puedes donar porque superas el límite de donaciones anuales");
    	     }else if(estadoSalud=='N') {
    	    	 System.out.println("No puedes donar porque no tienes buena salud");
    	     }else {
    	    	 System.out.println("Puedes donar");
    	     }
		
	}



	private static char pedirEstado() {
		
    	char estado;
    	 do {      	        
 	        mostrarMensaje("¿Se encuentra bien de salud? Indique si o no (S/N): ");
 	       estado = scanner.next().toUpperCase().charAt(0);
 	    } while (estado != 'S' && estado!='N');
    	 
    	return estado;
	}



	private static int pedirVeces() {
		
		int veces;
	     do {
	    	 mostrarMensaje("Indique las veces que ha donado antes: ");
	    	 veces = leerEntero();  
	    	 
	     }while(veces<0);
	   	   
		   return veces;
	}



	private static int pedirEdad() {
		
     int edad;
     
     do {
    	 mostrarMensaje("Indique su edad: ");
  	    edad = leerEntero();  
    	 
     }while(edad<=0);
   	   
	   return edad;
	}



	static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    
    static int leerEntero() {
        return scanner.nextInt();
    }
    
 
}
