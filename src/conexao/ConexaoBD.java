package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class ConexaoBD {


	public static Connection conectar() {
		Connection con = null;

		final String URL = "jdbc:mysql://localhost:3306/sa01?useTimezone=true&serverTimezone=UTC";
		final String USER = "root";
		final String PASS = "!@#Abc123";

		try {
			con = DriverManager.getConnection(URL, USER, PASS);
			return con;
		} catch (Exception e) {
			return null;
	}

	}

	public static void desconectar(Connection con) {
		try {
			con.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "(n°1) Erro:" + e);
		}
	}
 }
