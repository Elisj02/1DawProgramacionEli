package capitulo7_Acceso_BBDD.gestionVentaCoches;

import java.util.Date;

public class Ventas {
	
	private int id;
	private int idCliente;
	private int idConcesionario;
	private int idCoche;
	private Date fecha;
	private float precioVenta;

	
	public Ventas() {
		// TODO Auto-generated constructor stub
	}

	public Ventas(int id, int idCliente, int idConcesionario, int idCoche, float precioVenta, Date fecha) {
		super();
		this.id = id;
		this.idCliente = idCliente;
		this.idConcesionario = idConcesionario;
		this.idCoche = idCoche;
		this.fecha = fecha;
		this.precioVenta = precioVenta;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getidCliente() {
		return idCliente;
	}

	public void setidCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getidConcesionario() {
		return idConcesionario;
	}

	public void setidConcesionario(int idConcesionario) {
		this.idConcesionario = idConcesionario;
	}

	public int getidCoche() {
		return idCoche;
	}

	public void setidCoche(int idCoche) {
		this.idCoche = idCoche;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fechaVenta) {
		this.fecha = fechaVenta;
	}

	public float getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}
	
}