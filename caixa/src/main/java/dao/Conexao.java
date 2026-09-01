package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	public static Connection conection() {
		String url = "jdbc:postgresql://localhost:5432/caixa";
		String user = "postgres";
		String password = "#Fla140499";
		try {
			Connection conexao = DriverManager.getConnection(url, user, password);
			return conexao;
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}
}
