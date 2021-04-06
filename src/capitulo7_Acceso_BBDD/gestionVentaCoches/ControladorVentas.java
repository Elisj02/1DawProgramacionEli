package capitulo7_Acceso_BBDD.gestionVentaCoches;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class ControladorVentas {

	private static ControladorVentas instance = null;
	public Connection conn = null;
	private SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
	
	/**
	 * 
	 * @return
	 */
	public static ControladorVentas getInstance () {
		if (instance == null) {
			instance = new ControladorVentas();
		}
		return instance;
	}
	
	/**
	 * 
	 */
	public ControladorVentas() {
		
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
	public Ventas findPrimero () {
		Ventas v = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.venta order by id limit 1");
			if (rs.next()) {
				v = new Ventas();
				v.setId(rs.getInt("id"));
				v.setidCliente(rs.getInt("idCliente"));
				v.setidConcesionario(rs.getInt("idConcesionario"));
				v.setidCoche(rs.getInt("idCoche"));
				v.setFecha(rs.getDate("fecha"));
				v.setPrecioVenta(rs.getFloat("precioVenta"));


			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return v;
	}
	

	/**
	 * 
	 * @return
	 */
	public Ventas findUltimo () {
		Ventas v = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.venta order by id desc limit 1");
			if (rs.next()) {
				v = new Ventas();
				v.setId(rs.getInt("id"));
				v.setidCliente(rs.getInt("idCliente"));
				v.setidConcesionario(rs.getInt("idConcesionario"));
				v.setidCoche(rs.getInt("idCoche"));
				v.setFecha(rs.getDate("fecha"));
				v.setPrecioVenta(rs.getFloat("precioVenta"));

			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return v;
	}
	

	/**
	 * 
	 * @return
	 */
	public Ventas findSiguiente (int idActual) {
		Ventas v = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.venta where id > " + idActual + " order by id limit 1");
			if (rs.next()) {
				v = new Ventas();
				v.setId(rs.getInt("id"));
				v.setidCliente(rs.getInt("idCliente"));
				v.setidConcesionario(rs.getInt("idConcesionario"));
				v.setidCoche(rs.getInt("idCoche"));
				v.setFecha(rs.getDate("fecha"));
				v.setPrecioVenta(rs.getFloat("precioVenta"));

			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return v;
	}
	

	/**
	 * 
	 * @return
	 */
	public Ventas findAnterior (int idActual) {
		Ventas v = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.venta where id < " + idActual + " order by id desc limit 1");
			if (rs.next()) {
				v = new Ventas();
				v.setId(rs.getInt("id"));
				v.setidCliente(rs.getInt("idCliente"));
				v.setidConcesionario(rs.getInt("idConcesionario"));
				v.setidCoche(rs.getInt("idCoche"));
				v.setFecha(rs.getDate("fecha"));
				v.setPrecioVenta(rs.getFloat("precioVenta"));

				
				
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return v;
	}
	
	/**
	 * 
	 * @return
	 */
	public int modificar (Ventas v) {
		int registrosAfectados = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 
			
			String sql = "update venta set idCliente='" + v.getidCliente() + "', " +
					" idConcesionario='" + v.getidCliente() + "', idCoche='" + v.getidCoche() + "', fecha='" + formatoFecha.format(v.getFecha())+ "', precioVenta='" + v.getPrecioVenta() + "' where id=" + v.getId() + ";";

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
	public int nuevo (Ventas v) {
		int registrosAfectados = 0;
		int idNuevoRegistro = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 

			idNuevoRegistro = nextId();
			
			String sql = "insert into venta values(" + idNuevoRegistro + ", " +
					"'" + v.getidCliente() + "', '" + v.getidConcesionario() +  "', '" + v.getidCoche()+  "', '" + formatoFecha.format(v.getFecha())+  "', '" + v.getPrecioVenta() + "')";
			
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

		String sql = "select max(id) from tutorialjavacoches.venta";
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

			registrosAfectados = s.executeUpdate ("delete from venta where id=" + id + ";");
			
			// Cierre de los elementos
			s.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return registrosAfectados;
	}
	
}
