package unidades.unidad6.tareas.colaPedidos;

public class Pedidos {

	private int id;
	private String tipoMercancia;
	private double kg;
	private TipoPedido tipoPedido;
	
	public Pedidos(int id, String tipoMercancia, double kg, TipoPedido tipoPedido) {
		super();
		this.id = id;
		this.tipoMercancia = tipoMercancia;
		this.kg = kg;
		this.tipoPedido = tipoPedido;
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

	public TipoPedido getTipoPedido() {
		return tipoPedido;
	}

	public void setTipoPedido(TipoPedido tipoPedido) {
		this.tipoPedido = tipoPedido;
	}

	@Override
	public String toString() {
		return "Pedidos [id=" + id + ", tipoMercancia=" + tipoMercancia 
				+ ", kg=" + kg + ", tipoPedido=" + tipoPedido + "]";
	}
	
	
}
