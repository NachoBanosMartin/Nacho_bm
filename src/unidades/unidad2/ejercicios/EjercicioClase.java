package unidades.unidad2.ejercicios;

public class EjercicioClase {

	public static void main(String[] args) {	
		
	
    	final String col_DNI = "DNI            |";
    	final String col_NOMBRE = "NOMBRE   |";
    	final String col_DIRECCIÓN = "DIRECCIÓN     |";
    	final String col_CC = "CUENTA       |";
    	final String col_PASTA = "DINERO       |";

    	
    	System.out.println("       ______________________________________________________________________________________");
    	System.out.println("      |____________________________________DATOS CLIENTE_____________________________________|");
        System.out.printf("\t%s\t%s\t%s\t%s\t%s\n", col_DNI,col_NOMBRE,col_DIRECCIÓN ,col_CC,col_PASTA);
    	System.out.println("      |----------------|-----------------|--------------------|--------------|---------------|");
        System.out.printf("\t%s\t%s\t%s\t%s\t%s\n","28472413       |", "Octavio  |", "636728933     |", "C/Pichón     |", "234987345981 |", "9060€ |");
    	System.out.println("      |----------------|-----------------|--------------------|--------------|---------------|");
        System.out.printf("\t%s\t%s\t%s\t%s\t%s\n","87432519       |", "Ana      |", "987345923     |", "C/Alcaparra  |", "873459271892 |", "23,5€  |");
    	System.out.println("      |________________|_________________|____________________|______________|_______________|");
    	
    	
	}
}
