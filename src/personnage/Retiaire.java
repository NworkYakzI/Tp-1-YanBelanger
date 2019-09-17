package personnage;

public class Retiaire extends Personnage{

	private String categorie;

	public Retiaire(String nom, int attaqueMax, int defense, int pvs, int ini) {
		super(nom, attaqueMax, defense, pvs, ini);
		this.categorie = "Rétiaire";
	}

	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
	
	
	
	
	
	
	
}
