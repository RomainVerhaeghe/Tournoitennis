package Main;

public class Arbitre extends Personne{

	
	public Arbitre(){
		super();
	}
	
	// Ce constructeur permet de cr�er un arbitre
	public Arbitre(String nomNaissance, String nomCourant, String prenom, String surnom, String dateNaissance, String lieuNaissance, String dateDeces, String nationalite, int taille, double poids, String sexe) {
		super(nomNaissance, nomCourant, prenom, surnom, dateNaissance, lieuNaissance, dateDeces, nationalite, taille, poids, sexe);
	}
}
