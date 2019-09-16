
package personnage;

public class Personnage {
	
	//Déclaration des variables de la classe
	private int attaque,defense,pointsDeVie,initiative;
	private String nom;
	private Boolean isAlive;
	
	//constructeurs avec parametres
    public Personnage(String nom, int attaqueMax, int defense, int pvs, int ini) {
    	this.attaque=attaqueMax;
		this.defense=defense;
		this.pointsDeVie=pvs;
		this.initiative=ini;
		this.nom=nom;
		this.isAlive=true;
    }

    //constructeurs sans parametres
    public Personnage() {
    	this.attaque=0;
		this.defense=0;
		this.pointsDeVie=0;
		this.initiative=0;
		this.nom="";
		this.isAlive=true;
    }

    //setters et getters
    public int getAttaque() {
		return attaque;
	}
	public void setAttaque(int attaque) {
		this.attaque = attaque;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	public int getPointsDeVie() {
		return pointsDeVie;
	}
	public void setPointsDeVie(int pointsDeVie) {
		this.pointsDeVie = pointsDeVie;
	}
	public int getInitiative() {
		return initiative;
	}
	public void setInitiative(int initiative) {
		this.initiative = initiative;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Boolean getIsAlive() {
		return isAlive;
	}
	public void setIsAlive(Boolean isAlive) {
		this.isAlive = isAlive;
	}

    //methode pour afficher les informations du personnage
    public void afficherInfosPersonnage() {
    	System.out.print(this.nom+"\n\tAttaque : "+this.attaque+"\n\tDefense : "+this.defense+
				"\n\tPoints de vie : "+this.pointsDeVie+"\n\tInitiative : "+initiative+"\n\tStatut : ");
		if (this.isAlive) System.out.println("Vivant");
		else System.out.println("Mort");
    }

	//Calcul de l'attaque
    private int attaqueCalcul() {
       int min=0;
       int attaqueCalcul=min + (int)(Math.random() * ((this.attaque - min)+1));
        return attaqueCalcul;
    }

    // -------------------------------------------------------------------------
    public void frapperPersonnage(Personnage personnageCible) {
    	
    	int attaque=this.attaqueCalcul();
    	int degats= attaque-personnageCible.getDefense();
    	
    	if (degats<=0) degats=0;
    	
    	personnageCible.setPointsDeVie(personnageCible.getPointsDeVie()-degats);
    	
    	System.out.print("\n"+this.getNom()+" attaque avec une puissance de : "+attaque+
				"\n"+personnageCible.getNom()+" a une defense de : "+personnageCible.getDefense()+
				"\nLes dommages sont donc de : "+degats+"\n");
    	
    	if (personnageCible.getPointsDeVie()<=0) {
    		personnageCible.setPointsDeVie(0);
    		personnageCible.setIsAlive(false);
		}
    }

    // -------------------------------------------------------------------------
    public void setNewIniRandom() {
    	int min=0;
    	int max=100;
    	this.setInitiative(min + (int)(Math.random() * ((max - min)+1)));
    	
    }
}
