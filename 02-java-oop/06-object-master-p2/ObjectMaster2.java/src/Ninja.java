
public class Ninja extends Human {
	private int defaultStealth = 10;
	
	public Ninja() {
		
	}
	
	public Ninja(int defaultStealth) {
		this.setDefaultStealth(defaultStealth);
	}

	public int getDefaultStealth() {
		return defaultStealth;
	}

	public void setDefaultStealth(int defaultStealth) {
		this.defaultStealth = defaultStealth;
	}
	
	public void steal(Human a) {
		a.health -= this.stealth;
		this.health += this.stealth;
		System.out.println("Stolen");
	}
	
	public void runAway() {
		this.health -= 10;
		System.out.println("ran away");
	}

}
