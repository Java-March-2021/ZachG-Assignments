
public class Samurai extends Human {
	private static int defaultHealth = 200;
	private static int numSamurai = 0;
	
	public Samurai() {
		
	}
	
	public Samurai(int defaultHealth) {
		this.health = defaultHealth;
		Samurai.numSamurai += 1;
	}

	public int getDefaultHealth() {
		return defaultHealth;
	}

	public void setDefaultHealth(int defaultHealth) {
		Samurai.defaultHealth = defaultHealth;
	}
	
	public static int howMany() {
		return Samurai.numSamurai;
	}
	
	public void deathBlow(Human a ) {
		a.health = 0;
		Samurai.defaultHealth = (Samurai.defaultHealth/2);
	}
	
	public void meditate() {
		this.health = Samurai.defaultHealth;
	}
	

}
