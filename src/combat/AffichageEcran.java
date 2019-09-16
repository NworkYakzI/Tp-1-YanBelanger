
package combat;

import personnage.Personnage;


public class AffichageEcran {

    // -------------------------------------------------------------------------
    public void afficherSeparateurDeTour() {
    	System.out.print("\n****************************************\n");
    }

    // -------------------------------------------------------------------------
    public void afficherSeparateurInfosPerso() {
    	System.out.print("\n-----------------\nINFOS PERSONNAGES\n-----------------\n\n");
    }

    // -------------------------------------------------------------------------
    public void afficheVictoire(Personnage personnage1, Personnage personnage2) {
    	if (personnage1.getIsAlive()) System.out.print("\n"+personnage1.getNom()+" gagne le combat !!!");
		if (personnage2.getIsAlive()) System.out.print("\n"+personnage2.getNom()+" gagne le combat !!!");
    }
}
