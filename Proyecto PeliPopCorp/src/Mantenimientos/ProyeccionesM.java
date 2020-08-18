package Mantenimientos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.mysql.jdbc.CallableStatement;

import Class.Proyecciones;
import Utils.MySQLConexion;

public class ProyeccionesM {
	private Connection con;
	private CallableStatement call;
	private ArrayList<Proyecciones> listaProyecciones;
	private int rs;
	private ResultSet res;
	MySQLConexion mysql;
	
	public ProyeccionesM(){
		
		mysql = new MySQLConexion();
	}
	public void AgregarProyecciones(Proyecciones proyecciones){
		try {
			con = mysql.getConection();
			call = (CallableStatement) con.prepareCall("call AgregarProyecciones(?,?,?,?)");
			call.setInt(1, proyecciones.getIdSala());
			call.setInt(2, proyecciones.getIdPelicula());
			call.setString(3, proyecciones.getHora());
			call.setDouble(4, proyecciones.getPrecio());
			rs = call.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Se agrego una nueva proyeccion");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(con != null){
					con.close();
				}
				if(call != null){
					call.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void ActualizarProyecciones(Proyecciones proyecciones){
		try {
			con = mysql.getConection();
			call = (CallableStatement) con.prepareCall("call ActualizarProyecciones(?,?,?,?,?)");
			call.setInt(1, proyecciones.getIdSala());
			call.setInt(2, proyecciones.getIdPelicula());
			call.setString(3, proyecciones.getHora());
			call.setDouble(4, proyecciones.getPrecio());
			call.setInt(5, proyecciones.getIdProyecciones());
			rs = call.executeUpdate();
			JOptionPane.showMessageDialog(null, "Se actualizo la proyeccion");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(con != null){
					con.close();
				}
				if(call != null){
					call.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public ArrayList<Proyecciones> ListarProyecciones(){
		 listaProyecciones = new ArrayList<>();
		try {
			con = mysql.getConection();
			call = (CallableStatement) con.prepareCall("call ListarProyecciones()");
			res = call.executeQuery();
			while(res.next()){
				Proyecciones pro = new Proyecciones(res.getInt(1),res.getDouble(2),res.getInt(3),res.getInt(4),res.getString(5),res.getInt(6), res.getString(7),res.getString(8));
				listaProyecciones.add(pro);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(con != null){
					con.close();
				}
				if(call != null){
					call.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return listaProyecciones;
	}
	public void EliminarProyeccion(int Codigo){
		try {
			con = mysql.getConection();
			call = (CallableStatement) con.prepareCall("call EliminarProyeccion(?)");
			call.setInt(1, Codigo);
			rs = call.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Se elimino satisfactoriamente");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(con != null){
					con.close();
				}
				if(call != null){
					call.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
