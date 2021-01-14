package capitulo4_bloque1_primeros_objetos.articulosComestibles;

public class Producto {


	String nombreProducto;
	int codigo;
	float precio;
	
	public Producto(){
		
	}
	public Producto(String nombreProducto, int codigo, float precio){
		this.nombreProducto = nombreProducto;
		this.codigo = codigo;
		this.precio = precio;
		
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Producto [nombreProducto=" + nombreProducto + ", codigo=" + codigo + ", precio=" + precio + "]";
	}
}
