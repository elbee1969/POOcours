package rencontre;

import java.util.Random;

public abstract class ScoreFinal implements Scores {

	
	@Override
	public void scoreFinal() {
		int a = 0;
		// TODO Auto-generated method stub
		voirScoreFinal(a );
	}

	private static int randomInt() {
	    return new Random().nextInt(scoreMax + 1);
	  }
	
	static int[] voirScoreFinal(int a) {
		// TODO Auto-generated method stub
		int[] score = new int[1];
		
	    score[0] = randomInt();
	    if(a >= score[0]) {
	    	score[0] = a;
	    }else if(score[0] > a) {
	    	score[0] = (score[0] + a) - a ;
	    }
	    
	    return score;
	}


}
