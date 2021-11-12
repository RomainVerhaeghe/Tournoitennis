package Main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception{
		  
		ArrayList<Joueur> listJoueur = new ArrayList<Joueur>();
		ArrayList<Arbitre> listArbitre = new ArrayList<Arbitre>();
		ArrayList<Spectateur> listSpectateur = new ArrayList<Spectateur>();
		String line;
		String[] tmp;
		
		//On lit les fichiers avec les donn�es et on stocke les joueurs
		BufferedReader fichierJoueur = new BufferedReader(new FileReader("C:\\Users\\romai\\Documents\\NetBeansProjects\\TennisTournament\\src\\Main\\listJoueur.txt"));
		while ((line = fichierJoueur.readLine()) != null){
			//Je s�pare les valeurs presentent dans mes lignes de texte
			tmp = line.split(",");
			
			Joueur newJoueur =  new Joueur(tmp[0], tmp[1], tmp[2], tmp[3], tmp[4], tmp[5], tmp[6], tmp[7], Integer.parseInt(tmp[8]), Double.parseDouble(tmp[9]), tmp[10], tmp[11], tmp[12], Integer.parseInt(tmp[13]), tmp[14]);
			listJoueur.add(newJoueur);
		}
		fichierJoueur.close();
		
		//On lit les fichiers avec les donn�es et on stocke les arbitres
		BufferedReader fichierArbitre = new BufferedReader(new FileReader("C:\\Users\\romai\\Documents\\NetBeansProjects\\TennisTournament\\src\\Main\\listArbitre.txt"));
		while ((line = fichierArbitre.readLine()) != null){
			//Je s�pare les valeurs presentent dans mes lignes de texte
			tmp = line.split(",");
			
			Arbitre newArbitre =  new Arbitre(tmp[0], tmp[1], tmp[2], tmp[3], tmp[4], tmp[5], tmp[6], tmp[7], Integer.parseInt(tmp[8]), Double.parseDouble(tmp[9]), tmp[10]);
			listArbitre.add(newArbitre);
		}
		fichierArbitre.close();
		
		//On lit les fichiers avec les donn�es et on stocke les spectateurs
		BufferedReader fichierSpectateur = new BufferedReader(new FileReader("C:\\Users\\romai\\Documents\\NetBeansProjects\\TennisTournament\\src\\Main\\listSpectateur.txt"));
		while ((line = fichierSpectateur.readLine()) != null){
			//Je s�pare les valeurs presentent dans mes lignes de texte
			tmp = line.split(",");
			
			Spectateur newSpectateur =  new Spectateur(tmp[0], tmp[1], tmp[2], tmp[3], tmp[4], tmp[5], tmp[6], tmp[7], Integer.parseInt(tmp[8]), Double.parseDouble(tmp[9]), tmp[10], Integer.parseInt(tmp[11]), tmp[12]);
			listSpectateur.add(newSpectateur);
		}
		fichierSpectateur.close();

		Match match1 = new Match(listJoueur.get(3), listJoueur.get(4), listArbitre.get(1), "amical");
		match1.playMatch();
		
		//System.out.println(match1.playMatch().getPrenom());
//		System.out.println(listArbitre.size());
//		System.out.println(listArbitre.get(0).getPrenom());
//		System.out.println(listSpectateur.size());
//		System.out.println(listSpectateur.get(0).getPrenom());

		  
		}
	
}
