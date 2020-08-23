package rencontre;

public class Deroulement {



	public static void deroulement(int a, int b, Adversaire player1, Adversaire player2,String rencontre, Arbitre arbitre) {
		
		StringBuilder result = new StringBuilder();
		result.append("\n" + rencontre + " : \n");
	    result.append(player1.getName());
	    result.append(" vs ");
	    result.append(player2.getName());
	    result.append("\n" + arbitre.siffleDebut1());
	    result.append("\n déroulement de la rencontre ....");
	    result.append("\n" + arbitre.siffleFin1());
	    result.append("\n score à la mi-temps est de ");
	    a = ScoreMitemps.voirScoreMitemps()[0];
	    result.append(a);
	    result.append(" - ");
	    b = ScoreMitemps.voirScoreMitemps()[1];
	    result.append(b);
	    result.append("\n" + arbitre.siffleDebut2());
	    result.append("\n déroulement de la rencontre ....");
	    result.append("\n" + arbitre.siffleFin2());
	    result.append("\n le score final est de ");
	    result.append(ScoreFinal.voirScoreFinal((int) a)[0]);
	    result.append(" - ");
	    result.append(ScoreFinal.voirScoreFinal((int) b)[0]);
	    System.out.println(result.toString());
	}
}
