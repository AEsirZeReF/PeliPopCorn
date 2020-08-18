package Class;

public class Bocados {
	private int idBocado;
	private String nombreBocado;
	private String descripcionBocado;
	private double precioBocado;
	
	public Bocados(){
		
	}
	
	public Bocados(int idBocado,String nombreBocado,String descripcionBocado ,double precioBocado){
		this.idBocado = idBocado;
		this.nombreBocado = nombreBocado;
		this.descripcionBocado = descripcionBocado;
		this.precioBocado = precioBocado;
	}
	public int getIdBocado() {
		return idBocado;
	}
	public void setIdBocado(int idBocado) {
		this.idBocado = idBocado;
	}
	public String getNombreBocado() {
		return nombreBocado;
	}
	public void setNombreBocado(String nombreBocado) {
		this.nombreBocado = nombreBocado;
	}
	public String getDescripcionBocado() {
		return descripcionBocado;
	}
	public void setDescripcionBocado(String descripcionBocado) {
		this.descripcionBocado = descripcionBocado;
	}
	public double getPrecioBocado() {
		return precioBocado;
	}
	public void setPrecioBocado(double precioBocado) {
		this.precioBocado = precioBocado;
	}
	

	
	

}