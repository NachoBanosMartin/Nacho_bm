package unidad12.ejemplos.ejercicioUsiarios.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import unidad12.ejemplos.ejercicioUsiarios.modelos.ViajesTransporte;


public class ViajesTransporteDAO {
	
	public void crearTabla() throws SQLException{
		
		String sql = "CREATE TABLE viajesTransporte (id INT PRIMARY KEY, matricula VARCHAR(20), nombre VARCHAR(100), origen VARCHAR(100), destino VARCHAR(100), carga VARCHAR(100), cantidad FLOAT, tipoCarga VARCHAR(100)) ENGINE  = InnoDB";
				
		
		try(
				Connection con = ConexionDB.conectar();	
				PreparedStatement stmt = con.prepareStatement(sql);
			
				)
			    {
					stmt.executeUpdate();
					
				}		
		
		
		
	}


}
