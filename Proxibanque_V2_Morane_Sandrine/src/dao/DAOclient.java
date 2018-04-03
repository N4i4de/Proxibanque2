package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.Client;

public class DAOclient extends DaoJdbc implements InterfaceDAOClient {


	@Override
	public Client getByidClient(int idclient) {
		Connection cnx = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String nom = "";
		try {
			cnx = seConnecter();
			String s = "select nom from client where idclient=?";
			pstm = cnx.prepareStatement(s);
			pstm.setInt(1, idclient);
			rs = pstm.executeQuery(s);
			while (rs.next()) {
				nom = rs.getString(1);
				System.out.println("lala"+ nom);
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
	public void upDateClientByid(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Client> getAllclient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCompte() {
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

	@Override
	public void saveClient(Client client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void upDateClientByid(int id, Client clientModifie) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteClient(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCompte(int numeroCompte) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
