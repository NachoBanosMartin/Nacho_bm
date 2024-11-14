package unidades.unidad4.tareas;

import java.util.Random;

public class Ejemplo_Random {

	public static void main(String[] args) {
		
		Random random = new Random();
		int min = 1;
		int max = 10;
		
		int numeroAleatorio = random.nextInt(max-min+1)+min;
		
		long tiempoInicio= System.currentTimeMillis();
		System.out.println("Inicio");
		esperar(numeroAleatorio);
		long tiempoFinal= System.currentTimeMillis();
		System.out.println("Fin");
		
		System.out.println("Tiempo empleado: " +(tiempoFinal-tiempoInicio));
		
		
	}

	
	static void esperar(int segundos) {
		
		try {
			Thread.sleep(segundos*1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}