package Main;

public class Echange {
	
	
	
	public int whoWonTheEchange(int whoStart,  Joueur joueur1, Joueur joueur2) {
		
		//System.out.println(random + " -- " + random2);
		System.out.println("\n");
		int whoPlay = 0;
		int turn = 0;
		int service = 0;
		int renvoyer = 0;
		
		if(whoStart == 1) {
			service = joueur1.serviceJoueur(whoStart, joueur1);
			whoPlay = 2;
		}
		else {
			service = joueur1.serviceJoueur(whoStart, joueur2);
			whoPlay = 1;
		}
		
		
		if(service == 3) {
			do {
				if(whoPlay == 1) {
					renvoyer = joueur1.renvoyerLaBalle(joueur1);
                                    switch (renvoyer) {
                                        case 1:
                                            return 2;
                                        case 2:
                                            return 1;
                                        default:
                                            whoPlay = 2;
                                            break;
                                    }
				}
				else if(whoPlay == 2) {
					renvoyer = joueur1.renvoyerLaBalle(joueur2);
                                    switch (renvoyer) {
                                        case 1:
                                            return 1;
                                        case 2:
                                            return 2;
                                        default:
                                            whoPlay = 1;
                                            break;
                                    }
				}
			}while (turn == 0);
		}
		else if (service == 1) {
			return 1;
		}
		else {
			return 2;
		}
		
		return 0;
	}
	
	public String incrementPoints(String ancientPoints) {
		
            switch (ancientPoints) {
                case "0":
                    return "15";
                case "15":
                    return "30";
                case "30":
                    return "40";
                case "40":
                    return "AV";
                case "AV":
                    return "WIN";
                default:
                    return "NONE";
            }
		
	}
}
