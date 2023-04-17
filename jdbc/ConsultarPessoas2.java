package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {
	
public static void main(String[] args) throws SQLException{
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um nome: ");
		String consulta = input.nextLine();
		
		

		Connection conexa = FabricaConexao.getConexao();
		
		String sql = "SELECT * FROM pessoas where nome like ?";
		
		PreparedStatement stmt = conexa.prepareStatement(sql);
		stmt.setString(1, "%" +consulta+ "%");
		
		
		
		ResultSet resultado = stmt.executeQuery();
		
		List<Pessoa> pessoas = new ArrayList<>();
 		
		while(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}
	
		for(Pessoa p : pessoas) {
			System.out.println(p.getCodigo()+  " ====> " + p.getNome());
		}
		
		input.close();
		stmt.close();
		conexa.close();
	}
}
