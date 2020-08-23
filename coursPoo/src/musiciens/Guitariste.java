package musiciens;

/*
 * 
 * 
 */
public class Guitariste  extends Musicien {
	//constructeur avec typage
	
	public Guitariste(String nom,  Guitard instrument) {
		//this.nom = nom;
		super(nom, instrument);
	}
	
	public void play() {
		System.out.println("Le musicien " + super.getNom() + " joue de la " + super.getInstrument());
	}

	@Override
	public String toString() {
		return "Guitariste [nom=" + nom + ", getNom()=" + getNom() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

	


}
