package musiciens;

/*
 * 
 * 
 */
public class Pianiste extends Musicien{
	//private String nom;
	
	//sans typage
	public Pianiste(String nom, Instrument instrument) {
		//this.nom = nom;

		super(nom, instrument);
	}

	public void play() {
		System.out.println("Le musicien " + super.getNom() + " joue du " + super.getInstrument());
	}

	@Override
	public String toString() {
		return "Pianniste [nom=" + nom + ", getNom()=" + getNom() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public void toto() {
		System.out.println("surcharge");
	}
	

}
