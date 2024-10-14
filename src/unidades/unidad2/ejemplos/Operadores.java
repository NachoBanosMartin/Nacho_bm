package unidades.unidad2.ejemplos;

public class Operadores {

	public static void main(String[] args) {
		
		int númeroA= 20, númeroB= 15, númeroC= 5;
		
		System.out.println("Número A:" +númeroA);
		System.out.println("Número B:" +númeroB);
		
		númeroA++;
		System.out.println("Número A:" +númeroA);
		
		númeroB--;
		System.out.println("Número B:" +númeroB);
		
		númeroA+= 10;
		//númeroA = númeroA + 10
		System.out.println("Número A:" +númeroA);

		númeroB =númeroC--;
		System.out.println("Número B:" +númeroB);
		System.out.println("Número C:" +númeroC);
		
		númeroA =númeroC++;
		System.out.println("Número A:" +númeroA);
		System.out.println("Número C:" +númeroC);
		
		

	}

}
