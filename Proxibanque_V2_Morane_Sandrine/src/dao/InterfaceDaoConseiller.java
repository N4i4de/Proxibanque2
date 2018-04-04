package dao;

import model.Conseiller;

public interface InterfaceDaoConseiller {
	/**
	 * @param conseiller : Objet conseiller � saugearder dans la base de donn�es
	 */
	public void saveConseiller(Conseiller conseiller);
	/**
	 * @param loginConseiller : login du conseiller qu'on souhaite rechercher
	 * @return : l'objet conseiller rechercher
	 */
	public Conseiller GetByLoginConseiller(String loginConseiller);

}
