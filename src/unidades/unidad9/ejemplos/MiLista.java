package unidades.unidad9.ejemplos;

public class MiLista implements ILista{
	
	private int numElementos = 0;
	private Nodo inicio = null;
	private Nodo actual = null;
	

	@Override
	public void add(Persona persona) {

		Nodo nuevo = new Nodo(persona, null);
		
		if(actual == null) {
			inicio = nuevo;
		}else {
			actual.setSiguiente(nuevo);
		}
		actual = nuevo;
	}

	@Override
	public void delete(Persona persona) {
		numElementos --;		
	}

	@Override
	public void update(Persona persona) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mostrarLista() {
		if(!esVacia()) {
			Nodo nodo = inicio;
			while(nodo != null) {
				System.out.println(nodo.getPersona());
				nodo = nodo.getSiguiente();
			}
		}else {
			System.out.println("Lista vacía");
		}
	}

	@Override
	public boolean esVacia() {
		boolean esVacia = true;
		if(inicio != null) {
			esVacia = false;
		}
		return false;
	}

	@Override
	public int obtenerTamanio() {
		int numElementos = 0;
		if(!esVacia()) {
			Nodo nodo = inicio;
			while(nodo != null) {
				numElementos ++;
				nodo = nodo.getSiguiente();
			}
		}
		return numElementos;
	}

	@Override
	public Persona searchById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean searchPersona(Persona persona) {
		
		boolean personaEncontrada = false;
		
		if(!esVacia()) {
			Nodo nodo = inicio;
			while(nodo != null && !personaEncontrada) {
				
				if(nodo.getPersona().getId() == persona.getId()) {
					personaEncontrada = true;
				}
				nodo = nodo.getSiguiente();
			}
		
		}
		return personaEncontrada;
	}

	@Override
	public Persona searchByName(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

}
