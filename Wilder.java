public class Wilder{

	private String firstName;
	private boolean aware;

	public Wilder( String name , boolean awake ) {
		this.firstName = name;
		this.aware =awake;
	}

	public String getFirstName() {
		return this.firstName;
	}
	
	public boolean isAware() {
		return this.aware;
	}
	
	public void setFirstName( String name ) {
		this.firstName = name;
	}

	public void setAware( boolean awake ) {
		this.aware = awake;
	}

	public String whoAmI() {
		if ( this.aware ) return "Je m'appelle " + this.firstName + " et je suis aware";
		return "Je m'appelle " + this.firstName + " et je ne suis pas aware";
	}
}
