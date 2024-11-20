package unidades.unidad5.ejercicios;

import java.util.Scanner;

public class DonacionesAmpliación {

    static Scanner entrada = new Scanner(System.in);
    static final int NUM_MAQUINAS = 6; // Las constantes siempre en mayúsculas

    public static void main(String[] args) {

        int maquinas[] = new int[NUM_MAQUINAS];
        String pueblos[] = new String[NUM_MAQUINAS];
        int maximo, minimo;
        double media;
        String localidadMaximo, localidadMinimo;

        leerDatos(maquinas, pueblos);

        maximo = obtenerMaximoDonaciones(maquinas);
        minimo = obtenerMinimoDonaciones(maquinas);
        media = obtenerMediaDonaciones(maquinas);
        localidadMaximo = obtenerLocalidad(maquinas, pueblos, maximo);
        localidadMinimo = obtenerLocalidad(maquinas, pueblos, minimo);
        mostrarDatos(maximo, minimo, media, localidadMaximo, localidadMinimo);

    }

    static int obtenerMaximoDonaciones(int[] maquinas) {

        int maximo = maquinas[0];
        for (int i = 1; i < maquinas.length; i++) {
            if (maquinas[i] > maximo) {
                maximo = maquinas[i];
            }
        }

        return maximo;
    }

    static int obtenerMinimoDonaciones(int[] maquinas) {

        int minimo = maquinas[0];
        for (int i = 1; i < maquinas.length; i++) {
            if (maquinas[i] < minimo) {
                minimo = maquinas[i];
            }
        }

        return minimo;
    }

    static void leerDatos(int[] maquinas, String[] pueblos) {

        for (int i = 0; i < NUM_MAQUINAS; i++) {
            System.out.println("Introduzca las donaciones de la máquina " + (i + 1) + ":");
            maquinas[i] = entrada.nextInt();
            System.out.println("Introduzca el nombre del pueblo de la máquina " + (i + 1) + ":");
            pueblos[i] = entrada.next();
        }
    }

    static double obtenerMediaDonaciones(int[] maquinas) {
        double media;
        int suma = 0;
        for (int i = 0; i < maquinas.length; i++) {
            suma = suma + maquinas[i];
        }
        media = (double) suma / NUM_MAQUINAS;
        return media;
    }

    static String obtenerLocalidad(int[] maquinas, String[] pueblos, int valor) {
        for (int i = 0; i < maquinas.length; i++) {
            if (maquinas[i] == valor) {
                return pueblos[i];
            }
        }
        return "";
    }

    static void mostrarDatos(int maximo, int minimo, double media, String localidadMaximo, String localidadMinimo) {

        System.out.println("El máximo de donaciones ha sido: " + maximo + " en " + localidadMaximo);
        System.out.println("El mínimo de donaciones ha sido: " + minimo + " en " + localidadMinimo);
        System.out.println("La media de donaciones ha sido: " + media);

    }
}