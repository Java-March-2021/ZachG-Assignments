public class PythagoreanTest {
    public static void main (String[] args) {
        Pythagorean p = new Pythagorean();
        Double hypotenuse1 = p.calculateHypotenuse(3,9);
        Double hypotenuse2 = p.calculateHypotenuse(6,12);
        System.out.println(hypotenuse1);
        System.out.println(hypotenuse2);
    }
}
