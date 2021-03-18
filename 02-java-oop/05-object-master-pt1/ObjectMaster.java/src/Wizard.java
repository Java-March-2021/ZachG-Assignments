
public class Wizard extends Human {
	private int defaultHealth = 50;
	private int defaultIntelligence = 8;
	
	public Wizard() {
		
	}
	
	
	public Wizard(int defaultIntelligence, int defaultHealth) {
		this.defaultHealth = defaultHealth;
		this.defaultIntelligence = defaultIntelligence;
	
	}
	public int getDefaultHealth() {
		return defaultHealth;
	}
	
	public void setDefaultHealth(int health) {
		this.health = health;
	}
	public int getDefaultIntelligence() {
		return defaultIntelligence;
	}
	
	public void setDefaultIntelligence(int intelligence) {
		this.defaultIntelligence = intelligence;
	}
	
	public void heal(Human a) {
		a.setHealth(a.getHealth() + this.getDefaultIntelligence());
		System.out.println("Healed");
	}
	
	public void fireball(Human b) {
		b.setHealth(b.getHealth() - this.getDefaultIntelligence() *3);
		System.out.println("Fireball");
	}
}
