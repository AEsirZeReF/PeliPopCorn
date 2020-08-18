package Class;

public class Cliente {
	
	private int idCliente;
	private String nombreCliente;
	private String apellidoCliente;
	private int edadCliente;
	
	public Cliente() {
		
	}
	public Cliente(int idCliente,String nombreCliente,String apellidoCliente,int edadCliente) {
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
		this.apellidoCliente = apellidoCliente;
		this.edadCliente = edadCliente;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getApellidoCliente() {
		return apellidoCliente;
	}
	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}
	public int getEdadCliente() {
		return edadCliente;
	}
	public void setEdadCliente(int edadCliente) {
		this.edadCliente = edadCliente;
	}
	
	
}
/*guardar
 * Usuario usuario = new Usuario();
			usuario.setId(Integer.parseInt(txtId.getText()));
			usuario.setNombre(txtNombre.getText());
			usuario.setApellido(txtApellido.getText());
			//
			UsuarioGestion usuGes = new UsuarioGestion();
			int ok = usuGes.Registrar(usuario);
			
			
			 txtArea.setText(usuario.getId()+"\n"+usuario.getNombre());
			
			if (ok == 0) {
				System.out.println("error");
			}else {
				System.out.println("Registro ok");
			}*/
/*UpDate
 * Usuario usu = new Usuario();
		usu.setId(Integer.parseInt(txtId.getText()));
		usu.setNombre(txtNombre.getText());
		usu.setApellido(txtApellido.getText());
		
		UsuarioGestion usuGes = new UsuarioGestion();
		int ok = usuGes.Update(usu);
		 txtArea.setText(usu.getId()+"\n"+usu.getNombre());
			
			if (ok == 0) {
				System.out.println("error");
			}else {
				System.out.println("Registro ok");
			}*/
