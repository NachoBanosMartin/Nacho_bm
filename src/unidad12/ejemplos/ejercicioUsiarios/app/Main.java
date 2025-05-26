package unidad12.ejemplos.ejercicioUsiarios.app;

import java.sql.SQLException;

import unidad12.ejemplos.ejercicioUsiarios.dao.ViajesTransporteDAO;

public class Main {
	
	public static final ViajesTransporteDAO viajes = new ViajesTransporteDAO();

	public static void main(String[] args) {
		
		
		
	
			try {
				crearTabla();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		

		
	}

	private static void crearTabla() throws SQLException{

		viajes.crearTabla();
	}

}
