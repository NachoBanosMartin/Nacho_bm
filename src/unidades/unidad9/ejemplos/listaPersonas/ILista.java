package unidades.unidad9.ejemplos.listaPersonas;

public interface ILista {

	public void add(Persona persona);
	public void delete(Persona persona);
	public void update(Persona persona);
	public Persona searchById(int id);
	public Persona searchByName(String nombre);
	public boolean searchPersona(Persona persona);
	public void mostrarLista();
	public boolean esVacia();
	public int obtenerTamanio();
	
}
