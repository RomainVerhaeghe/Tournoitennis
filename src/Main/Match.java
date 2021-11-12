package Main;

public class Match extends Set{
	
	private Joueur joueur1 = new Joueur();
	private Joueur joueur2 = new Joueur();
	private Arbitre arbitre = new Arbitre();
	private String niveauMatch;
	private int setJoueur1 = 0;
	private int setJoueur2 = 0;
	
	public Match(Joueur J1, Joueur J2, Arbitre Ar, String niveauM) {
		this.joueur1 = J1;
		this.joueur2 = J2;
		this.arbitre = Ar;
		this.niveauMatch = niveauM;
	}
	
	public Joueur playMatch() {
		Double serviceRand = Math.random() * ( 1 - 0 );
		
		int nbOfSet = 3;
		if(this.matchSexe().equals("feminin")) {nbOfSet = 2;}
		
		int whoStart = 0;
		if(serviceRand <= 0.5) {whoStart = 1;}
		else {whoStart = 2;}
		
		int compt = 0;
		
		System.out.println("Ce match opposera " + this.joueur1.getPrenom() + " " + this.joueur1.getNomNaissance() + " à " + this.joueur2.getPrenom() + " " + this.joueur2.getNomNaissance());
		System.out.println("Ce sera un match " + this.matchSexe() + " donc en "+ nbOfSet + " sets " + "et c'est un match " + this.niveauMatch + "\n");
		
		while(this.setJoueur1 != nbOfSet && this.setJoueur2 != nbOfSet) {

			if(whoWonTheSet(whoStart, this.joueur1, this.joueur2) == 1) {
				this.setJoueur1++;
				System.out.println(this.joueur1.getPrenom() + " remporte ce set !");
			}
			else {
				this.setJoueur2++;
				System.out.println(this.joueur2.getPrenom() + " remporte ce set !");
			}
						
			if(whoStart == 1) {
				System.out.println("Il y a " + this.setJoueur1 + " sets pour " + this.joueur1.getPrenom() + " à " + this.setJoueur2 + " sets pour " + this.joueur2.getPrenom() + "\n");
			}
			else{
				System.out.println("Il y a " + this.setJoueur2 + " sets pour " + this.joueur2.getPrenom() + " à "  + this.setJoueur1 + " sets pour " + this.joueur1.getPrenom() + "\n");
			}
			compt++;
		}
		
		//System.out.println("compt = " +compt);
		
		if(this.setJoueur1 == nbOfSet) {
			System.out.println(this.joueur1.getPrenom() + " " + this.joueur1.getNomNaissance()+" a remporté le match");
			return this.joueur1;
		}
		else{
			System.out.println( this.joueur2.getPrenom() + " " + this.joueur2.getNomNaissance() + " a remporté le match");
			return this.joueur2;
		}

	}
	
	public String matchSexe() {
		if(this.joueur1.getSexe().equals("Homme")) {
			return "masculin";
		}
		else {
			return "feminin";
		}
	}

}
