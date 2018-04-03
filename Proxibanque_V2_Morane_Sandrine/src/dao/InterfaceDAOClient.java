package dao;

import java.util.List;

import model.Client;

public interface InterfaceDAOClient {

	public void saveClient(Client client);

	public Client getByidClient(int id);

	public void upDateClientByid(int id, Client clientModifie);

	public List<Client> getAllclient();
	
	public void deleteClient(int id);

	public void deleteCompte(int numeroCompte);

	//public void saveCompte(Compte compte);

	public void upDateCompte(int numeroCompte);

}
