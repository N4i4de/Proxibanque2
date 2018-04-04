package model;

import java.util.List;

public class Conseiller {
	private String  nom;
	private String login;
	private String password;
	private int idconseiller;
	private List<Client> listClient;
	
	
	
	public Conseiller() {
	}

	public Conseiller(String nom, String login, String password, int idconseiller) {
		this.nom = nom;
		this.login = login;
		this.password = password;
		this.idconseiller = idconseiller;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getIdconseiller() {
		return idconseiller;
	}

	public void setIdconseiller(int idconseiller) {
		this.idconseiller = idconseiller;
	}

	public List<Client> getListClient() {
		return listClient;
	}

	public void setListClient(List<Client> listClient) {
		this.listClient = listClient;
	}
	
	
}
