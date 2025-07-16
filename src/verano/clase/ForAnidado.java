package verano.clase;

public class ForAnidado {

	public static void main(String[] args) {

		int argumento = 3;
		int num2 = argumento;
		
		for (int num = argumento;  num > 0; num --) {
			System.out.println("Haciendo cosas.");
		}
		
		while (num2 > 0) {
			System.out.println("Haciendo cosas.");
			num2 --;
		}
	}

}
