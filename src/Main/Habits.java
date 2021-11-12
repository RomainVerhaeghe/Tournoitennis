package Main;

public class Habits {
	private String type;
	private String couleur;
	
	public Habits(){
		this.type = "";
		this.couleur = "";
		
	}
	
	// Ces m�thodes sont tous mes getter pour acc�der � mes attributs priv�e
	public String getHabitsType() {
		return this.type;
	}
	public String getHabitsCouleur() {
		return this.couleur;
	}
	
	// Ces m�thodes sont tous mes setter pour les attributs 
	public void setTypeHabits(String nouveauType) {
		this.type = nouveauType;
	}
	public void setCouleurHabits(String nouvelleCouleur) {
		this.couleur = nouvelleCouleur;
	}
}
