package capitulo7_Acceso_BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Act1_mostrar_crear_borrar {
	private static boolean LOG = true;
	private static int CONT_NOTIFICACION_INSERCION = 10;


	public static void main(String[] args) {
		int opcion;
		do {
			opcion = menu();
			
			switch (opcion) {
			case 0: // Ha elegido abandonar la aplicación
				System.out.println("HAS ABANDONADO LA APLICACIÓN.");
				break;
			case 1: //Visualizar
				pruebaConsultaBasica();
				
				break;
			case 2: // Agregar fabricantes
				try {
					creacionDatosFabricantes();
				} catch (SQLException | ImposibleConectarException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
			case 3: //Eliminar fabricantes

				try {
					borrarFabricante();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			default:
				System.out.println("Opción no válida");
			}
			
			// El bucle se repetirá mientras no se pulse la opción de salir.
		} while (opcion != 0);
	}
	
	public static int menu () {
		String strMenu = "\n\nMenú"
				+ "\n0.- Salir"
				+ "\n1.- Visualizar "
				+ "\n2.- Agregar un fabricante"
				+ "\n3.- Eliminar un fabricante"
				+ "\n\nIntroduzca su opción: ";
		// Muestro el menú y pido una opción al usuario
		int opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog(strMenu));
		// Devuelvo la opción seleccionada
		return opcionUsuario;
	}
	
	private static void pruebaConsultaBasica () {
		try {
			// A trav�s de la siguiente l�nea comprobamos si tenemos acceso al driver MySQL, si no fuera as�
			// no podemos trabajar con esa BBDD.
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			// Necesitamos obtener un acceso a la BBDD, eso se materializa en un objeto de tipo Connection, al cual
			// le tenemos que pasar los par�metros de conexi�n.
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://127.0.0.1/tutorialjavacoches?serverTimezone=UTC","java", "123a");
		   
			
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) conexion.createStatement(); 
			
			// La ejecuci�n de la consulta se realiza a trav�s del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery ("select * from fabricante");
		   
			// Navegaci�n del objeto ResultSet
			while (rs.next()) { 
				System.out.println (rs.getInt("id") + " " + rs.getString(2) + " " + rs.getString(3)); 
			}
			// Cierre de los elementos
			rs.close();
			s.close();
			conexion.close();
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	private static void creacionDatosFabricantes () throws SQLException, ImposibleConectarException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
		// Necesitamos obtener un acceso a la BBDD, eso se materializa en un objeto de tipo Connection, al cual
		// le tenemos que pasar los par�metros de conexi�n.
		Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://127.0.0.1/tutorialjavacoches?serverTimezone=UTC","java", "123a");
	   
		
		
		Statement s = (Statement) conexion.createStatement();
		int registrosInsertados;
		int contRegistrosInsertados = 0;		
		
		if (LOG)
			System.out.println("\nInsertando registros de en la tabla fabricante");

			
			String cif;
			cif = JOptionPane.showInputDialog("Introduce el cif del fabricante: ");
			
			String nombre;
			nombre = JOptionPane.showInputDialog("Introduce el nombre del fabricante: ");
			
			String sql = "INSERT INTO tutorialjavacoches.fabricante (id, cif, nombre) " +
					"VALUES  (" + nextIdEnTabla(conexion, "fabricante") + ", '" + cif + "', '" + nombre + "')";
			registrosInsertados = s.executeUpdate(sql);
			if (registrosInsertados != 1) {
				throw new SQLException ("No ha sido posible la inserci�n con la cadena:\n" + sql);
			}
			contRegistrosInsertados++;
			if (contRegistrosInsertados % CONT_NOTIFICACION_INSERCION == 0 && LOG) {
				System.out.println("\t" + contRegistrosInsertados + " registros insertados en tabla fabricante");
			
		}
		s.close();
	}
	
	
	private static int nextIdEnTabla (Connection conn, String tabla) throws SQLException {
		return maxIdEnTabla(conn, tabla) + 1;
	}
	
	private static int maxIdEnTabla (Connection conn, String tabla) throws SQLException {
		Statement s = (Statement) conn.createStatement();

		String sql = "select max(id) from tutorialjavacoches." + tabla;
		ResultSet rs = s.executeQuery(sql);
		int max = 1; 
		if (rs.next() ) {
			max = rs.getInt(1);
		}
		rs.close();
		s.close();
		return max;
	}
	
	private static void borrarFabricante () throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
		// Necesitamos obtener un acceso a la BBDD, eso se materializa en un objeto de tipo Connection, al cual
		// le tenemos que pasar los par�metros de conexi�n.
		Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://127.0.0.1/tutorialjavacoches?serverTimezone=UTC","java", "123a");
	   
		
		Statement s = (Statement) conexion.createStatement();
		
		int registrosBorrados;
		int contRegistrosBorrados = 0;	
		
		if (LOG)
			System.out.println("\nEliminando registros de en la tabla fabricante");
		
		int id;
		id = Integer.parseInt(JOptionPane.showInputDialog("Introduce el id del fabricante: "));
		
		
		String sql = "DELETE FROM tutorialjavacoches.fabricante WHERE id ='" + id + "'";
		registrosBorrados = s.executeUpdate(sql);
		if (registrosBorrados != 1) {
			throw new SQLException ("No ha sido posible la inserci�n con la cadena:\n" + sql);
		}
		contRegistrosBorrados++;
		if (contRegistrosBorrados % CONT_NOTIFICACION_INSERCION == 0 && LOG) {
			System.out.println("\t" + contRegistrosBorrados + " registros insertados en tabla fabricante");
		
	}
	s.close();
}

}
