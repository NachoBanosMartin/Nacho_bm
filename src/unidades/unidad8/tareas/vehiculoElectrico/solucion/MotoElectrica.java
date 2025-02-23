package unidades.unidad8.tareas.vehiculoElectrico.solucion;

public class MotoElectrica extends VehiculoElectrico {
    private int cilindrada;
    private boolean tieneSidecar;

    public MotoElectrica(String marca, String modelo, double capacidadBateria, double autonomiaMaxima,
    		int cilindrada, boolean tieneSidecar) {
        super(marca, modelo, capacidadBateria, autonomiaMaxima);
        this.cilindrada = cilindrada;
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public double calcularAutonomiaReal(double velocidad, String terreno) {
        double factorTerreno = 1.0;
        if (terreno.equals("subida")) {
            factorTerreno = 0.8;
        } else if (terreno.equals("bajada")) {
            factorTerreno = 1.2;
        }

        double factorVelocidad = 1.0;
        if (velocidad > 80) {
            factorVelocidad = 0.8;
        }

        return super.calcularAutonomiaReal(velocidad, terreno) * factorTerreno * factorVelocidad;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Cilindrada: " + cilindrada + " cc");
        System.out.println("Tiene Sidecar: " + (tieneSidecar ? "Sí" : "No"));
    }
}