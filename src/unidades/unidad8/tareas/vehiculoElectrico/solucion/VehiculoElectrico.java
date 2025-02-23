package unidades.unidad8.tareas.vehiculoElectrico.solucion;

public class VehiculoElectrico {

	private String marca;
    private String modelo;
    private double capacidadBateria;
    private double autonomiaMaxima;

    public VehiculoElectrico(String marca, String modelo, double capacidadBateria, double autonomiaMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadBateria = capacidadBateria;
        this.autonomiaMaxima = autonomiaMaxima;
    }

    public double calcularAutonomiaReal(double velocidad, String terreno) {
        return autonomiaMaxima;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Capacidad de Batería: " + capacidadBateria + " kWh");
        System.out.println("Autonomía Máxima: " + autonomiaMaxima + " km");
    }
}

