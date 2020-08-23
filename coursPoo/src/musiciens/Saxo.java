package musiciens;

public class Saxo extends Instrument implements Vent{
	
	

	public Saxo(String instrument) {
		super(instrument);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String use() {
		return getInstrument();
	}

	@Override
	public String makeSound() {
		return "WooooWoooooo";
		
	}

}
