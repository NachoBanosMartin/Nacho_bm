package unidades.unidad8.tareas.vehiculoElectrico.solucion;

public class Main {

	public static void main(String[] args) {
        CocheElectrico coche = new CocheElectrico("Tesla", "Model S", 100, 600, 4, "rápida");
        MotoElectrica moto = new MotoElectrica("Ducati", "600", 14.4, 259, 750, false);
        BicicletaElectrica bici = new BicicletaElectrica("BH", "Turbo", 0.7, 150, "central", true);

        System.out.println("Información del Coche Eléctrico:");
        coche.mostrarInformacion();
        System.out.println("Autonomía Real: " + coche.calcularAutonomiaReal(120, "llano") + " km");

        System.out.println("\nInformación de la Moto Eléctrica:");
        moto.mostrarInformacion();
        System.out.println("Autonomía Real: " + moto.calcularAutonomiaReal(90, "subida") + " km");

        System.out.println("\nInformación de la Bicicleta Eléctrica:");
        bici.mostrarInformacion();
        System.out.println("Autonomía Real: " + bici.calcularAutonomiaReal(25, "bajada") + " km");
    }
}

