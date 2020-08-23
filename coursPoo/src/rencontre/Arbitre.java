package rencontre;

public class Arbitre {

	 private String nom;

	public Arbitre(String nom) {
		this.nom = nom;
		System.out.println("L'arbitre " + getNom() + " est créé");
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public  String siffleDebut1() {
		
		return "L'arbitre " + getNom() + " siffle le debut de la première mi-temps!";
	}
	public  String siffleDebut2() {
		
		return "L'arbitre " + nom + " siffle le debut de la deuxième mi-temps!";
	}
	public  String siffleFin1() {
		
		return "L'arbitre " + nom + " siffle la fin de la première mi-temps!";
	}
	public  String siffleFin2() {
		
		return "L'arbitre " + nom + " siffle la fin de la rencontre!";
	}

@Override
public String toString() {
	return "Arbitre [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
			+ "]";
}
	
	
}
