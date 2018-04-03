package service;

import java.util.ArrayList;
import java.util.List;

import dao.DAOclient;
import dao.InterfaceDAOClient;
import model.Client;
import model.Compte;

public class GestionClient implements InterfaceGestionClient {

	@Override
	public void creerClient(Client client) {
		InterfaceDAOClient daoclient = new DAOclient();
		daoclient.saveClient(client);

	}

	@Override
	public void modifierClient(Client clientmodifie, int idclient) {
		InterfaceDAOClient daoclient = new DAOclient();
		daoclient.upDateClientByid(idclient, clientmodifie);
	}
	

	@Override
	public void creerCompte(Compte compte) {
		// TODO Auto-generated method stub
		InterfaceDAOClient daoclient = new DAOclient();
			daoclient.saveCompte(compte);

	}

	@Override
	public void modifierCompte(Compte comptemodifie, int numerocompte) {
		// TODO Auto-generated method stub
		InterfaceDAOClient daoclient = new DAOclient();
		daoclient.upDateCompte(numerocompte, comptemodifie.getSolde());

	}

	@Override
	public void supprimerCompte(int numerocompte) {
		// TODO Auto-generated method stub
		InterfaceDAOClient daoclient = new DAOclient();
		daoclient.deleteCompte(numerocompte);
	}

	@Override
	public void supprimerClient(int idclient) {
		// TODO Auto-generated method stub
		InterfaceDAOClient daoclient = new DAOclient();
		daoclient.deleteClient(idclient);

	}

	@Override
	public List<Client> listerClient(int idconseiller) {
		// TODO Auto-generated method stub
		InterfaceDAOClient daoclient = new DAOclient();
		List listclient = daoclient.getClientByConseiller(idconseiller);

		return listclient;
	}

	@Override
	public List<Compte> listerCompte(int idClient) {
		InterfaceDAOClient daoclient = new DAOclient();
		Client client=daoclient.getByidClient(idClient);
		return client.getListCompte();
	}

	@Override
	public Client afficherClient(int idclient) {
		InterfaceDAOClient daoclient = new DAOclient();
		Client client = new Client();
		client=daoclient.getByidClient(idclient);
		return client;
		
		
	}

}
