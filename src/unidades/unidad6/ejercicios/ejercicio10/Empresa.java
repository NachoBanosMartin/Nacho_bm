package unidades.unidad6.ejercicios.ejercicio10;

public class Empresa {  //

	public static void main(String[] args) {
		
		Empleado[] empleados= new Empleado [Datos.NUM_EMPLEADOS];
		
		Empleado empleado1 = new Empleado ("Antonio", "García Torres", 40, Datos.CARGO_4, Datos.PRECIO_HORA_JEFE, 
				"Completo", Datos.BONIFICACION_T_COMPLETO);
		Empleado empleado2 = new Empleado ("Amparo", "Martinez Ejido", 42, Datos.CARGO_1, Datos.PRECIO_HORA_GERENTE,
				"Completo", Datos.BONIFICACION_T_COMPLETO);
		Empleado empleado3 = new Empleado ("Moises", "Carrasco López", 35, Datos.CARGO_3, Datos.PRECIO_HORA_OPERARIO,
				"Completo", Datos.BONIFICACION_T_COMPLETO);
		Empleado empleado4 = new Empleado ("Carmen", "Fernández Mazuecos", 40, Datos.CARGO_2, Datos.PRECIO_HORA_ADMIN,
				"Completo", Datos.BONIFICACION_T_COMPLETO);
		Empleado empleado5 = new Empleado ("Elena", "Martín Paredes", 40, Datos.CARGO_3, Datos.PRECIO_HORA_OPERARIO, 
				"Parcial", Datos.BONIFICACION_T_PARCIAL);
		Empleado empleado6 = new Empleado ("Ana", "Flores Paredes", 40, Datos.CARGO_3, Datos.PRECIO_HORA_OPERARIO, 
				"Parcial", Datos.BONIFICACION_T_PARCIAL);
		Empleado empleado7 = new Empleado ("Ana", "Flores Paredes", 40, Datos.CARGO_3, Datos.PRECIO_HORA_OPERARIO, 
				"Parcial", Datos.BONIFICACION_T_PARCIAL);

		
		
		

		if (empleado6.equals(empleado7)) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}
		
		if (empleado4.equals(empleado7)) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}
		
		
		System.out.println(empleado6.hashCode());
		System.out.println(empleado7.hashCode());

		
		
		/*
		System.out.println(empleado1);
		System.out.println(empleado2);
		System.out.println(empleado3);
		System.out.println(empleado4);
		System.out.println(empleado5);
		
		System.out.println(empleado1.Sueldo());
*/
	}

}
