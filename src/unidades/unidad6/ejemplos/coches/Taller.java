package unidades.unidad6.ejemplos.coches;

public class Taller { //

	public static void main(String[] args) {
		
	Coche coche1 = new Coche ("Audi","A3", 2014);	
	
	
	Motor motor1 = new Motor ('G', 180, 3000);
	coche1.setMotor(motor1);

		
	Revision revision1 = new Revision (1, 2, 2023, "Ruedas", 'B', 0);
	Revision revision2 = new Revision (2, 5, 2024, "Aceite y Filtros", 'M', 0);
	Revision revision3 = new Revision (3, 11, 2024, "Distribución", 'M', 0);

	Revision [] revisiones = new Revision[10];
	revisiones [0] = revision1;
	revisiones [1] = revision2;
	revisiones [2] = revision3;

	coche1.setRevision(revisiones);
	
	System.out.println(coche1);
	
	Revision revision4 = new Revision (4, 1, 2025, "Frenos y Pastillas", 'M', 1200);
	coche1.addRevision(revision4);
	
	System.out.println(coche1);
	Revision revision = coche1.obtenerRevisionPorId(3);
	System.out.println(revision);
	
	//coche1.mostrarDatos();

	}

}
