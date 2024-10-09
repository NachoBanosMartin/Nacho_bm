package unidades.unidad2.ejercicios;

public class LuzSolar {

	public static void main(String[] args) {

		int kmDesdeSol= 150000000;
		int velocidadLuz= 299792458; //metros por segundo
		
		//Convertir la distancia en metros
		int mDesdeSol = kmDesdeSol *1000;
		
		int segundos= kmDesdeSol/velocidadLuz;
		
		System.out.print("La luz tardará ");
		
		int min= segundos/60;
		segundos= segundos+(min*60);
		
		System.out.print(min+ "minuto(s) y "+ segundos +"segundo(s)");
		System.out.print(" en viajar desde el sol a la Tierra");
		
	}

}
