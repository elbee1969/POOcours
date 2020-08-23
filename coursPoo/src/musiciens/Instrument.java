package musiciens;

public abstract class Instrument {
	
	protected String instrument;
	
	public Instrument(String instrument) {

		this.instrument = instrument;
	}

	public String getInstrument() {
		return instrument;
	}

	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}
	
	public abstract String use();
}
