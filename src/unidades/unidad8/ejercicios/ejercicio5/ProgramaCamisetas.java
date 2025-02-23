package unidades.unidad8.ejercicios.ejercicio5;

public class ProgramaCamisetas {

	public static void main(String[] args) {
		
		Camiseta camiseta1 = new Camiseta (1, "M", "Rojo");
        Camiseta camiseta2 = new Camiseta (2, "XXL", "Azul");

        Personalizada personalizada1 = new Personalizada (3, "L", "Verde", "Cuando la liebre salta, no hay galgo cojo");
        Personalizada personalizada2 = new Personalizada (4, "XXXL", "Negro", "La vaca lechera no es una vaca cualquiera");

        System.out.println("Información de la Camiseta 1:");
        camiseta1.mostrarInformacion();

        System.out.println("\nInformación de la Camiseta 2:");
        camiseta2.mostrarInformacion();

        System.out.println("\nInformación de la Camiseta Personalizada 1:");
        personalizada1.mostrarInformacion();

        System.out.println("\nInformación de la Camiseta Personalizada 2:");
        personalizada2.mostrarInformacion();
    }
}