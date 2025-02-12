package unidades.unidad6.tareas.padron;

public class CausaInscripcion {

	private Causa causa;
	private String municipioProcedencia;
	private String paisProcedencia;
	
	
	public CausaInscripcion(Causa causa, String valor) {
		super();
		this.causa = causa;
		
		
	if (causa.equals("Cambio de residencia")) {
		this.municipioProcedencia = valor;
		this.paisProcedencia = valor;
	}
	
}
	
}

	
