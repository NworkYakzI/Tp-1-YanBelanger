
import personnage.Personnage;
import combat.CompteurDeTour;
import combat.AffichageEcran;

public class JeuGladiateurs {

    public static void main(String[] args) {
        CompteurDeTour tour = new CompteurDeTour();
        AffichageEcran affichage = new AffichageEcran();
        Personnage personnage1 = new Personnage("Bob le malchanceux",15,15,70,15); //L'initialisation du personnage doit se faire dans le constructeur
        Personnage personnage2 = new Personnage("Igor l'empaleur",25,5,00,30); //L'initialisation du personnage doit se faire dans le constructeur
        

		//affichage des statistiques
        affichage.afficherSeparateurInfosPerso();
		personnage1.afficherInfosPersonnage();
		personnage2.afficherInfosPersonnage();
		
		//message d�but
		System.out.print("<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>\n<<<<< Que le combat commence ! >>>>>\n<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>\n");
		
		do {
			
			tour.afficheTour();
			
			for (int ini=0;ini<=100;ini++) {
				if (ini==personnage1.getInitiative()) {
					personnage1.frapperPersonnage(personnage2);
					if (!personnage2.getIsAlive())break;
				}
				if (ini==personnage2.getInitiative()) {
					personnage2.frapperPersonnage(personnage1);
					if (!personnage1.getIsAlive())break;
				}
				
			}
			//affichage des informations des personnages
			affichage.afficherSeparateurInfosPerso();
			personnage1.afficherInfosPersonnage();
			personnage2.afficherInfosPersonnage();
			
			//modification des initiatives de chaques personnages
			personnage1.setNewIniRandom();
			personnage2.setNewIniRandom();

			//augmentation de 1 au nombre de tour
			tour.augmenteTour();
			
		} while (personnage1.getIsAlive() && personnage2.getIsAlive());//tant que les 2 sont en vie
		
		affichage.afficheVictoire(personnage1, personnage2);
        
        
        
        
        
        
        
        
    }

}