package unidades.unidad8.tareas.vehiculoElectrico.solucion;

public class CocheElectrico extends VehiculoElectrico {
    private int numeroPuertas;
    private String tipoCarga;

    public CocheElectrico(String marca, String modelo, double capacidadBateria, double autonomiaMaxima,
    		int numeroPuertas, String tipoCarga) {
        super(marca, modelo, capacidadBateria, autonomiaMaxima);
        this.numeroPuertas = numeroPuertas;
        this.tipoCarga = tipoCarga;
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
        if (velocidad > 100) {
            factorVelocidad = 0.7;
        }

        return super.calcularAutonomiaReal(velocidad, terreno) * factorTerreno * factorVelocidad;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de Puertas: " + numeroPuertas);
        System.out.println("Tipo de Carga: " + tipoCarga);
    }
}
