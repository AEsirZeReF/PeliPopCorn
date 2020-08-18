package Class;

public class ListaTicket {
	private int idTicket;
	private String nombrePelicula;
	private int idSala;
	private String tipoSala;
	private String horaPro;
	private String cliente;
	private double precio;
	private int cantidad;
	private double subtotal;
	private String fecha;
	
	public ListaTicket(){
		
	}
	public ListaTicket(int idTicket,String nombrePelicula,int idSala,String tipoSala,String horaPro,
			String cliente,double precio,int cantidad,double subtotal,String fecha){
		this.idTicket= idTicket;
		this.nombrePelicula = nombrePelicula;
		this.idSala = idSala;
		this.tipoSala = tipoSala;
		this.horaPro = horaPro;
		this.cliente = cliente;
		this.precio = precio;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
		this.fecha = fecha;
		
	}
	
	public int getIdTicket() {
		return idTicket;
	}
	public void setIdTicket(int idTicket) {
		this.idTicket = idTicket;
	}
	public String getNombrePelicula() {
		return nombrePelicula;
	}
	public void setNombrePelicula(String nombrePelicula) {
		this.nombrePelicula = nombrePelicula;
	}
	public int getIdSala() {
		return idSala;
	}
	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}
	public String getTipoSala() {
		return tipoSala;
	}
	public void setTipoSala(String tipoSala) {
		this.tipoSala = tipoSala;
	}
	public String getHoraPro() {
		return horaPro;
	}
	public void setHoraPro(String horaPro) {
		this.horaPro = horaPro;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
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
