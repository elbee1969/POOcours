package musiciens;

public class Guitard extends Instrument implements Corde {

	public Guitard(String instrument) {
		super(instrument);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String use() {
		return getInstrument();
		// TODO Auto-generated method stub
		//System.out.println(" joue de la " + getInstrument());
	}


	@Override
	public String makeSound() {
		// TODO Auto-generated method stub
		return "griiilinngGrilliiiing";

	}
}
