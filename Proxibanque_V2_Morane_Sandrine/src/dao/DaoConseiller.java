package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Client;
import model.Conseiller;

/**
 * realise les actions de CRUD dans la base de données mysql
 * @author Sandrine
 * 
 *
 */
public class DaoConseiller extends DaoJdbc implements InterfaceDaoConseiller {

	@Override
	public void saveConseiller(Conseiller conseiller) {
		// TODO Auto-generated method stub
		Connection cnx = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;

		try {
			cnx = seConnecter();
			String s = "insert into conseiller (nom, idconseiller, login, password,) values ( ?, ?, ?, ?)";
			pstm = cnx.prepareStatement(s);
			pstm.setString(1, conseiller.getNom());
			pstm.setInt(2, conseiller.getIdconseiller());
			pstm.setString(3, conseiller.getLogin());
			pstm.setString(4, conseiller.getPassword());
			pstm.executeUpdate();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(cnx, pstm, rs);
		}

	}


	@Override
	public Conseiller GetByLoginConseiller(String loginConseiller) {
			Connection cnx = null;
			PreparedStatement pstm = null;
			ResultSet rs = null;

			String nom = "";
			int idconseiller = 0;
			String password = "";
			Conseiller conseiller = new Conseiller();
			try {
				cnx = seConnecter();
				String s = "select * from conseiller where login=?";
				pstm = cnx.prepareStatement(s);
				pstm.setString(1, loginConseiller);
				rs = pstm.executeQuery();
				while (rs.next()) {
					idconseiller = rs.getInt("idconseiller");
					nom = rs.getString("nom");
					password = rs.getString("password");
					conseiller = new Conseiller(nom,loginConseiller,password,idconseiller);
				}

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				close(cnx, pstm, rs);
			}
			return conseiller;
		}

}
