package unidades.desdeCasa.ascensor;

public class Ascensor {
	
	 private int plantaActual = 1;
	 private boolean puerta = false; // false = cerrada, true = abierta

	    public int getPlantaActual() {
	        return plantaActual;
	    }

	    public boolean isPuerta() {
	        return puerta;
	    }

	    public void abrirPuerta() {
	        puerta = true;
	    }

	    public void cerrarPuerta() {
	        puerta = false;
	    }

	    public void subir() {
	        if (plantaActual < 5) {
	            plantaActual++;
	        }
	    }

	    public void bajar() {
	        if (plantaActual > 0) {
	            plantaActual--;
	        }
	    }
	

}
