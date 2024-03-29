package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConcultarPessoas1 {
	public static void main(String[] args) throws SQLException{
		
		Connection conexa = FabricaConexao.getConexao();
		
		String sql = "SELECT * FROM pessoas";
		
		Statement stmt = conexa.createStatement();
		
		ResultSet resultado = stmt.executeQuery(sql);
		
		List<Pessoa> pessoas = new ArrayList<>();
 		
		while(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}
	
		for(Pessoa p : pessoas) {
			System.out.println(p.getCodigo()+  " ====> " + p.getNome());
		}
		
		stmt.close();
		conexa.close();
		
	}

}
