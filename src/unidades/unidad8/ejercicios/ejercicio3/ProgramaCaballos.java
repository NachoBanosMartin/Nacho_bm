package unidades.unidad8.ejercicios.ejercicio3;

public class ProgramaCaballos {

	public static void main(String[] args) {
		
		Caballo caballo1 = new Caballo ("Horse Carlos", "Marrón", 2010);
        CarrerasDeCaballo caballo2 = new CarrerasDeCaballo ("María Horsé", "Lunares Blancos", 2012, 15);
        
        System.out.println("Información del Caballo:");
        caballo1.mostrarInformacion();

        System.out.println("\nInformación del Caballo de Carreras:");
        caballo2.mostrarInformacion();

	}

}
