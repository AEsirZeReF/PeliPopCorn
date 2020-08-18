package Mantenimientos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.mysql.jdbc.CallableStatement;

import Class.Cliente;
import Class.Peliculas;
import Utils.MySQLConexion;

public class ClienteM {
	private Connection con;
	private CallableStatement call;
	private ArrayList<Cliente> listaCliente;
	private int rs;
	private ResultSet res;
	MySQLConexion mysql;
	
	public ClienteM(){
		
		mysql = new MySQLConexion();
	}
	public void AgregarCliente(Cliente cliente){
		try {
			con = mysql.getConection();
			call = (CallableStatement) con.prepareCall("call AgregarCliente(?,?,?)");
			call.setString(1, cliente.getNombreCliente());
			call.setString(2, cliente.getApellidoCliente());
			call.setInt(3, cliente.getEdadCliente());
			rs = call.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "se agrego un nuevo cliente");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try{
				if(con != null){
					con.close();
				}
				if(call != null){
					call.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
	public void ActualizarCliente(Cliente cliente){
		try {
			con = mysql.getConection();
			call = (CallableStatement) con.prepareCall("call ActualizarCliente(?,?,?,?)");
			call.setString(1, cliente.getNombreCliente());
			call.setString(2, cliente.getApellidoCliente());
			call.setInt(3, cliente.getEdadCliente());
			call.setInt(4, cliente.getIdCliente());
			rs = call.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "se acaba de actualuzar un cliente");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try{
				if(con != null){
					con.close();
				}
				if(call != null){
					call.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
	public void EliminarCliente(int codigo){
		try {
			con = mysql.getConection();
			call = (CallableStatement) con.prepareCall("call EliminarCliente(?)");
			call.setInt(1, codigo);
			rs = call.executeUpdate();
			JOptionPane.showMessageDialog(null, "se elimino satisfactoriamente");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try{
				if(con != null){
					con.close();
				}
				if(call != null){
					call.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
	public ArrayList<Cliente> ListarCliente(){
		listaCliente = new ArrayList<>();
		try {
			con = mysql.getConection();
			call = (CallableStatement) con.prepareCall("call ListarCliente()");
			res = call.executeQuery();
			while(res.next()){
				Cliente cliente = new Cliente(res.getInt(1),
						res.getString(2), res.getString(3), res.getInt(4));
				listaCliente.add(cliente);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try{
				if(con != null){
					con.close();
				}
				if(call != null){
					call.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return listaCliente;
	}
	

}
