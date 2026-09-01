package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Cliente;


public class ClienteDAO {
	
	public void inserirCliente(Cliente cliente) {
		String sql = "INSERT INTO cliente(nome, email, telefone) values(?, ?, ?)";
		
		try(Connection connection = Conexao.conection()){
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, cliente.getName());
			stmt.setString(2, cliente.getEmail());
			stmt.setString(3, cliente.getTelefone());
			
			stmt.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
