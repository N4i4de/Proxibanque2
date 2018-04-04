package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * connexion et deconnexion à la BDD mysql
 * @author Morane
 *
 */
public abstract class DaoJdbc {
	private static String login = "root";
	private static String password = "";

	/**
	 * connexion à la BDD mySQL
	 * @return connection
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public Connection seConnecter() throws ClassNotFoundException, SQLException {
		Connection cnx = null;
		Class.forName("com.mysql.jdbc.Driver");
		cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/proxibanque2_morane_sandrine", "root", "");
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