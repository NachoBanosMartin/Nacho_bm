package unidades.unidad6.ejercicios.Ejercicio6;

public class Empresa { //

	public static void main(String[] args) {
		
		Empleado empleado1 = new Empleado ("Susana Pérez", 2344, "Contabilidad", "Vicerreptora");
		Empleado empleado2 = new Empleado ("Juan José Ramirez", 3444, "Contabilidad", "Programador");
		Empleado empleado3 = new Empleado ("Ana María García", 2311, "Contabilidad", "Ingeniera");

		System.out.println("Nombre: " + empleado1.getNombre());
		
		empleado1.setNombre("Susana Griso");
		
		System.out.println("Nombre: " + empleado1.getNombre());
		
		Empleado empleado4 = new Empleado("Antonio Rodriguez", 2389);
		
		Empleado empleado5 = new Empleado();
		
		System.out.println("Departamento: " + empleado4.getDepartamento());
		
		System.out.println("Nombre: " + empleado5.getNombre());


	}

}
