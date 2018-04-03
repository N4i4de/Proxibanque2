package dao;

import java.util.List;

import model.Client;
import model.Compte;

public interface InterfaceDAOClient {

	public void saveClient(Client client);

	public Client getByidClient(int idclient);

	public void upDateClientByid(int idclient, Client clientModifie);

	public List<Client> getAllclient();
	
	public void deleteClient(int idclient);

	public void deleteCompte(int numeroCompte);

	public void saveCompte(Compte compte);

	public void upDateCompte(int numeroCompte,double nouveauSolde);
	
	public List<Client> getClientByConseiller(int idConseiller);

	

	

}
