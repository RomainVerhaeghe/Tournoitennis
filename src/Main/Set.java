package Main;

public class Set extends Jeu{
	
	private int nbJeuJoueur1;
	private int nbJeuJoueur2;
	
	
	public int whoWonTheSet(int whoStart, Joueur joueur1, Joueur joueur2) {
		this.nbJeuJoueur1 = 0;
		this.nbJeuJoueur2 = 0;
		int exit = 0;
		
		
		while(exit == 0) {
			if(whoStart == 1) {
				System.out.println(joueur1.getPrenom() + " a le service !");
			}
			else {
				System.out.println(joueur2.getPrenom() + " a le service !");
			}
			//double random = Math.random() * ( 1 - 0 );
			if(whoWonTheGame(whoStart, joueur1, joueur2) == 1) {
				this.nbJeuJoueur1++;
				System.out.println(joueur1.getPrenom() + " remporte ce jeu !");
			}
			else {
				this.nbJeuJoueur2++;
				System.out.println(joueur2.getPrenom() + " remporte ce jeu !");
			}
			//System.out.println(random);
			
			
			
			if(whoStart == 1) {
				System.out.println("Le score est de " + this.nbJeuJoueur1 + " jeu(x) à " + this.nbJeuJoueur2 );
				System.out.println("\n");
				whoStart = 2;
			}
			else {
				System.out.println("Le score est de " + this.nbJeuJoueur2 + " jeu(x) à " + this.nbJeuJoueur1);
				System.out.println("\n");
				whoStart = 1;
				
			}
			if(this.nbJeuJoueur1 > 5 || this.nbJeuJoueur2 > 5){
				if((this.nbJeuJoueur1 - this.nbJeuJoueur2) >= 2 || (this.nbJeuJoueur2 - this.nbJeuJoueur1) >= 2) {
					exit = 1;
				}
			}
		}
		
		if(this.nbJeuJoueur1 > this.nbJeuJoueur2) {
			return 1;
		}
		else {
			return 2;
		}
		
	
	}

}
