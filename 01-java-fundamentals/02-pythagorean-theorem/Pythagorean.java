import java.lang.Math;

public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        Double c= Math.sqrt( ((legA) * (legA)) + ((legB) * (legB)));
        return c;
    }
}
