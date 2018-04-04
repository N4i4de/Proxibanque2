package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Client;
import model.Compte;


/**
 * @author Morane
 *
 */
public class DAOclient extends DaoJdbc implements InterfaceDAOClient {

	@Override
	public void saveClient(Client client) {
		// TODO Auto-generated method stub
		Connection cnx = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
			 
		try {
			cnx = seConnecter();
			String s = "insert into client (idclient, nom, prenom, adresse, ville, telephone, codepostal, email) values ( ?, ?, ?, ?, ?, ?, ?, ?)";
			pstm = cnx.prepareStatement(s);
			pstm.setInt(1, client.getIdclient());
			pstm.setString(2, client.getNom());
			pstm.setString(3, client.getPrenom());
			pstm.setString(4, client.getAdresse());
			pstm.setString(5, client.getVille());
			pstm.setString(6, client.getTelephone());
			pstm.setString(7, client.getCodePostal());
			pstm.setString(8, client.getEmail());
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
	public Client getByidClient(int idclient) {
		Connection cnx = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;

		String nom = "";
		String prenom = "";
		String adresse = "";
		String ville = "";
		String telephone = "";
		String codepostal = "";
		String email = "";
		Client client = new Client();
		try {
			cnx = seConnecter();
			String s = "select * from client where idclient=?";
			pstm = cnx.prepareStatement(s);
			pstm.setInt(1, idclient);
			rs = pstm.executeQuery();
			while (rs.next()) {
				idclient = rs.getInt("idclient");
				nom = rs.getString("nom");
				prenom = rs.getString("prenom");
				adresse = rs.getString("adresse");
				ville = rs.getString("ville");
				telephone = rs.getString("telephone");
				codepostal = rs.getString("codepostal");
				email = rs.getString("email");
				client = new Client(idclient, nom, prenom, adresse, codepostal, ville, telephone, email);
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
    public void upDateClientByid(int idclient, Client clientModifie) {

        Connection cnx = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        String nom = "";
        String prenom = "";
        String adresse = "";
        String email="";
        try {
            cnx = seConnecter();
            String s = "update client set nom =? and prenom=? and adresse = ? and email=?  where idclient = ?";
            pstm = cnx.prepareStatement(s);
            pstm.setString(1, nom);
            pstm.setString(2, prenom);
            pstm.setString(3, adresse);
            pstm.setString(4, email);
            pstm.setInt(5, idclient);
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
    public List<Client> getAllclient() {
        Connection cnx = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<Client> clients = new ArrayList<>();
        String nom = "";
        String prenom = "";
        String adresse = "";
        String ville = "";
        String telephone = "";
        String codepostal = "";
        String email = "";
        int idclient;
        Client client = new Client();
        try {
            cnx = seConnecter();
            String s = "select * from client";
            pstm = cnx.prepareStatement(s);
            rs = pstm.executeQuery();
            while (rs.next()) {
                idclient = rs.getInt("idclient");
                nom = rs.getString("nom");
                prenom = rs.getString("prenom");
                adresse = rs.getString("adresse");
                ville = rs.getString("ville");
                telephone = rs.getString("telephone");
                codepostal = rs.getString("codepostal");
                email = rs.getString("email");

                client = new Client(idclient, nom, prenom, adresse, codepostal, ville, telephone, email);
                clients.add(client);
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
        return clients;
    }
	@Override
    public void deleteClient(int idclient) {
        // TODO Auto-generated method stub
            Connection cnx = null;
            PreparedStatement pstm = null;
            ResultSet rs = null;
            try {
                cnx = seConnecter();
                String s = "delete * from client where idclient=?";
                pstm = cnx.prepareStatement(s);
                pstm.setInt(1, idclient);
                rs = pstm.executeQuery();

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
    public void deleteCompte(int numerocompte) {
        // TODO Auto-generated method stub
        Connection cnx = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            cnx = seConnecter();
            String s = "delete * from compte where numerocompte=?";
            pstm = cnx.prepareStatement(s);
            pstm.setInt(1, numerocompte);
            rs = pstm.executeQuery();

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
    public void saveCompte(Compte compte) {
        // TODO Auto-generated method stub
        Connection cnx = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            cnx = seConnecter();
            String s = "insert into compte (numerocompte, solde, typepe, datecreation, typece) values ( ?, ?, ?, ?, ?)";
            pstm = cnx.prepareStatement(s);
            pstm.setInt(1, compte.getNumeroCompte());
            pstm.setDouble(2, compte.getSolde());
            pstm.setString(3, compte.getTypePE());
            pstm.setString(4, compte.getDatecreation());
            pstm.setString(5, compte.getTypeCE());
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
public void upDateCompte(int numeroCompte, double nouveauSolde) {
    // TODO Auto-generated method stub
    Connection cnx = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;
    double solde=0.0;

    try {
        cnx = seConnecter();
        String s = "update compte set solde=?  where numerocompte = ?";
        pstm = cnx.prepareStatement(s);
        pstm.setDouble(1, solde);
        pstm.setInt(2, numeroCompte);

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
	public List<Client> getClientByConseiller(int idConseiller) {
		// TODO Auto-generated method stub
		return null;
	}

}
