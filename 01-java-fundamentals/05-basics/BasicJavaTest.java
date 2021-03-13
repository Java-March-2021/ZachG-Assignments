import java.util.ArrayList;
import java.util.Arrays;

public class BasicJavaTest{
    public static void main(String[] args) {
        BasicJava basicMethod = new BasicJava();
        int count = 255;
        basicMethod.printNum(count);
        basicMethod.printOdd(count);
        basicMethod.printSum(count);
        int [] myArray = {1,3,5,6,7};
        basicMethod.printArray(myArray);
        int[] maxValueArray = {1,3,5,7,9,0};
        System.out.println(basicMethod.maxValue(maxValueArray));
        int[] getAvgArray = {2, 10, 3};
        System.out.println(basicMethod.getAverage(getAvgArray));
        ArrayList<Integer> oddCount = new ArrayList<Integer>();
        ArrayList<Integer> oddCounter = basicMethod.printOdds(oddCount, count);
        System.out.println(oddCounter);
        double max = 3;
        int[] greaterThanArray = {1, 3, 5, 7};
        System.out.println(basicMethod.greaterThan(greaterThanArray,max));
        int[] sqValArray = {1, 5, 10, -2};
        System.out.println(Arrays.toString(basicMethod.squareValues(sqValArray)));
        int[] noNegArray = {1, 5, 10, -2};
        System.out.println(Arrays.toString(basicMethod.noNegatives(noNegArray)));
        Integer[] mmaArray = {1, 5, 10, -2};
        ArrayList<Double> mMA = new ArrayList<Double>();
        ArrayList<Double> maxminAvg = basicMethod.maxMinAvg(mmaArray, mMA);
        System.out.println(maxminAvg);
        int[] shiftValArray = {1, 5, 10, 7, -2};
        System.out.println(Arrays.toString(basicMethod.shiftValues(shiftValArray)));
    }
}
