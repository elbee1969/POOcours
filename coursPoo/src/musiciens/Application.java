package musiciens;

import java.util.ArrayList;
import java.util.List;

class Application {
	
	//champs visible uniquement lors d'une instance car change en fonction de l'intance
	public String instanceField = "";
	//"static" : champs visible dans la classe, si methode = methode utilitaire car ne change jamais.
	//Mais tout ce qui est staic n'est pas utilitaire
	public static String classField = "coucou";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Guitariste guitariste = new Guitariste("Paul", "Guitare"); Avant l'abstraction
		//Après abstraction:
		//Musicien guitariste = new Guitariste("Paul", "Guitare");
		//avec typage
		Saxo saxo = new Saxo("saxo");
		saxo.makeSound();
		Guitard guitard = new Guitard("guitard");
		Guitard guitardE = new Guitard("Guitard Elec");
		guitard.makeSound();
		//sans typage
		Instrument piano = new Piano("piano à queue");
		Musicien saxophoniste = new Saxophoniste("Pierre",saxo);
		Musicien guitariste = new Guitariste("Marc", guitard);
		Musicien pianiste = new Pianiste("Paul", piano);
		//Musicien pianniste = new Pianniste("jean", "Pianno");
		//Ici on appelle le play de Musicien
		// A l'execution c'est la methode play des classes concrètes qui est invoquée
		// C'est ce que l'on appelle le Polymorphisme DYNAMIQUE  ou Invocation Dynamique
		/*guitariste.play();
		pianiste.play();
		saxophoniste.play();
		guitariste.toto();
		pianiste.toto();
		saxophoniste.toto();*/
		List <Musicos> musicians = new ArrayList<>();
		musicians.add(new Musicos("Mike",guitard));
		musicians.add(new Musicos("georges",piano));
		musicians.add(new Musicos("Peter", piano, saxo));
		play(musicians);
		
		
	}
		
	// Ici on appelle play de Musician
    // A l'exécution c'est la méthode play des classes concrètes qui est
    // invoquée
    // Polymorphisme "dynamique", invocation dynamique
    private static void play(List<Musicos> musicians) {
	for (Musicos musician : musicians) {
	    // System.out.println(instanceField);
	    musician.play();
	    //musician.makeSound();
	}
    }


}
