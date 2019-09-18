package personnage;

public class Mirmillon extends Personnage {
	
	private String categorie;

	public Mirmillon(String nom, int attaqueMax, int defense, int pvs, int ini) {
		super(nom, attaqueMax, defense, pvs, ini);
		this.categorie = "Mirmillon";
		
		//ini entre 0 et 30
		int min=0;
		int max=30;
		this.setInitiative(min + (int)(Math.random() * ((max - min)+1)));
	}
	
	//setters et getters
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
	//methode
		 public void afficherInfosPersonnage() {
			 afficherInfosPersonnage();
			 System.out.print("\nClasse : "+this.getCategorie());
		 }
		 
		 public void attaquer(Personnage personnageCible) {
			 
			 this.frapperPersonnage(personnageCible);
			 
			 if (personnageCible.getIsAlive()) {//Si le personnage est encore en vie 2e attaque
				 
				 System.out.print("\n"+this.getNom()+" attaque de nouveau.\n");
				 
				 this.frapperPersonnage(personnageCible);
			 }
			 else {
				//aléatoire pour afficher 3 messages différents
				int min=1;
				int max=3;
				int alea= min + (int)(Math.random() * ((max - min)+1));
				
				System.out.print("\n"+this.getNom()+" ");
				
				if (alea==1) {
					System.out.print("tranche la tete de "+personnageCible.getNom()+"!");
				}
				else if (alea==2) {
					System.out.print("transperse "+personnageCible.getNom()+" et lui arrache le coeur avec ses dents !!");
				}
				else {
					System.out.print("decapite "+personnageCible.getNom()+"!!!");
				}
			 }
		 }

}
