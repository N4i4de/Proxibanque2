package service;

import dao.DaoConseiller;
import dao.InterfaceDaoConseiller;
import model.Conseiller;

public interface InterfaceGestionConseiller {
	/**
	 * @param login : login entré au clavier lors de la connexion du conseiller
	 * @param password : password entré au clavier lors de la connexion du conseiller
	 * @return : L'objet conseiller complet si le login et le mmot de passe sont correct
	 * si le login est correct et le mot de passe incorrect, renvoie un conseiller avec l'id=0
	 */
	public Conseiller CheckConseiller(String login, String password);

}
