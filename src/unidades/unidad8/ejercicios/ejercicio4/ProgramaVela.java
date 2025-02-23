package unidades.unidad8.ejercicios.ejercicio4;

public class ProgramaVela {

	public static void main(String[] args) {
		
		Vela vela = new Vela ("Rojo", 10);
        VelaPerfumada velaPerfumada = new VelaPerfumada ("Azul", 15, "Lavanda");
        
        System.out.println("Información de la Vela:");
        vela.mostrarInformacion();

        System.out.println("\nInformación de la Vela Perfumada:");
        velaPerfumada.mostrarInformacion();
    }
}