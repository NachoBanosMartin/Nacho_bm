package unidades.unidad6.ejercicios.Ejercicio1;

/* 
Diseñe una clase que contenga los siguientes datos personales: nombre, dirección, 
edad y número de teléfono. Escriba los métodos de acceso y modificación adecuados.
*/

public class Personas {
    public static void main(String[] args) {
    	
        
        DatosPersonales persona1 = new DatosPersonales ("Juan Pérez", "Calle Principal 23", 30, "123456789 \n");
        DatosPersonales persona2 = new DatosPersonales("Octavio Martín", "Calle Granados 12", 37, "123765489");


        
        System.out.println("Información inicial:\n");
        persona1.mostrarInformacion();
        persona2.mostrarInformacion();
    }
}
