package unidades.unidad6.ejercicios.Ejercicio5;

public class Main {

    public static void main(String[] args) {
        
        MiNumero numero1 = new MiNumero();

        // Cambiar el número y realizar operaciones
        
        numero1.setNumero(10);
        numero1.suma(5);
        numero1.resta(3);

        // Mostrar información del primer número
        
        System.out.println("----Información del primer número----");
        numero1.mostrarInformacion();

        
        MiNumero numero2 = new MiNumero(20);

        // Mostrar información del segundo número
        
        System.out.println("\n----Información del segundo número----");
        numero2.mostrarInformacion();
    }
}