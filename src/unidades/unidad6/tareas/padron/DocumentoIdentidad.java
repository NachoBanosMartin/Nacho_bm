package unidades.unidad6.tareas.padron;

public class DocumentoIdentidad {
	
	private Documento documento;
	private String numero;
	private String pasaporte;
	private int nivelEstudio;
	
	
	public DocumentoIdentidad(Documento documento, String valor, int nivelEstudio) {
		super();
		this.documento = documento;


		if (documento.equals("DNI") || documento.equals("NIE")) {
			this.numero = valor;
		} else {
			this.pasaporte = valor;
		}
		this.nivelEstudio = nivelEstudio;
}
}
