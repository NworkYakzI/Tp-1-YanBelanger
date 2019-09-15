
public class Main {

	public static void main(String[] args) {
		//création des 2 personnages
		Personnage Bob = new Personnage(15,15,70,15,"Bob le malchanceux");
		Personnage Igor = new Personnage(25,5,100,30,"Igor l'empaleur");
		
		//déclaration des variables locales
		int degats;
		int tour=1;
		int attaque;
		
		//affichage des statistiques
		Bob.affichePersonnage();
		Igor.affichePersonnage();
		
		//message début
		System.out.print("<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>\n<<<<< Que le combat commence ! >>>>>\n<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>\n");
		
		//Boucle de combat
		do {
			
			System.out.print("\n---------------\nTOUR ACTUEL: "+tour+"\n---------------\n");
			//boucle d'initiative
			for (int ini=0;ini<=100;ini++) {
				if (ini==Bob.getInitiative()) {
					//calcul de l'attaque et des dégats
					attaque=Bob.aleatoire(Bob.getAttaque());
					degats=attaque-Igor.getDefense();
					if (degats<=0) degats=0;
					
					//diminution des point de vie de l'adversaire
					Igor.setPointsDeVie(Igor.getPointsDeVie()-degats);
					
					//afficher le message d'attaque
					System.out.print("\n"+Bob.getNom()+" attaque avec une puissance de : "+attaque+
							"\n"+Igor.getNom()+" a une defense de : "+Igor.getDefense()+
							"\nLes dommages sont donc de : "+degats+"\n");
					
					//Évaluation s'il est mort
					if (Igor.getPointsDeVie()<=0) {
						Igor.setPointsDeVie(0);
						Igor.setIsAlive(false);
						break;
					}
					
				}
				if (ini==Igor.getInitiative()) {
					//calcul de l'attaque et des dégats
					attaque=Igor.aleatoire(Igor.getAttaque());
					degats=attaque-Bob.getDefense();
					if (degats<=0) degats=0;
					
					//diminution des point de vie de l'adversaire
					Bob.setPointsDeVie(Bob.getPointsDeVie()-degats);
					
					//afficher le message d'attaque
					System.out.print("\n"+Igor.getNom()+" attaque avec une puissance de : "+attaque+
							"\n"+Bob.getNom()+" a une defense de : "+Bob.getDefense()+
							"\nLes dommages sont donc de : "+degats+"\n");
					
					//Évaluation s'il est mort
					if (Bob.getPointsDeVie()<=0) {
						Bob.setPointsDeVie(0);
						Bob.setIsAlive(false);
						break;
					}
					
				}
			}
			
			
			//affichage des statistiques
			System.out.print("\n-----------------\nINFOS PERSONNAGES\n-----------------\n\n");
			Bob.affichePersonnage();
			Igor.affichePersonnage();
			
			//modification de l'initiative
			Bob.setInitiative(Bob.aleatoire(100));
			Igor.setInitiative(Igor.aleatoire(100));
			
			System.out.print("****************************************\n");
			tour+=1;
			
		} while (Bob.getIsAlive() && Igor.getIsAlive());//tant que les 2 sont en vie
		
		if (Bob.getIsAlive()) System.out.print("\n"+Bob.getNom()+" gagne le combat !!!");
		if (Igor.getIsAlive()) System.out.print("\n"+Igor.getNom()+" gagne le combat !!!");

	}

}
