package Main;

public class Joueur extends Personne{
	private String main;
	private String sponsor;
	private int classement;
	private String entraineur;
	public Habits habitsJoueur = new Habits();
	
	// Ce constructeur permet d'intialiser les classes filles
	public Joueur(){
		super();
	}
	
	// Ce constructeur permet de cr�er un joueur
	public Joueur(String nomNaissance, String nomCourant, String prenom, String surnom, String dateNaissance, String lieuNaissance, String dateDeces, String nationalite, int taille, double poids, String sexe, String main, String sponsor, int classement, String entraineur) {
		super(nomNaissance, nomCourant, prenom, surnom, dateNaissance, lieuNaissance, dateDeces, nationalite, taille, poids, sexe);
		this.main = main;
		this.sponsor = sponsor;
		this.classement = classement;
		this.entraineur = entraineur;
		if(sexe.equals("Homme")) {
			this.habitsJoueur.setTypeHabits("short");
			this.habitsJoueur.setCouleurHabits("bleu");
		}
		else {
			this.habitsJoueur.setTypeHabits("jupe");
			this.habitsJoueur.setCouleurHabits("rouge");
		}

	}
	
	public int serviceJoueur(int whoStart, Joueur joueur) {
		double random = 0, random2 = 0;
		
		int exit = 0;
		while(exit == 0){
			random = Math.random() * ( 1 - 0 );
			random2 = Math.random() * ( 1 - 0 );
			
			if(random <= 0.24) {
				System.out.println("Faute au 1er service !! 2ème service");
				if(random2 <= 0.24) {
					System.out.println("Faute au 2ème service !!");
					if(whoStart == 1) {return 2;}
					else {return 1;}
				}
				else if(random > 0.24 && random <= 0.27) {
					System.out.println("Faute, il y a let !! 2ème service");
					
				}
				else if(random > 0.27 && random <= 0.3) {
					System.out.println("Point au service");
					if(whoStart == 1) {return 1;}
					else {return 2;}
				}
				else {
					System.out.println("Service réussi");
					return 3;
				}
			}
			
			else if(random > 0.24 && random <= 0.27) {
				System.out.println("Faute, il y a let !! 2ème service");
			}
			else if(random > 0.27 && random <= 0.3) {
				System.out.println("Point au service de " + joueur.getPrenom());
				if(whoStart == 1) {return 1;}
				else {return 2;}
			}
			else {
				System.out.println("Service réussi de " + joueur.getPrenom());
				return 3;
			}		
		}
		return 0;
	}
	
	public int renvoyerLaBalle(Joueur whoPlay) {
		double random = 0;
	
		random = Math.random() * ( 1 - 0 );
		
		if(random <= 0.2) {
			System.out.println(whoPlay.getPrenom() + " a fait une faute ! Point accordé à l'adversaire");
			return 1;
		}
		else if(random > 0.2 && random <= 0.5) {
			System.out.println(whoPlay.getPrenom() + " a marqué le point !");
			return 2;
		}
		else {
			System.out.println(whoPlay.getPrenom() + " a renvoyé la balle !");
			return 3;
		}				
	}
	
	
	// Ces m�thodes sont tous mes getter pour acc�der � mes attributs priv�e
	public String getMain() {
		return this.main;
	}
	public String getSponsor() {
		return this.sponsor;
	}
	public int getClassement() {
		return this.classement;
	}
	public String getEntraineur() {
		return this.entraineur;
	}

	// Ces m�thodes sont tous mes setter pour les attributs qui peuvent changer 
	public void setSponsor(String nouveauSponsor) {
		this.sponsor = nouveauSponsor;
	}
	public void setClassement(int nouveauClassement) {
		this.classement = nouveauClassement;
	}
	public void setEntraineur(String nouveauEntraineur) {
		this.entraineur = nouveauEntraineur;
	}
	
	
}
