package service;

import dao.DaoConseiller;
import dao.InterfaceDaoConseiller;
import model.Conseiller;

public interface InterfaceGestionConseiller {
	public Conseiller CheckConseiller(String login, String password);

}
