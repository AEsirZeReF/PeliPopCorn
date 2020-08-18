package Class;

public class ListaFactura {
	private int idFactura;
	private String cliente;
	private String nombreCombo;
	private double precio;
	private int cantidad;
	private double subtotal;
	private String fecha;
	
	public ListaFactura(){
		
	}
	public ListaFactura(int idFactura,String cliente,String nombreCombo,
			double precio,int cantidad,double subtotal,String fecha){
		this.idFactura = idFactura;
		this.cliente = cliente;
		this.nombreCombo = nombreCombo;
		this.precio = precio;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
		this.fecha = fecha;
		
	}
	public int getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getNombreCombo() {
		return nombreCombo;
	}
	public void setNombreCombo(String nombreCombo) {
		this.nombreCombo = nombreCombo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
}
