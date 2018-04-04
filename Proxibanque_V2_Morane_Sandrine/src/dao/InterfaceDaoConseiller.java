package dao;

import model.Conseiller;

public interface InterfaceDaoConseiller {
	public void saveConseiller(Conseiller conseiller);
	public Conseiller GetByLoginConseiller(int idConseiller);

}
