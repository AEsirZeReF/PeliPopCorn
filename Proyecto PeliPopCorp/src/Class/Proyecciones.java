package Class;

public class Proyecciones {
	private int idProyecciones;
	private int idSala;
	private int butacas;
	private String tipoSala;
	private int idPelicula;
	private String nombrePelicula;
	private String hora;
	private Double precio;
	
	public Proyecciones(){
		
	}
	/*public Proyecciones(int idpro,int idsala,int idpel,String hora){
		this.idProyecciones = idpro;
		
		this.idSala = idsala;
		this.idPelicula = idpel;
		this.hora = hora;
	}*/
	public Proyecciones(int idpro,Double precio,int idsala,int butacas,String tipo,int idpel,String nombrePelicula,String hora){
		this.idProyecciones = idpro;
		this.idSala = idsala;
		this.idPelicula = idpel;
		this.hora = hora;
		this.butacas = butacas;
		this.tipoSala = tipo;
		this.nombrePelicula = nombrePelicula;
		this.precio = precio;
	}
	
	
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public int getButacas() {
		return butacas;
	}
	public void setButacas(int butacas) {
		this.butacas = butacas;
	}
	public String getTipoSala() {
		return tipoSala;
	}
	public void setTipoSala(String tipoSala) {
		this.tipoSala = tipoSala;
	}
	public String getNombrePelicula() {
		return nombrePelicula;
	}
	public void setNombrePelicula(String nombrePelicula) {
		this.nombrePelicula = nombrePelicula;
	}
	public int getIdProyecciones() {
		return idProyecciones;
	}

	public void setIdProyecciones(int idProyecciones) {
		this.idProyecciones = idProyecciones;
	}

	public int getIdSala() {
		return idSala;
	}

	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}

	public int getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
	
}
