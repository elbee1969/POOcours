package musiciens;

/**
 * 
 * Classe représentant un Saxophoniste
 * Classe = données et opérations sur ces mêmes données encapsulation. membres
 *
 */
public class Saxophoniste extends Musicien  {
	/*
	 * Déclare les membres de la classe (champs, constructeur et méthodes).
	 */
	//champs
	//private String nom;// passé dans class abstraite
	//private String instrument;// passé dans class abstraite
	
	//Constructeur avec typage
	public Saxophoniste(String nom, Saxo instrument) {
		//this.nom = nom;
		//this.instrument = instrument;
		//appel au constructeur parent avec la même signature
		//signature: nom ou methode, argument => ordre, nombre, type
		super(nom, instrument);
	}
	
	//Methode
	public void play() {
		//super est facultatif
		System.out.println("Le musicien " + super.getNom() + " joue du " + super.getInstrument());
	}
		
	

}
