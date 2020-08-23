package rencontre;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Equipe extends Adversaire {


    private List<Joueur> joueurs = new ArrayList<>();
    
    

	public Equipe(String name, Joueur... joueurs) {
		super(name, (Object) joueurs);
    	// Programmation défensive, garantir la cohérence des données à la
    	// construction
    	Objects.requireNonNull(name, "name cannot be null");// Defensive programming
    	Objects.requireNonNull(joueurs, "joueurs cannot be null");// Defensive programming
    	if (joueurs.length <=1 || joueurs.length > 11) { // Defensive programming
    	    throw new IllegalArgumentException("le nombre de joueurs doit être compris entre 2 et 11");
    	}

    	for (Joueur joueur : joueurs) {
    	    addJoueur(joueur);
    	}
    	System.out.println(getName() + " créée");
    }	
        public void addJoueur(Joueur joueur) {

        	joueurs.add(joueur);
        	System.out.println("Joueur "+ joueur.getName() + " ajouté à " + getName());
        }

        
               
		@Override
		public String toString() {
			return getName();
			
		}
		
    
}
