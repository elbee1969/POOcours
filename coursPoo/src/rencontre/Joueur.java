package rencontre;

public class Joueur extends Adversaire {
	
	private String name;

	public Joueur(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		this.name = name;
	    System.out.println( "Le joueur " + getName() + " a été créé");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
