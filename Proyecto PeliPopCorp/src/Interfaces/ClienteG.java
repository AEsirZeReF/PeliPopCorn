package Interfaces;

import java.util.ArrayList;

import Class.Cliente;
import Mantenimientos.ClienteM;

public class ClienteG {
	ClienteM clienteM;
	public ClienteG(){
		clienteM = new ClienteM();
	}
	public ArrayList<Cliente> ListarCliente(){
		return clienteM.ListarCliente();
	}
	public void AgregarCliente(Cliente cliente){
		clienteM.AgregarCliente(cliente);
	}
	public void ActualizarCliente(Cliente cliente){
		clienteM.ActualizarCliente(cliente);
	}
	public void EliminarCliente(int codigo){
		clienteM.EliminarCliente(codigo);
	}
}
