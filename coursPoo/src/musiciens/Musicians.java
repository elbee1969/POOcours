package musiciens;

public  class Musicians {

	
	public Musicians(String nom, Instrument instrument) {
		// TODO Auto-generated constructor stub
		this.nom = nom;
	}
	private String nom;
	private String instrument;

	
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getInstrument() {
		return instrument;
	}


	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}


	public void play1() {
		System.out.println(getNom() + " playing " + getInstrument());
	};
	


}
