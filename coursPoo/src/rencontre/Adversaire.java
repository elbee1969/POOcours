package rencontre;

public abstract class Adversaire {

	protected String name;
	

	public Adversaire(String name, Object... object) {
		super();
		this.name = name;
	}


	public Adversaire(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

