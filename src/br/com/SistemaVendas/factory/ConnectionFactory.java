package br.com.SistemaVendas.factory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private static String url = "jdbc:mysql://localhost:3306/sistemadevendasdb";
	private static String username = "root";
	private static String senha = "";
	
	public static Connection getConnection(){
		Connection conexao = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			conexao = DriverManager.getConnection(url,username,senha);
		} catch (SQLException e) {
			System.out.println("Conexão não inicada");
			e.printStackTrace();
		}
		
		return conexao;
	}

}
