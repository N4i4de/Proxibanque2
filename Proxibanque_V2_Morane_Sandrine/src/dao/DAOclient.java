package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.Client;
import model.Compte;

public class DAOclient extends DaoJdbc implements InterfaceDAOClient {

	@Override
	public void saveClient(Client client) {
		// TODO Auto-generated method stub

	}

	@Override
	public Client getByidClient(int idclient) {
		Connection cnx = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String nom = "";
		try {
			cnx = seConnecter();
			String s = "select * from client where idclient=?";
			pstm = cnx.prepareStatement(s);
			pstm.setInt(1, idclient);
			rs = pstm.executeQuery();
			while (rs.next()) {
				nom = rs.getString("idclient");
				nom = rs.getString("nom");
				nom = rs.getString("prenom");
				nom = rs.getString("adresse");
				nom = rs.getString("ville");
				nom = rs.getString("telephone");
				nom = rs.getString("codepostal");
				nom = rs.getString("email");

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
		return null;
	}

	@Override
	public void upDateClientByid(int idclient, Client clientModifie) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Client> getAllclient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteClient(int idclient) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCompte(int numeroCompte) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveCompte(Compte compte) {
		// TODO Auto-generated method stub

	}

	@Override
	public void upDateCompte(int numeroCompte) {
		// TODO Auto-generated method stub

	}

}
