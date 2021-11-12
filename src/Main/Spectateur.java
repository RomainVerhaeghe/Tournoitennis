package Main;

public class Spectateur extends Personne{
	private int prixBillet;
	private String place;
	private String action;
	private Habits habitsSpectateur = new Habits();
	
	
	public Spectateur(){
		super();
	}
	
	// Ce constructeur permet de cr�er un spectateur
	public Spectateur(String nomNaissance, String nomCourant, String prenom, String surnom, String dateNaissance, String lieuNaissance, String dateDeces, String nationalite, int taille, double poids, String sexe, int prixBilletE, String placeE) {
		super(nomNaissance, nomCourant, prenom, surnom, dateNaissance, lieuNaissance, dateDeces, nationalite, taille, poids, sexe);
		this.prixBillet = prixBilletE;
		this.place = placeE;
		this.action = "NONE";
		if(sexe.equals("Homme")) {
			this.habitsSpectateur.setTypeHabits("chemise");
			this.habitsSpectateur.setCouleurHabits("bleu");
		}
		else {
			this.habitsSpectateur.setTypeHabits("lunette");
			this.habitsSpectateur.setCouleurHabits("rouge");
		}
	}
	
	
	// Ces m�thodes sont tous mes getter pour acc�der � mes attributs priv�e
	public int getPrixBillet() {
		return this.prixBillet;
	}
		public String getPlace() {
		return this.place;
	}
		public String getAction() {
		return this.action;
	}

		
	// Ces m�thodes sont tous mes setter pour les attributs qui peuvent changer 
	public void setPrixBillet(int nouveauPrixBillet) {
		this.prixBillet = nouveauPrixBillet;
	}
	public void setPlace(String nouvellePlace) {
		this.place = nouvellePlace;
	}
	public void setAction(String nouvelleAction) {
		this.action = nouvelleAction;
	}
}
