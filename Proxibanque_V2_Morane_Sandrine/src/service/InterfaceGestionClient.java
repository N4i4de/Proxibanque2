package service;

import java.util.List;

import model.Client;
import model.Compte;

/**
 * interface pour la gestion client
 * @author Sandrine
 *
 */
public interface InterfaceGestionClient {
	public void creerClient(Client client); 
	public void modifierClient(Client clientmodifie, int idclient);
	public Client afficherClient(int idclient);
	public void creerCompte(Compte compte);
	public void modifierCompte(Compte comptemodifie, int numerocompte);
	public void supprimerCompte(int numerocompte);
	public void supprimerClient(int idclient);
	public List<Client> listerClient(int idconseiller);
	public List<Compte> listerCompte(int idClient);

}
