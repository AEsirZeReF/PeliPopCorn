package Utils;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class MySQLConexion {

	public static Connection getConection()  {
		Connection conexion = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/DBPELIPOPCORN?autoReconnect=true&useSSL=false";
			String user = "root";
			String password = "mysql";
			conexion = (Connection) DriverManager.getConnection(url,user,password);
		} catch (ClassNotFoundException ex) {
			System.out.println("No encontro el driver");
		}catch (SQLException e) {
			System.out.println("no se conecto en la base de datos");
		}
		
		
		return conexion;
	}

	
}
