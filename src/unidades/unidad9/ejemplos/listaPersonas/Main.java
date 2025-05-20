package unidades.unidad9.ejemplos.listaPersonas;

public class Main {

	public static void main(String[] args) {

		ILista listaPersona = new MiLista();
		
		Persona persona1 = new Persona(1, "Amparo");
		Persona persona2 = new Persona(12, "Tomás");
		Persona persona3 = new Persona(9, "Mbappé");
		
		
		listaPersona.add(persona1);
		listaPersona.add(persona2);
		listaPersona.add(persona3);

		listaPersona.mostrarLista();
		
		System.out.println("Numero de elementos: " + listaPersona.obtenerTamanio());
		
		if(listaPersona.searchPersona(persona3)) {
			System.out.println(persona3 + " Persona encontrada");
		}else {
			System.out.println(persona3 + " Persona no encontrada");
		}
		
	}

}
