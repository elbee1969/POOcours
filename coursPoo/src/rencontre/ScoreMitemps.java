package rencontre;

import java.util.Random;

public abstract class ScoreMitemps implements Scores {
	
	


	@Override
	public void scoreMitemps() {
		// TODO Auto-generated method stub
		voirScoreMitemps();
	}

	 private static int randomInt() {
		    return new Random().nextInt(scoreMax + 1);
		  }
	static int[] voirScoreMitemps() {
		// TODO Auto-generated method stub
		int[] score = new int[2];
	    score[0] = randomInt();
	    score[1] = randomInt();
	    return score;
	}

	
}
