package model;



/**
 * classe compte
 *l'attribut typePE (pour Particulier ou Entreprise) indique si le compte est entreprise ou particulier
 *l'attribut typeCE (pour courant ou epargne) indique si le compte est courant ou epargne
 * @author Sandrine
 *
 */
public class Compte {
	private int numeroCompte;
	private double solde;
	private String datecreation;
	public String getDatecreation() {
		return datecreation;
	}

	public void setDatecreation(String datecreation) {
		this.datecreation = datecreation;
	}

	private String typePE;
	private String typeCE;
	public static final String particulier ="PARTICULIER";
	public static final String entreprise = "ENTREPRISE";
	public static final String courant ="COURANT";
	public static final String epargne ="EPARGNE";	
	
	public Compte() {
	}

	public Compte(int numeroCompte, double solde) {
		this.numeroCompte = numeroCompte;
		this.solde = solde;
	}

	public int getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public String getTypePE() {
		return typePE;
	}

	public void setTypePE(String typePE) {
		this.typePE = typePE;
	}

	public String getTypeCE() {
		return typeCE;
	}

	public void setTypeCE(String typeCE) {
		this.typeCE = typeCE;
	}
	
	
	

}
