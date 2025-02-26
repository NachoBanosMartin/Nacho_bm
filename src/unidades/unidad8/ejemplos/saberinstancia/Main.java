package unidades.unidad8.ejemplos.saberinstancia;

public class Main {

	public static void main(String[] args) {

		Animal miAnimal = new Perro();
		Animal miAnimal2 = new Gato();

		Animal animales[] = new Animal[2];
		
		animales[0] = miAnimal;
		animales[1] = miAnimal2;
		
		jugarAnimales(animales);
		
	
	}

	private static void jugarAnimales(Animal[] animales) {
		
		for(Animal animal : animales) {
			
			if(animal instanceof Perro) {
				Perro perro = (Perro) animal;
				perro.hacerSonido();
				perro.moverCola();
				perro.correr();
				perro.saltar();
			
			
			}else if(animal instanceof Gato) {
				Gato gato = (Gato) animal;
				gato.hacerSonido();
				gato.ronronear();
			}else {
				System.out.println("Animal no registrado");
			}
		
		}
	}
}

