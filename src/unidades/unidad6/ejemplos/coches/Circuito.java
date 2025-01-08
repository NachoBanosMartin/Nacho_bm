package unidades.unidad6.ejemplos.coches;

public class Circuito {

	public static void main(String[] args) {
		Coche coche1 = new Coche("Audi","A3",2014,"Rojo",'D',100); // Declara una variable de tipo coche y crearlo (Objeto)
		Coche coche2 =new  Coche("Citroen","C4",2023,"Azul",'G',140);
		Coche coche3 =new  Coche("Toyota","Rav4",2022,"Gris",'E',230);
		Coche coche4 = new Coche("Seat","Ibiza",2000,"Amarillo",'D',60);
		
		coche1.setMarca("Audi");
		
		System.out.println("Marca:"+coche1.getMarca()+"\nModelo: "+coche1.getModelo());
		System.out.println("Marca:"+coche2.getMarca()+"\nModelo: "+coche2.getModelo());
		System.out.println("Marca:"+coche3.getMarca()+"\nModelo: "+coche3.getModelo());
		System.out.println("Marca:"+coche4.getMarca()+"\nModelo: "+coche4.getModelo());

		
		System.out.println("Velocidad:"+ coche1.getVelocidad()+"kms/h");
		coche1.acelerar();
		coche1.acelerar();
		System.out.println("Velocidad:"+ coche1.getVelocidad()+"kms/h");
		
		coche1.frenar();
		System.out.println("Velocidad:"+ coche1.getVelocidad()+"kms/h");
		
		
		
		}

}