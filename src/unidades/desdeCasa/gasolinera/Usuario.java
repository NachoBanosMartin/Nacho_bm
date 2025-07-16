package unidades.desdeCasa.gasolinera;

public class Usuario {
	
	private String nombre;
	private String contrasena;
	private double totalLitrosRepostados;
	private double importeGastado;
	private int puntosAcumulados;
	private int cuponesDisponibles;
	
	
	public Usuario(String contrasena, double totalLitrosRepostados, double importeGastado, int puntosAcumulados,
			int cuponesDisponibles) {
		super();
		this.nombre = "ibanosmar";
		this.contrasena = contrasena;
		this.totalLitrosRepostados = totalLitrosRepostados;
		this.importeGastado = importeGastado;
		this.puntosAcumulados = puntosAcumulados;
		this.cuponesDisponibles = cuponesDisponibles;
	}

	public Usuario() {
		super();
		this.nombre = "ibanosmar";
		this.contrasena = "0000";
		this.totalLitrosRepostados = 0.0;
		this.importeGastado = 0.0;
		this.puntosAcumulados = 0;
		this.cuponesDisponibles = 0;
	}

	public Usuario(String nombre, String contrasena, double totalLitrosRepostados, double importeGastado,
			int puntosAcumulados, int cuponesDisponibles) {
		super();
		this.nombre = nombre;
		this.contrasena = contrasena;
		this.totalLitrosRepostados = totalLitrosRepostados;
		this.importeGastado = importeGastado;
		this.puntosAcumulados = puntosAcumulados;
		this.cuponesDisponibles = cuponesDisponibles;
	}
	
	public void acumuladorPuntos(double litros) {
		
		this.puntosAcumulados += litros;
		if(this.puntosAcumulados >= 100) {
			this.cuponesDisponibles ++;
			this.puntosAcumulados = this.puntosAcumulados - 100;
		}
	}
	
	public void aplicarDescuento(double importe) {
		
		if(this.cuponesDisponibles > 0) {
			double descuento = (importe * 5) / 100;
			this.importeGastado = importe - descuento;
			this.cuponesDisponibles --;
		}else {
			this.importeGastado = importe;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public double getTotalLitrosRepostados() {
		return totalLitrosRepostados;
	}

	public void setTotalLitrosRepostados(double totalLitrosRepostados) {
		this.totalLitrosRepostados = totalLitrosRepostados;
	}

	public double getImporteGastado() {
		return importeGastado;
	}

	public void setImporteGastado(double importeGastado) {
		this.importeGastado = importeGastado;
	}

	public int getPuntosAcumulados() {
		return puntosAcumulados;
	}

	public void setPuntosAcumulados(int puntosAcumulados) {
		this.puntosAcumulados = puntosAcumulados;
	}

	public int getCuponesDisponibles() {
		return cuponesDisponibles;
	}

	public void setCuponesDisponibles(int cuponesDisponibles) {
		this.cuponesDisponibles = cuponesDisponibles;
	}

	@Override
	public String toString() {
		return  nombre + ";" + contrasena + ";"	+ totalLitrosRepostados + ";" + importeGastado + ";"
				+ puntosAcumulados + ";" + cuponesDisponibles;
	}
}
