package unidad12.ejemplos.ejercicioUsiarios.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
	
	private static final String URL="jdbc:mysql://192.168.50.61:3306/ignacio_banos";
	private static final String USUARIO = "ignacio_banos";
	private static final String PASS = "1234";
	
	public static Connection conectar() throws SQLException {
		return DriverManager.getConnection(URL,USUARIO,PASS);
	}

}
