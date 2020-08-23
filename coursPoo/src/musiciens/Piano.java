package musiciens;

public class Piano extends Instrument implements Corde{

	public Piano(String instrument) {
		super(instrument);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String use() {
		return getInstrument();
	}

	@Override
	public String makeSound() {
		// TODO Auto-generated method stub
		return "doiiinnnng";
	}
}
