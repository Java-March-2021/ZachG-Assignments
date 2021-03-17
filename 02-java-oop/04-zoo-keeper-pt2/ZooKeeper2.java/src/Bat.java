
public class Bat extends Mammal {
	
	private int defaultEnergy = 300;
	
	public Bat() {
		this.energyLevel = defaultEnergy;
	}
	
	public void fly() {
		this.energyLevel -= 50;
		System.out.println("Whoosh");
	}

	public void eatHumans() {
		this.energyLevel += 25;
		System.out.println("Munch Munch");
	}
	
	public void attackTown() {
		this.energyLevel -= 100;
		System.out.println("Fire roaring");
	}
}
