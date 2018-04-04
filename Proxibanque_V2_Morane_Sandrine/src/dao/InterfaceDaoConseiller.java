package dao;

import model.Conseiller;

public interface InterfaceDaoConseiller {
	/**
	 * @param conseiller : Objet conseiller à saugearder dans la base de données
	 */
	public void saveConseiller(Conseiller conseiller);
	/**
	 * @param loginConseiller : login du conseiller qu'on souhaite rechercher
	 * @return : l'objet conseiller rechercher
	 */
	public Conseiller GetByLoginConseiller(String loginConseiller);

}
