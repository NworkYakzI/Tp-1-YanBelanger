
public class Personnage {
	
	//Déclaration des variables de la classe
	private int attaque,defense,pointsDeVie,initiative;
	private String nom;
	private Boolean isAlive;
	
	//setters and getters
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
	
	//Constructeurs
	public Personnage(int attaque,int defense, int pointsDeVie,int initiative, String nom){
		this.attaque=attaque;
		this.defense=defense;
		this.pointsDeVie=pointsDeVie;
		this.initiative=initiative;
		this.nom=nom;
		this.isAlive=true;
	}
	
	//méthodes
	public void affichePersonnage() {
		System.out.print(this.nom+"\n\tAttaque : "+this.attaque+"\n\tDefense : "+this.defense+
				"\n\tPoints de vie : "+this.pointsDeVie+"\n\tInitiative : "+initiative+"\n\tStatut : ");
		if (this.isAlive) System.out.println("Vivant\n");
		else System.out.println("Mort\n");
	}
	
	public int aleatoire(int max) {
		int min=0;
		int alea=min + (int)(Math.random() * ((max - min)+1));
		return alea;
		
	}
	
}
