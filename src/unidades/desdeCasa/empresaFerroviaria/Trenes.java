package unidades.desdeCasa.empresaFerroviaria;

public class Trenes {
	
	protected Locomotora locomotora;
	protected Vagones [] vagon ;
	protected Maquinistas maquinista;
	
	
	public Trenes(Locomotora locomotora, Maquinistas maquinista) {
		super();
		this.locomotora = locomotora;
		this.vagon = new Vagones [5];
		this.maquinista = maquinista;
	}


	public Locomotora getLocomotora() {
		return locomotora;
	}


	public void setLocomotora(Locomotora locomotora) {
		this.locomotora = locomotora;
	}


	public Vagones[] getVagon() {
		return vagon;
	}


	public void setVagon(Vagones[] vagon) {
		this.vagon = vagon;
	}


	public Maquinistas getMaquinista() {
		return maquinista;
	}


	public void setMaquinista(Maquinistas maquinista) {
		this.maquinista = maquinista;
	}
	
	public void engancharVagon(Vagones vagon) {
		
		int contador = 0;
		
		for (int i = 0; i < this.vagon.length; i++) {
			if (this.vagon[i] == null) {
				this.vagon[i] = vagon;
				contador ++;
			}
		}
	}


	
	
	
	

}
