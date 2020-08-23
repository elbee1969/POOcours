package rencontre;

public abstract class Rencontre {
	
	protected Adversaire adversaire1;
	protected Adversaire adversaire2;
	protected Joueur joueur2;
	protected Joueur joueur1;
	protected Equipe equipeA;
	protected Equipe equipeB;
	protected static Arbitre arbitre;
	static int a = 0;
	static int b = 0;
	
	public Rencontre(Adversaire adversaire1, Adversaire adversaire2, Arbitre arbitre) {
		this.adversaire1 = adversaire1;
		this.adversaire2 = adversaire2;
		Rencontre.arbitre = arbitre;
	}
	public Adversaire getAdversaire1() {
		return adversaire1;
	}
	public void setAdversaire1(Adversaire adversaire1) {
		this.adversaire1 = adversaire1;
	}
	public Adversaire getAdversaire2() {
		return adversaire2;
	}
	public void setAdversaire2(Adversaire adversaire2) {
		this.adversaire2 = adversaire2;
	}

	
  public abstract void jouerMatch();


}
