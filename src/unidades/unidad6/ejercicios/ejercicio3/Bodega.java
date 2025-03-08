package unidades.unidad6.ejercicios.ejercicio3;

//Diseñe una case para representar los datos y funciones que pueden tener depósitos de una bodega de vino.

public class Bodega {
    public static void main(String[] args) {
        
        // Crear instancias de DepositoBodega
        DepositoBodega deposito1 = new DepositoBodega("D001", 10000, 5000, "Tinto", 2020);
        DepositoBodega deposito2 = new DepositoBodega("D002", 8000, 2000, "Blanco", 2021);

        // Mostrar información inicial de los depósitos
        System.out.println("Información inicial de los depósitos:");
        mostrarInformacionDeposito(deposito1);
        mostrarInformacionDeposito(deposito2);

        // Modificar la capacidad actual del primer depósito
        System.out.println("\nModificando la capacidad actual del depósito 1...");
        deposito1.setCapacidadActual(7000);

        // Cambiar el tipo de vino del segundo depósito
        System.out.println("Cambiando el tipo de vino del depósito 2...");
        deposito2.setTipoVino("Rosado");

        // Mostrar la información actualizada de los depósitos
        System.out.println("\nInformación actualizada de los depósitos:");
        mostrarInformacionDeposito(deposito1);
        mostrarInformacionDeposito(deposito2);

        // Verificar el uso de capacidad en el depósito 1
        System.out.println("\nCapacidad utilizada del depósito 1: " +
                ((deposito1.getCapacidadActual() / deposito1.getCapacidadMax()) * 100) + "%");

        // Verificar si el depósito 2 está vacío
        if (deposito2.getCapacidadActual() == 0) {
            System.out.println("El depósito 2 está vacío.");
        } else {
            System.out.println("El depósito 2 aún tiene vino.");
        }
    }

    // Método auxiliar para mostrar la información de un depósito
    public static void mostrarInformacionDeposito(DepositoBodega deposito) {
        System.out.println("ID del depósito: " + deposito.getIdDeposito());
        System.out.println("Capacidad máxima: " + deposito.getCapacidadMax() + " litros");
        System.out.println("Capacidad actual: " + deposito.getCapacidadActual() + " litros");
        System.out.println("Tipo de vino: " + deposito.getTipoVino());
        System.out.println("Año de cosecha: " + deposito.getAno());
        System.out.println("-----------------------------");
    }
}