package service;

import java.util.List;

import model.Client;
import model.Compte;

/**
 * interface pour la gestion client et compte
 * @author Sandrine
 *
 */
/**
 * @author adminl
 *
 */
public interface InterfaceGestionClient {
	/**
	 * @param client : objet client � integrer au dao
	 */
	public void creerClient(Client client); 
	/**
	 * @param clientmodifie : objet Client contenant les modifications � integrer
	 * @param idclient : id du client � modifier
	 */
	public void modifierClient(Client clientmodifie, int idclient);
	/**
	 * @param idclient : id du client � r�cuperer
	 * @return le client correspondant
	 */
	public Client afficherClient(int idclient);
	/**
	 * @param compte : objet compte � sauvegarder
	 */
	public void creerCompte(Compte compte);
	/**
	 * @param comptemodifie : objet compte contenant les modifications � integrer
	 * @param numerocompte : numero du compte � modifier
	 */
	public void modifierCompte(Compte comptemodifie, int numerocompte);
	/**
	 * @param numerocompte : numero de compte du compte )� supprimer
	 */
	public void supprimerCompte(int numerocompte);
	/**
	 * @param idclient : id du client � supprimer
	 */
	public void supprimerClient(int idclient);
	/**
	 * @param idconseiller : Id du conseiller dont on veut les client
	 * @return la liste des clients du conseiller
	 */
	public List<Client> listerClient(int idconseiller);
	
	/**
	 * @param idClient : id du client dont on veut les comptes
	 * @return la liste des comptes du clients
	 */
	public List<Compte> listerCompte(int idClient);

}
