package Main;

public class Jeu extends Echange{
	
	private String nbPointJoueur1;
	private String nbPointJoueur2;
	
	
	public int whoWonTheGame(int whoStart, Joueur joueur1, Joueur joueur2) {
		
		this.nbPointJoueur1 = "0";
		this.nbPointJoueur2 = "0";
		
		//System.out.println(nbPointJoueur1.equals("WIN"));
				
		while(nbPointJoueur1.equals("WIN") == false && nbPointJoueur2.equals("WIN") == false) {
			//double random = Math.random() * ( 1 - 0 );
			if(whoWonTheEchange(whoStart, joueur1, joueur2) == 1) {
				if(nbPointJoueur2.equals("AV")) {this.nbPointJoueur2 = "40";}
				else if(!nbPointJoueur2.equals("40") && nbPointJoueur1.equals("40")) {this.nbPointJoueur1 = "WIN";}
				else{this.nbPointJoueur1 = incrementPoints(nbPointJoueur1);}
				System.out.println(joueur1.getPrenom() + " remporte le point !");
			}
			else {
				if(nbPointJoueur1.equals("AV")) {this.nbPointJoueur1 = "40";}
				else if(!nbPointJoueur1.equals("40") && nbPointJoueur2.equals("40")) {this.nbPointJoueur2 = "WIN";}
				else{this.nbPointJoueur2 = incrementPoints(nbPointJoueur2);}
				System.out.println(joueur2.getPrenom() + " remporte le point !");
			}
			
			
			if(whoStart == 1) {
				System.out.println("	" + this.nbPointJoueur1 + " - " + this.nbPointJoueur2);
			}
			else {
				System.out.println("	" + this.nbPointJoueur2 + " - " + this.nbPointJoueur1);
				
			}
		}
		
		System.out.println("\n");
		
		if(nbPointJoueur1.equals("WIN")) {
			return 1;
		}
		else {
			return 2;
		}
		
		
	}

}
