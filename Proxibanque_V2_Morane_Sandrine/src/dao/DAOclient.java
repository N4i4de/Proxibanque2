package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.mysql.jdbc.Connection;

import model.Client;

public class DAOclient implements InterfaceDAOClient {


	@Override
	public Client getByidClient() {
		Connection cnx = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String client = "";
		try {
			cnx = seConnecter();
			String s = "select * from client where idclient=?";
			pstm = cnx.prepareStatement(s);
			pstm.setString(1, idclient);
			rs = pstm.executeQuery(s);
			while (rs.next()) {
				client = rs.getString(1);
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
		return client;

		
		
		
		
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
	
	
	
	
}
