package service;

import dao.DaoConseiller;
import dao.InterfaceDaoConseiller;
import model.Conseiller;

public class GestionConseiller implements InterfaceGestionConseiller {

	@Override
	public Conseiller CheckConseiller(String login, String password) {
		// DONE Methode de vérification conseiller
		InterfaceDaoConseiller daoco = new DaoConseiller();
		Conseiller conseiller= daoco.GetByLoginConseiller(login);
		if (conseiller.getPassword().equals(password)) {
			return conseiller;
		} else {
			conseiller.setIdconseiller(0);
			
			return conseiller;
		}
	}

}
