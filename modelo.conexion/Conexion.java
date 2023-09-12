package modelo.conexion;

import java.sql.*;


public class Conexion {
	String nombreBd = "paginaweb";
	String usuario = "root";
	String password = "";
	String url = "jdbc:mysql://localhost:3306/";
	String driver="com.mysql.cj.jdbc.Driver";
	Connection cx;
	
	public Conexion() {
	}
	
	public Connection conectar() { 
			try {
				Class.forName(driver);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Not found exception");
			}
			//obtener la conexion
			try {
				cx=DriverManager.getConnection(url+nombreBd, usuario, password);
				System.out.println("Se conecto correctamente a la BBDD");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("SQL Exception");
			}
			return cx;
	}
	
	public void desconectar() {
		try {
			cx.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[]args) {
		Conexion conexion=new Conexion();
		conexion.conectar(); 
	}
	
}
