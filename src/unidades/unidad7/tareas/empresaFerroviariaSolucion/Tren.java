package unidades.unidad7.tareas.empresaFerroviariaSolucion;

public class Tren {

	private Locomotora locomotora;
    private Maquinista maquinista;
    private List<Vagon> vagones;

    public Tren(Locomotora locomotora, Maquinista maquinista) {
        this.locomotora = locomotora;
        this.maquinista = maquinista;
        this.vagones = new ArrayList<>();
    }

    public void agregarVagon(Vagon vagon) {
        if (vagones.size() < 5) {
            vagones.add(vagon);
        }
    }

    public void mostrarInformacion() {
        System.out.println("Locomotora: " + locomotora.getMatricula() + " | Potencia: " + locomotora.getPotencia() + " CV");
        System.out.println("Maquinista: " + maquinista.getNombre() + " | Rango: " + maquinista.getRango());
        System.out.println("Vagones: " + vagones.size());
        for (Vagon v : vagones) {
            System.out.println("Vagón " + v.getId() + " | Carga: " + v.getCargaActual() + "/" + v.getCargaMaxima() + " kg | Mercancía: " + v.getTipoMercancia().getDescripcion());
        }
    }
}
