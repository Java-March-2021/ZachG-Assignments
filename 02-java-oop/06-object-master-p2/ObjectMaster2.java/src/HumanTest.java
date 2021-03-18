
public class HumanTest {

	public static void main(String[] args) {
		Human Simon = new Human();
		Human Brett = new Human();
		
		Simon.attack(Brett);
		Brett.attack(Simon);
		Brett.displayHealth();
		Simon.displayHealth();
		System.out.println(Simon.toString());
		
		Wizard Jr = new Wizard();
		
		Jr.fireball(Brett);
		Brett.displayHealth();
		
		Ninja Bob = new Ninja();
		Ninja Greg = new Ninja();
		
		Bob.steal(Greg);
		Greg.displayHealth();
		
		Samurai Buzz = new Samurai();
		Samurai Woody = new Samurai();
		
		Buzz.deathBlow(Woody);
		Woody.displayHealth();
		Buzz.displayHealth();
		Woody.meditate();
		Woody.displayHealth();
		Samurai.howMany();
	}

}
