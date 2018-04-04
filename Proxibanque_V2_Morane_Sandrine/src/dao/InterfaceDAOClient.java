package dao;

import java.util.List;

import model.Client;
import model.Compte;

/**
 * @author Sandrine
 *
 */
public interface InterfaceDAOClient {

	/**
	 * @param client : client qui sera sauvegarder
	 */
	public void saveClient(Client client);

	/**
	 * @param idclient : id du client recherch� (cl� dans la base de donn�es)
	 * @return le client avec l'id correspondante
	 */
	public Client getByidClient(int idclient);

	/**
	 * @param idclient : id du client � modifier
	 * @param clientModifie : objet client avec les modifications demand�es
	 */
	public void upDateClientByid(int idclient, Client clientModifie);

	/**
	 * @return la liste de tous les clients de la data base
	 */
	public List<Client> getAllclient();
	
	/**
	 * @param idclient : id du client � supprimer
	 */
	public void deleteClient(int idclient);

	/**
	 * @param numeroCompte : numero du compte � supprimer
	 */
	public void deleteCompte(int numeroCompte);

	/**
	 * @param compte : objet compte � supprimer dans la database
	 */
	public void saveCompte(Compte compte);

	/**
	 * @param numeroCompte : numero de compte � modifier
	 * @param nouveauSolde : nouveau solde du compte
	 */
	public void upDateCompte(int numeroCompte,double nouveauSolde);
	
	/**
	 * @param idConseiller : id du conseiller dont on recherche les clients
	 * @return liste des clients du conseiller
	 */
	public List<Client> getClientByConseiller(int idConseiller);

	

	

}
