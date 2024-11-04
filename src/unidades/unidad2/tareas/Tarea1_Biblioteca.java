package unidades.unidad2.tareas;

public class Tarea1_Biblioteca {

	public static void main(String[] args) {
		
		// Usuarios de la biblioteca
		
			
			// Cada usuario tiene un número único de identificación de 5 dígitos.
		 		
			byte numero = 5; // El número es corto
			
			// El nombre completo del usuario se debe registrar.
			
			String nombreUsuario = ("Juan"); // Se usa string para palabras
			
			// Se debe almacenar la fecha de nacimiento del usuario.
			
			String nacimiento = ("24/2/2012"); // Aun no hemos visto nada para fechas por lo tanto he usado string 
			
			// Cada usuario tiene un número de teléfono asociado.
			
			int telefono = 654322432; // Para números entre x caracteres
			
			// Los usuarios pueden tener hasta 5 libros reservados al mismo tiempo.
			
			byte reservas = 5; // Para números cortos
			
			// Se debe guardar la fecha en que el usuario se registró en el sistema.
			
			String fechaRegistro = ("26/11/2018"); // Aun no hemos visto nada para fechas por lo tanto he usado string 
			
			
		// Libros:	
			
			
			// Cada libro tiene un número de identificación de 13 dígitos (ISBN).
			
			long identificacion = 3425123498765L; // Para los números más largos
			
			//Se debe registrar el título y el nombre del autor del libro.
			
			String titulo = ("El rio"); // Se usa string para palabras
			String autor = ("Luis Martín"); // Se usa string para palabras
			
			// Los libros tienen un precio de reposición (en caso de pérdida o daño).
			
			double daño = 12.5; // Se usa double cuando el número tiene coma
			
			// Cada libro tiene una fecha de publicación.
			
			String fechaPublicacion = ("12/11/2020"); // Aun no hemos visto nada para fechas por lo tanto he usado string
			
			// Se debe almacenar la cantidad de ejemplares disponibles en la biblioteca.
			
			short ejemplares = 4500; // Para números hasta 65.536
			
			
		// Reservas:
			
			
			// Cada reserva tiene un número único de reserva.
			
			byte reserva = 33; // Se usa byte para números cortos
			
			// Se debe registrar la fecha y la hora en que se realizó la reserva.
			
			String fechaReserva = ("26/11/2023"); // Se usa string para palabras
			String horaReserva = ("20:12"); // Se usa string para palabras
			
			// Cada reserva tiene un estado (activo, cancelado, completado).
			
			String estado = ("activo"); // Se usa string para palabras
			
			// Los libros reservados deben estar disponibles para ser recogidos en un plazo de 3 días.
			
			byte recogido= 3; // Se usa byte para números cortos
	}

}
