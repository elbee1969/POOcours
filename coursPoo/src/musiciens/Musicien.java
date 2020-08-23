package musiciens;

public abstract class Musicien {

	protected String nom;
	protected Instrument instrument;


	public Musicien(String nom, Instrument instrument) {
		this.nom = nom;
		this.instrument = instrument;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	
	public Instrument getInstrument() {
		return instrument;
	}


	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}


	//M�thode sans corps qui ne dit rien d'autre de ce qu'elle doit faire
	//la premi�re classe concr�te qui �tend Musicien doit impl�menter la m�thode
	public abstract void play();
	

	public void toto() {
		System.out.println("methode concrete dans classe abstraite");
	}
}