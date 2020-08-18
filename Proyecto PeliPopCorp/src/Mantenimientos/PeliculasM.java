package Mantenimientos;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.mysql.jdbc.CallableStatement;

import Class.Peliculas;
import Utils.MySQLConexion;

public class PeliculasM {
	private Connection con;
	private CallableStatement call;
	private ArrayList<Peliculas> listaPeliculas;
	private int rs;
	private ResultSet result;
	MySQLConexion mysql;
	
	public PeliculasM(){
		
		mysql = new MySQLConexion();
	}
	
	public void AgregarPeliculas(Peliculas pelicula){
		try {
			con = mysql.getConection();
			call = (CallableStatement) con.prepareCall("call AgregarPelicula(?,?,?,?,?,?)");
			call.setInt(1,pelicula.getIdClasificacion());
			call.setString(2, pelicula.getNombrePelicula());
			call.setString(3, pelicula.getGeneroPelicula());
			call.setString(4, pelicula.getDescripcionPelicula());
			call.setString(5, pelicula.getDuracionPelicula());
			call.setString(6, pelicula.getEstrenoPelicula());
			rs = call.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "se agrego una nueva pelicula");
			//values (idClasificacion,nombre,genero,descripcion,duracion,fecha);
			
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
	public void ActualizarPeliculas(Peliculas pelicula){
		try {
			con = mysql.getConection();
			call = (CallableStatement) con.prepareCall("call ActualizarPelicula(?,?,?,?,?,?,?)");
			call.setString(1, pelicula.getNombrePelicula());
			call.setInt(2,pelicula.getIdClasificacion());
			call.setString(3, pelicula.getGeneroPelicula());
			call.setString(4, pelicula.getDescripcionPelicula());
			call.setString(5, pelicula.getDuracionPelicula());
			call.setString(6, pelicula.getEstrenoPelicula());
			call.setInt(7, pelicula.getIdPelicula());
			rs = call.executeUpdate();
			
			JOptionPane.showMessageDialog(null , "se actulizo satisfactoriamente");
			
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
	public void EliminarPeliculas(int codigo){
		try {
			con = mysql.getConection();
			call = (CallableStatement) con.prepareCall("call EliminarPelicula(?)");
			call.setInt(1, codigo);
			rs = call.executeUpdate();
			JOptionPane.showMessageDialog(null, "Se elimino satisfactoriamente: "+codigo);
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
	public ArrayList<Peliculas> ListarPeliculas(){
		listaPeliculas = new ArrayList<>();
		try {
			con = mysql.getConection();
			call =  (CallableStatement) con.prepareCall("call ListarPeliculas()");
			result = call.executeQuery();
			while(result.next()){
				Peliculas peli = new Peliculas(
						result.getInt(1),
						result.getInt(2),
						result.getString(3),
						result.getString(4),
						result.getString(5),
						result.getString(6),
						result.getString(7),
						result.getString(8)
						);
				listaPeliculas.add(peli);
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
		return listaPeliculas;
	}

}
