import java.util.ArrayList;

public class BasicJava {
    public void printNum(int number){
        for(int i = 0; i <= number; i++){
            System.out.println(i);
        }
    }
    public void printOdd(int number){
        for(int i = 0; i <= number; i = i + 2){
            System.out.println(i);
        }
    }
    public void printSum(int number){
        int newNum = 0;
        int sum = 0;
        for(int i = 1; i <= number; i++){
            newNum = i;
            sum += i;
            System.out.println("New number: " + newNum + " " + "Sum: " + sum);
        }
    }
    public void printArray(int [] number){
        for (int i = 0; i < number.length; i++){
            System.out.println(i);
        }
    }
    public int maxValue(int[] input){
        int max = input[0];
        for(int i = 1; i < input.length; i++){
            if(i < input[i]){
                max = input[i];
            }
        }
        return max;
    }
    public double getAverage(int[] input){
        double avg = 0;
        double total = 0;
        for(int i = 0; i < input.length; i++){
            total += input[i];
            avg = total/(input.length);
        }
        return avg;
    }
    public ArrayList<Integer> printOdds(ArrayList<Integer> odds, int input){
        for(int i = 0; i <= input; i++){
            if(i % 2 != 0){
                odds.add(i);
            }
        }
        return odds;
    }
    public int greaterThan(int[] input, double max){
        int total = 0;
        for(int i = 0; i < input.length; i++){
            if(input[i] >= max){
                total += 1;
            }
        }
        return total;
    }
    public int[] squareValues(int[] input){
        for(int i = 0; i < input.length; i++){
            input[i] = input[i]*input[i];
        }
        return input;
    }
    public int[] noNegatives(int[] input){
        for(int i = 0; i< input.length; i++){
            if(input[i]< 0){
                input[i] = 0;
            }
        }
        return input;
    }
    public ArrayList<Double> maxMinAvg(Integer[] input, ArrayList<Double> output){
        double max = 0;
        double min = 0;
        double total = 0;
        double avg = 0;
        for(int i = 0; i < input.length; i++){
            total += input[i];
            if(i < input[i]){
                max = input[i];
            }
            if(i > input[i]){
                min = input[i];
            }
        }
        avg = total/input.length;
        output.add(max);
        output.add(min);
        output.add(avg);
        return output;
    }
    public int[] shiftValues(int[] input){
        for(int i = 1; i < input.length; i++){
            input[i-1] = input[i];
        }
        input[input.length-1] = 0;
        return input;
    }
}
