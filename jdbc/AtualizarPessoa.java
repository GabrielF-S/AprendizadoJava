package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarPessoa {
	public static void main(String[] args)throws SQLException {
		Scanner input = new Scanner(System.in);
		System.out.print("Informe o Id da pessoa que ira atualizar: ");
		int id = input.nextInt();
		
		Connection conexao = FabricaConexao.getConexao();
		String select = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
		String update = "UPDATE pessoas SET nome = ? WHERE  codigo = ?";
		
		PreparedStatement smtp = conexao.prepareStatement(select);
		smtp.setInt(1, id);
		ResultSet r = smtp.executeQuery();
				
		if(r.next()) {
			Pessoa p = new Pessoa(r.getInt(1), r.getString(2));
			System.out.println("O nome atual e " + p.getNome());
			input.nextLine();
			System.out.print("Informe o novo nome: ");
			String nome = input.nextLine();
			
			smtp.close();
			smtp = conexao.prepareStatement(update);
			smtp.setString(1, nome);
			smtp.setInt(2, id);
			smtp.execute();
			System.out.println("Alterado com sucesso: " + nome);
		}
		
		

		input.close();
		conexao.close();
		
	}

}
