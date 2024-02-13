import java.util.Scanner;

public class CalculateHarmonicSeries {
    public static void main(String[] args) {
        //Write a program to find the harmonic series of the entered number.

        Scanner input = new Scanner(System.in);
        int number;
        double result = 0;

        System.out.print("please enter a number: ");
        number = input.nextInt();

        for (int i = 1; i <= number ; i++) {
            result += (1.0 / i);
        }

        System.out.println("Result is: " +result);

    }
}
