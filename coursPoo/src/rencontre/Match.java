package rencontre;

public class Match extends Rencontre {

	public Match(Adversaire adversaire1, Adversaire adversaire2, Arbitre arbitre) {
		super(adversaire1, adversaire2, arbitre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void jouerMatch() {

		// TODO Auto-generated method stub
		jouerMatchCollectif(equipeA,equipeB,arbitre);

		jouerMatchIndividuel(joueur1,joueur2,arbitre);
	}


	static void jouerMatchIndividuel(Joueur joueur1, Joueur joueur2, Arbitre arbitre) {
		// TODO Auto-generated method stub
		String rencontre = "Rencontre individuelle";
		Deroulement.deroulement(a,b,joueur1,joueur2, rencontre, arbitre);
	}

	public static void jouerMatchCollectif(Equipe equipeA, Equipe equipeB, Arbitre arbitre) {
		// TODO Auto-generated method stub
		String rencontre = "Rencontre collective";
		Deroulement.deroulement(a,b,equipeA,equipeB, rencontre, arbitre);
	}

}
