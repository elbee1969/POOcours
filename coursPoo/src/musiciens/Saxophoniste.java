package musiciens;

/**
 * 
 * Classe repr�sentant un Saxophoniste
 * Classe = donn�es et op�rations sur ces m�mes donn�es encapsulation. membres
 *
 */
public class Saxophoniste extends Musicien  {
	/*
	 * D�clare les membres de la classe (champs, constructeur et m�thodes).
	 */
	//champs
	//private String nom;// pass� dans class abstraite
	//private String instrument;// pass� dans class abstraite
	
	//Constructeur avec typage
	public Saxophoniste(String nom, Saxo instrument) {
		//this.nom = nom;
		//this.instrument = instrument;
		//appel au constructeur parent avec la m�me signature
		//signature: nom ou methode, argument => ordre, nombre, type
		super(nom, instrument);
	}
	
	//Methode
	public void play() {
		//super est facultatif
		System.out.println("Le musicien " + super.getNom() + " joue du " + super.getInstrument());
	}
		
	

}
