
public class Human {
	private int strength = 3;
	private int intelligence = 3;
	private int stealth = 3;
	private int health = 100;
	
	public Human() {
		
	}
	
//	public void Wizard(int strength, int intelligence, int stealth, int health) {
//		this.strength = strength;
//		this.intelligence = intelligence;
//		this.stealth = stealth;
//		this.health = health;
//	}
//	public void Ninja(int strength, int intelligence, int stealth, int health) {
//		this.strength = strength;
//		this.intelligence = intelligence;
//		this.stealth = stealth;
//		this.health = health;
//	}
//	public void Samurai(int strength, int intelligence, int stealth, int health) {
//		this.strength = strength;
//		this.intelligence = intelligence;
//		this.stealth = stealth;
//		this.health = health;
//	}
	
	public int getStrength() {
		return strength;
	}
	
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	public int getIntelligence() {
		return intelligence;
	}
	
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	
	public int getStealth() {
		return stealth;
	}
	
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public void attack(Human h) {
		h.setHealth(h.getHealth() - this.getStrength());
		System.out.println("Attack!");
	}
	
	public int displayHealth() {
		int healthLevel = this.getHealth();
		System.out.println(healthLevel);
		return healthLevel;
	}

}
