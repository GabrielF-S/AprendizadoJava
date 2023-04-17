package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoas {
	public static void main(String[] args) throws SQLException {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Informe o codigo: ");
		int codigo = input.nextInt();

		
		Connection conexao = FabricaConexao.getConexao();
		
		String sql = "DELETE FROM pessoas WHERE codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);
		
		if(stmt.executeUpdate()> 0) {
			System.out.println("Pessoa excluida com sucesso!");
			
		}else {
			System.out.println("Nada feito!");
		}
		
		
		
		
		input.close();
		conexao.close();
		
	}

}
