package unidades.unidad11.ejemplos.json;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EscribirEmpleadosJson {

	public static void main(String[] args) {
		
		List<Empleado> empleados = new ArrayList<> ();
		
		empleados.add(new Empleado ("Tomás", 45, "Plasencia", new String[] {"Java", "PHP", "HTML"}));
		empleados.add(new Empleado ("Marta", 23, "Sevilla", new String[] {"Java", "PHP", "HTML"}));
		empleados.add(new Empleado ("Ana", 40, "Cáceres", new String[] {"Java", "MySql", "HTML"}));
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		try(FileWriter escritor = new FileWriter ("empleaosEmpresa.json")){
			
			gson.toJson(empleados, escritor);
			
			System.out.println("Archivo json creado correctamente");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
