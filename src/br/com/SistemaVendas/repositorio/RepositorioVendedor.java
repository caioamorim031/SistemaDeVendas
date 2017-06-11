package br.com.SistemaVendas.repositorio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.SistemaVendas.factory.ConnectionFactory;
import br.com.SistemaVendas.model.Vendedor;

public class RepositorioVendedor {

	public void novoVendedor(Vendedor Vend){
		
		String sql = "insert into sistemadevendasdb.vendedor (senha_vend,nome_vend,end_vend,sal_vend,tipo_vend) values (?,?,?,?,?)";
		try {
			Connection conexao = ConnectionFactory.getConnection();
			PreparedStatement statement = conexao.prepareStatement(sql);
			
			statement.setString(1, Vend.getSenha());
			statement.setString(2, Vend.getNome());
			statement.setString(3, Vend.getEndereco());
			statement.setDouble(4, Vend.getSalarioM());
			statement.setInt(5, Vend.getTipo());
			
			statement.execute();
			conexao.commit();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
