package capitulo7_Acceso_BBDD.gestionVentaCoches;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ControladorCliente {

	private static ControladorCliente instance = null;
	public Connection conn = null;
	private SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
	
	/**
	 * 
	 * @return
	 */
	public static ControladorCliente getInstance () {
		if (instance == null) {
			instance = new ControladorCliente();
		}
		return instance;
	}
	
	/**
	 * 
	 */
	public ControladorCliente() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/tutorialjavacoches?serverTimezone=UTC","java", "123a");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		   

	}
	
	
	/**
	 * 
	 * @return
	 */
	public Cliente findPrimero () {
		Cliente c = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.cliente order by id limit 1");
			if (rs.next()) {
				c = new Cliente();
				c.setId(rs.getInt("id"));
				c.setNombre(rs.getString("nombre"));
				c.setApellidos(rs.getString("apellidos"));
				c.setLocalidad(rs.getString("localidad"));
				c.setDniNie(rs.getString("dniNie"));
				c.setFechaNac(rs.getDate("fechaNac"));
				c.setActivo(rs.getBoolean("activo"));

			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return c;
	}
	

	/**
	 * 
	 * @return
	 */
	public Cliente findUltimo () {
		Cliente c = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.cliente order by id desc limit 1");
			if (rs.next()) {
				c = new Cliente();
				c.setId(rs.getInt("id"));
				c.setNombre(rs.getString("nombre"));
				c.setApellidos(rs.getString("apellidos"));
				c.setLocalidad(rs.getString("localidad"));
				c.setDniNie(rs.getString("dniNie"));
				c.setFechaNac(rs.getDate("fechaNac"));
				c.setActivo(rs.getBoolean("activo"));
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return c;
	}
	

	/**
	 * 
	 * @return
	 */
	public Cliente findSiguiente (int idActual) {
		Cliente c = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.cliente where id > " + idActual + " order by id limit 1");
			if (rs.next()) {
				c = new Cliente();
				c.setId(rs.getInt("id"));
				c.setNombre(rs.getString("nombre"));
				c.setApellidos(rs.getString("apellidos"));
				c.setLocalidad(rs.getString("localidad"));
				c.setDniNie(rs.getString("dniNie"));
				c.setFechaNac(rs.getDate("fechaNac"));
				c.setActivo(rs.getBoolean("activo"));
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return c;
	}
	

	/**
	 * 
	 * @return
	 */
	public Cliente findAnterior (int idActual) {
		Cliente c = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.cliente where id < " + idActual + " order by id desc limit 1");
			if (rs.next()) {
				c = new Cliente();
				c.setId(rs.getInt("id"));
				c.setNombre(rs.getString("nombre"));
				c.setApellidos(rs.getString("apellidos"));
				c.setLocalidad(rs.getString("localidad"));
				c.setDniNie(rs.getString("dniNie"));
				c.setFechaNac(rs.getDate("fechaNac"));
				c.setActivo(rs.getBoolean("activo"));
				
				
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return c;
	}
	
	/**
	 * 
	 * @return
	 */
	public int modificar (Cliente c) {
		int activo = convertidorActivo(c);
		int registrosAfectados = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 
			
			String sql = "update cliente set nombre='" + c.getNombre() + "', " +
					" apellidos='" + c.getApellidos() + "', dniNie='" + c.getDniNie() + "', localidad='" + c.getLocalidad()+ "', fechaNac='" + formatoFecha.format(c.getFechaNac())+ "', activo='" + activo + "' where id=" + c.getId() + ";";

			registrosAfectados = s.executeUpdate (sql);
		   	
			// Cierre de los elementos
			s.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return registrosAfectados;
		
	}

	/**
	 * 
	 * @param f
	 * @return
	 */
	public int nuevo (Cliente c) {
		int registrosAfectados = 0;
		int idNuevoRegistro = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 

			int activo = convertidorActivo(c);
			idNuevoRegistro = nextId();
			
			String sql = "insert into cliente values(" + idNuevoRegistro + ", " +
					"'" + c.getNombre() + "', '" +c.getApellidos() +  "', '" +c.getLocalidad()+ "', '" +c.getDniNie() +  "', '" + formatoFecha.format(c.getFechaNac())+  "', '" + activo +
					 "')";
			
			registrosAfectados = s.executeUpdate (sql);
		   	
			// Cierre de los elementos
			s.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return idNuevoRegistro;

	}

	/**
	 * 
	 * @return
	 * @throws SQLException
	 */
	private int nextId () throws SQLException {
		Statement s = (Statement) this.conn.createStatement();

		String sql = "select max(id) from tutorialjavacoches.cliente";
		ResultSet rs = s.executeQuery(sql);
		int max = 1; 
		if (rs.next() ) {
			max = rs.getInt(1);
		}
		rs.close();
		s.close();
		return max + 1;
	}
	
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public int borrar(int id) {
		int registrosAfectados = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 

			registrosAfectados = s.executeUpdate ("delete from cliente where id=" + id + ";");
			
			// Cierre de los elementos
			s.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return registrosAfectados;
	}
	
public static int convertidorActivo(Cliente c) {
		
		if (c.isActivo()) {
			return 1;
		}
		
		return 0;
	}

public List<Cliente> findAll () {
	List<Cliente> cliente= new ArrayList<Cliente>();
	try {
		Statement s = this.conn.createStatement();
		ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.cliente");
		while (rs.next()) {
			Cliente c = new Cliente();
			c.setId(rs.getInt("id"));
			c.setNombre(rs.getString("nombre"));
			c.setApellidos(rs.getString("apellidos"));
			c.setLocalidad(rs.getString("localidad"));
			c.setDniNie(rs.getString("dniNie"));
			c.setFechaNac(rs.getDate("fechaNac"));
			c.setActivo(rs.getBoolean("activo"));
			
			cliente.add(c);

		}
	}
	catch (Exception ex) {
		ex.printStackTrace();
	}
	return cliente;
}


}
