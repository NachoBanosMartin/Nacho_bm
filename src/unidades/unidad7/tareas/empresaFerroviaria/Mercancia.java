package unidades.unidad7.tareas.empresaFerroviaria;

public enum Mercancia {

	CEREALES ("Cereales"),
	MINERALES ("Minerales"),
	ARENA ("Arena"),
	GRAVA ("Grava"),
	PETROLEO ("Petroleo"),
	GAS_LICUADO ("Gas Licuado"),
	PRODUCTOS_QUIMICOS ("Productos Químicos"),
	METALES ("Metales"),
	ALIMENTOS_REFRIGERADOS ("Alimentos Refrigerados"),
	FRUTAS ("Frutas"),
	CARNES ("Carnes"),
	CONTENEDORES ("Contenedores"),
	VEHICULOS ("Vehiculos"),
	MADERA ("Madera"),
	MATERIAL_CONSTRUCCION ("Material Construcción"),
	MAQUINARIA ("Maquinaria");
	
	private final String mercancia;

	private Mercancia(String mercancia) {
		this.mercancia = mercancia;
	}

	public String getMercancia() {
		return mercancia;
	}
	
	

}
