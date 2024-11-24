package unidades.unidad3.ejercicios;

public class Ejercicio15 {
	
	/* Suponga que la población de bovino de la provincia Cáceres es de 354000 y que la población aumenta 1.01 por ciento
	   anualmente. Suponga que la población de ovino de Badajoz es de 410000 y que la población se reduce 0,15 por ciento
	   anual. Escribir una aplicación que muestra las poblaciones de las dos provincias cada año hasta que la población 
	   de Cáceres exceda a la de los Badajoz, y muestre el número de años que se necesitó para superar. Guarde el archivo
	   como PoblacionBovina.java. */

	public static void main(String[] args) {

		int bovinoCaceres = 354000;
		int ovinoBadajoz = 410000;
		double tasaCrecimientoCaceres = 1.01 / 100;
		double tasaReduccionBadajoz = 0.15 / 100;
		int anio = 0;
				
		while (bovinoCaceres <= ovinoBadajoz) {
			bovinoCaceres += bovinoCaceres * tasaCrecimientoCaceres;
			ovinoBadajoz -= ovinoBadajoz * tasaReduccionBadajoz;
			anio++;
			System.out.printf("Año %d: Cáceres = %.2f, Badajoz = %.2f%n", anio, (double)bovinoCaceres, (double)ovinoBadajoz);
		}
		
		System.out.printf("Se necesitaron %d años para que la población de Cáceres supere a la de Badajoz.%n", anio);
	}
}
