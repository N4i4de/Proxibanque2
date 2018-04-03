package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class DaoJdbc {
	private static String login = "root";
	private static String password = "";

	public Connection seConnecter() throws ClassNotFoundException, SQLException {
		Connection cnx = null;
		Class.forName("com.mysql.jdbc.Driver");
		cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/formation", "root", "");
		return cnx;
	}

	protected void close(Connection cnx, PreparedStatement pstm, ResultSet rs) {
		try {
			if (cnx != null) {
				cnx.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			if (pstm != null) {
				pstm.close();
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}