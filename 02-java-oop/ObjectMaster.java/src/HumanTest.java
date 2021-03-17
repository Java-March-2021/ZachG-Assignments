
public class HumanTest {

	public static void main(String[] args) {
		Human Simon = new Human();
		Human Brett = new Human();
		
		Simon.attack(Brett);
		Brett.attack(Simon);
		Brett.displayHealth();
		Simon.displayHealth();
		System.out.println(Simon.toString());

	}

}
