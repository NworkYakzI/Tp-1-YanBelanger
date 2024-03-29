
import personnage.Personnage;
import personnage.Mirmillon;
import personnage.Retiaire;
import combat.CompteurDeTour;
import combat.AffichageEcran;

public class JeuGladiateurs {

    public static void main(String[] args) {
        CompteurDeTour tour = new CompteurDeTour();
        AffichageEcran affichage = new AffichageEcran();
        Mirmillon personnage1 = new Mirmillon("Bob le malchanceux",15,15,70,15); //L'initialisation du personnage doit se faire dans le constructeur
        Retiaire personnage2 = new Retiaire("Igor l'empaleur",25,5,100,30); //L'initialisation du personnage doit se faire dans le constructeur
        

		//affichage des statistiques
        affichage.afficherSeparateurInfosPerso();
		personnage1.afficherInfos();
		personnage2.afficherInfos();
		
		//message d�but
		System.out.print("\n<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>\n<<<<< Que le combat commence ! >>>>>\n<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>\n");
		
		do {
			
			tour.afficheTour();
			
			//boucle d'initiative de 0 � 100
			for (int ini=0;ini<=100;ini++) {
				
				//si l'initiative est celle du premier personnage
				if (ini==personnage1.getInitiative()) {
					//personnage 1 attauqe le personnage 2
					personnage1.attaquer(personnage2);
					//si le personnage 2 est mort on arrete tout
					if (!personnage2.getIsAlive())break;
				}
				
				//Si l'initiative est celle du deuxieme personnage
				if (ini==personnage2.getInitiative()) {
					//le 2e personnage attauqe le premier
					personnage2.attaquer(personnage1);
					//si le premier personnage meurt on arrete tout
					if (!personnage1.getIsAlive())break;
				}
				
			}
			//affichage des informations des personnages
			affichage.afficherSeparateurInfosPerso();
			personnage1.afficherInfos();
			personnage2.afficherInfos();
			
			//modification des initiatives de chaques personnages
			personnage1.setNewIniRandom(30);
			personnage2.setNewIniRandom(100);

			//augmentation de 1 au nombre de tour
			tour.augmenteTour();
			
			//afficher separateur de tour
			affichage.afficherSeparateurDeTour();
			
		} while (personnage1.getIsAlive() && personnage2.getIsAlive());//tant que les 2 sont en vie
		
		//afficher qui est le vainqueur
		affichage.afficheVictoire(personnage1, personnage2);
        
        
        
        
        
        
        
        
    }

}
