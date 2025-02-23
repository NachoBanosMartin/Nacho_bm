package unidades.unidad8.tareas.vehiculoElectrico.solucion;

public class BicicletaElectrica extends VehiculoElectrico {
    private String tipoMotor;
    private boolean asistenciaPedaleo;

    public BicicletaElectrica(String marca, String modelo, double capacidadBateria, double autonomiaMaxima,
    		String tipoMotor, boolean asistenciaPedaleo) {
        super(marca, modelo, capacidadBateria, autonomiaMaxima);
        this.tipoMotor = tipoMotor;
        this.asistenciaPedaleo = asistenciaPedaleo;
    }

    @Override
    public double calcularAutonomiaReal(double velocidad, String terreno) {
        double factorTerreno = 1.0;
        if (terreno.equals("subida")) {
            factorTerreno = 0.7;
        } else if (terreno.equals("bajada")) {
            factorTerreno = 1.3;
        }

        double factorVelocidad = 1.0;
        if (velocidad > 25) {
            factorVelocidad = 0.9;
        }

        return super.calcularAutonomiaReal(velocidad, terreno) * factorTerreno * factorVelocidad;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo de Motor: " + tipoMotor);
        System.out.println("Asistencia al Pedaleo: " + (asistenciaPedaleo ? "Sí" : "No"));
    }
}