package unidades.unidad6.ejercicios.ejercicio4;

/*
La serigrafía de tu pueblo pretende crear una aplicación para organizar los datos de las camisetas
que ofrece en su catálogo. Nos indica que quiere recoger la siguiente información: identificador, 
descripción, material, color, precio y cantidad en stock. Defina una clase que permita modelar dicha
información. Además, esta clase tendrá un método que permita mostrar por pantalla los datos de la 
camiseta. Crear una clase ProgramaCamiseta con un método main que utilice la clase creada.
*/

public class Main {

    public static void main(String[] args) {
        
    	
        ProgramaCamiseta camiseta = new ProgramaCamiseta ("D2322", "Manga Corta", "Algodón", "Negro", 11.50, 250);

        
        System.out.println("-----Datos de la camiseta-----\n");
        camiseta.mostrarInformacion();
    }
}
