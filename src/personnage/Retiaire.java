package personnage;

public class Retiaire extends Personnage{

	private String categorie;
	private boolean isFiletMain;

	public Retiaire(String nom, int attaqueMax, int defense, int pvs, int ini) {
		super(nom, attaqueMax, defense, pvs, ini);
		this.categorie = "Rétiaire";
		this.isFiletMain=true;
	}
	
	//setters et getters
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public boolean isFiletMain() {
		return isFiletMain;
	}
	public void setFiletMain(boolean isFiletMain) {
		this.isFiletMain = isFiletMain;
	}

	
	//methode
	public void attaquer(Personnage personnageCible) {
	
		int min=0;
		int max=100;
		int alea= min + (int)(Math.random() * ((max - min)+1));
		
		//si filet dans les mains
		if (this.isFiletMain()) {
			
			System.out.print("\n"+this.getNom()+"lance son filet");
			this.setFiletMain(false);
			
			//10% s'il attrape l'ennemie
			if (alea<=10) {
				personnageCible.setPointsDeVie(0);
				
				System.out.print("\n\nSon filet attrape "+personnageCible.getNom()+" et il l'empale sauvagement avec sa lance\n.");
				
				personnageCible.setIsAlive(false);
				
			}
			else {
				
				System.out.print("\n\nLe filet n'atteint pas sa cible.\n");
			}
			
		}
		else {
			
			System.out.print("\n"+this.getNom()+" ramasse son filet et en profite pour attaquer.\n");
			this.frapperPersonnage(personnageCible);
		}
		
	}
	
	
	
	
	
	
}
