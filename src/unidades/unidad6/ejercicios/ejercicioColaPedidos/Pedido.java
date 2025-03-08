package unidades.unidad6.ejercicios.ejercicioColaPedidos;

public class Pedido {

	private int id;
	private String tipoMercancia;
	private double kg;
	private String tipoPedidos;
	
	
	public Pedido(int id, String tipoMercancia, double kg, String tipoPedidos) {
		super();
		this.id = id;
		this.tipoMercancia = tipoMercancia;
		this.kg = kg;
		this.tipoPedidos = tipoPedidos;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTipoMercancia() {
		return tipoMercancia;
	}


	public void setTipoMercancia(String tipoMercancia) {
		this.tipoMercancia = tipoMercancia;
	}


	public double getKg() {
		return kg;
	}


	public void setKg(double kg) {
		this.kg = kg;
	}


	public String getTipoPedidos() {
		return tipoPedidos;
	}


	public void setTipoPedidos(String tipoPedidos) {
		this.tipoPedidos = tipoPedidos;
	}


	@Override
	public String toString() {
		return "Pedido [id=" + id + ", tipoMercancia=" + tipoMercancia + ", kg=" + kg + ", tipoPedidos=" + tipoPedidos
				+ "]";
	}
	
	
	
	
}
