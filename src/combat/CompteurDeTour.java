
package combat;

public class CompteurDeTour {
	
	public int noTour;

    //Constructeur
    public CompteurDeTour() {
        
    	this.noTour=1;
    }

    //getters et setters
    public int getNoTour() {
		return noTour;
	}
	public void setNoTour(int noTour) {
		this.noTour = noTour;
	}

	//methode pour augmenter le tour de 1
    public void augmenteTour() {
        this.setNoTour(this.getNoTour()+1);
    }

    //methode pour afficher le message du tour actuel
    public void afficheTour() {
    	System.out.print("\n---------------\nTOUR ACTUEL: "+this.getNoTour()+"\n---------------\n");
    }
}
