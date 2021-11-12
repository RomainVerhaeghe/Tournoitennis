package Main;

public class Personne { 
	private String nomNaissance;
	private String nomCourant;
	private String prenom;
	private String surnom;
	private String dateNaissance;
	private String lieuNaissance;
	private String dateDeces;
	private String nationalite;
	private int taille;
	private double poids;
	private String sexe;
	
	// Ce constructeur permet d'intialiser les classes filles
	public Personne() {
		
	}
	
	// Ce constructeur permet de cr�er une personne
	public Personne(String nomNaissance, String nomCourant, String prenom, String surnom, String dateNaissance, String lieuNaissance, String dateDeces, String nationalite, int taille, double poids, String sexe) {
		this.nomNaissance = nomNaissance;
		this.nomCourant = nomCourant;
		this.prenom = prenom;
		this.surnom = surnom;
		this.dateNaissance = dateNaissance;
		this.lieuNaissance = lieuNaissance;
		this.dateDeces = dateDeces;
		this.nationalite = nationalite;
		this.taille = taille;
		this.poids = poids;
		this.sexe = sexe;
	}	
	
	
	// Ces m�thodes sont tous mes getter pour acc�der � mes attributs priv�e
	public String getNomNaissance() {
		return this.nomNaissance;
	}
		public String getNomCourant() {
		return this.nomCourant;
	}
		public String getPrenom() {
		return this.prenom;
	}
	public String getSurnom() {
		return this.surnom;
	}
	public String getdateNaissance() {
		return this.dateNaissance;
	}
	public String getLdateNaissance() {
		return this.lieuNaissance;
	}
	public String getDateDeces() {
		return this.dateDeces;
	}
	public String getNationalite() {
		return this.nationalite;
	}
	public int getTaille() {
		return this.taille;
	}
	public double getPoids() {
		return this.poids;
	}
	public String getSexe() {
		return this.sexe;
	}

	
	// Ces m�thodes sont tous mes setter pour les attributs qui peuvent changer 
	public void setNomCourant(String nouveauNom) {
		this.nomCourant = nouveauNom;
	}
	public void setSurnom(String nouveauSurnom) {
		this.surnom = nouveauSurnom;
	}
	public void setDateDeces(String laDateDeces) {
		this.dateDeces = laDateDeces;
	}
	public void setPoids(double nouveauPoids) {
		this.poids = nouveauPoids;
	}	
}
