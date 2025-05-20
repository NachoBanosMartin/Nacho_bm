package unidades.desdeCasa.empresaFerroviaria;

public class Main {

	public static void main(String[] args) {
		
		Mecanicos mecanico = new Mecanicos ("Juan", 235416782, Especialidad.Electricidad);
		
		Locomotora locomotora = new Locomotora ("2345JYH", 500, 2015, mecanico);
		
		Maquinistas maquinista = new Maquinistas ("Diego Martín", 45, 2300.69, Rangos.Senior);
		
		Vagones vagon = new Vagones (2322, 10000, 6000, TipoMercancia.Frutas);
		Vagones vagon1 = new Vagones (6542, 6000, 300, TipoMercancia.Arena);
		Vagones vagon2= new Vagones (9872, 8000, 7000, TipoMercancia.Metales);
		
		JefesEstacion jefe = new JefesEstacion ("Thomas García", "87653725G", "23/07/2008");
		
		
		System.out.println("=== Información del Tren ===\n");
		System.out.println(locomotora.toString());
		System.out.println(maquinista.toString());
		System.out.println(vagon.toString());
		System.out.println(jefe.toString());
		

	}

}
