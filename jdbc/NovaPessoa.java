package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
	public static void main(String[] args) throws SQLException {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Informe o nome: ");
		
		String nome = input.nextLine();
		
		Connection conexa = FabricaConexao.getConexao();
		
		String sql = "INSERT INTO pessoas(nome) VALUES(?)";
		
		PreparedStatement stmt = conexa.prepareStatement(sql);
		
		stmt.setString(1, nome);
		
		
		stmt.execute();
		
		System.out.println("Cadastro concluido com sucesso!");
		
		input.close();
		
	}

}
