package model;


/**
 * @author Sandrine
 *
 */
public class Client {
	private int id;
	private String nom;
	private String prenom;
	private String adresse;
	private String codePostal;
	private String ville;
	private String telephone;
	private String email;
	
	public Client(int id, String nom, String prenom, String adresse, String codePostal, String ville, String telephone,
			String email) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.telephone = telephone;
		this.email = email;
	}

	
}
