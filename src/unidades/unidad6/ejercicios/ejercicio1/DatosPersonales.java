package unidades.unidad6.ejercicios.ejercicio1;

/* 
 Diseñe una clase que contenga los siguientes datos personales: nombre, dirección, 
 edad y número de teléfono. Escriba los métodos de acceso y modificación adecuados.
*/

public class DatosPersonales {
    // Atributos de la clase
    private String nombre;
    private String direccion;
    private int edad;
    private String telefono;

    // Constructor con parámetros
    public DatosPersonales(String nombre, String direccion, int edad, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
        this.telefono = telefono;
    }

    // Métodos de acceso (getters)
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getEdad() {
        return edad;
    }

    public String getTelefono() {
        return telefono;
    }

    // Métodos de modificación (setters)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + telefono);
    }
}
