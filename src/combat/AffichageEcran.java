
package combat;

import personnage.Personnage;
import personnage.Mirmillon;
import personnage.Retiaire;


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
    public void afficheVictoire(Mirmillon personnage1, Retiaire personnage2) {
    	if (personnage1.getIsAlive()) System.out.print("\n"+personnage1.getNom()+" le "+personnage1.getCategorie()+" gagne le combat !!!");
		if (personnage2.getIsAlive()) System.out.print("\n"+personnage2.getNom()+" le "+personnage2.getCategorie()+" gagne le combat !!!");
    }
}
