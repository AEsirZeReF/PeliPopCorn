package Class;

public class Compra {
	private int idTicket;
	private int idCliente;
	private int idProyeccion;
	private String fechaTicket;
	private int cantidadTicket;
	private int idFactura;
	private int idBocado;
	private String fechaBocado;
	private int cantidadBocado;
	
	public Compra(){
		
	}
	public Compra(int idTicket,int idCliente,int idProyeccion,String fechaTicket,int cantidadTicket){
		this.idTicket= idTicket;
		this.idCliente = idCliente;
		this.idProyeccion = idProyeccion;
		this.fechaTicket = fechaTicket;
		this.cantidadTicket=cantidadTicket;
	}
	public Compra(int idTicket,int idCliente,int idProyeccion,String fechaTicket,int cantidadTicket
			,int idFactura,int idBocado,String fechaBocado,int cantidadBocado){
		this.idTicket = idTicket;
		this.idCliente = idCliente;
		this.idProyeccion = idProyeccion;
		this.fechaTicket = fechaTicket;
		this.cantidadTicket = cantidadTicket;
		this.idFactura = idFactura;
		this.idBocado = idBocado;
		this.fechaBocado = fechaBocado;
		this.cantidadBocado = cantidadBocado;
		
	}
	public int getIdTicket() {
		return idTicket;
	}
	public void setIdTicket(int idTicket) {
		this.idTicket = idTicket;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public int getIdProyeccion() {
		return idProyeccion;
	}
	public void setIdProyeccion(int idProyeccion) {
		this.idProyeccion = idProyeccion;
	}
	public String getFechaTicket() {
		return fechaTicket;
	}
	public void setFechaTicket(String fechaTicket) {
		this.fechaTicket = fechaTicket;
	}
	public int getCantidadTicket() {
		return cantidadTicket;
	}
	public void setCantidadTicket(int cantidadTicket) {
		this.cantidadTicket = cantidadTicket;
	}
	public int getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}
	public int getIdBocado() {
		return idBocado;
	}
	public void setIdBocado(int idBocado) {
		this.idBocado = idBocado;
	}
	public String getFechaBocado() {
		return fechaBocado;
	}
	public void setFechaBocado(String fechaBocado) {
		this.fechaBocado = fechaBocado;
	}
	public int getCantidadBocado() {
		return cantidadBocado;
	}
	public void setCantidadBocado(int cantidadBocado) {
		this.cantidadBocado = cantidadBocado;
	}
	
	
	

}
