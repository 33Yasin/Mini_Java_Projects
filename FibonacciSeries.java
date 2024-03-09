import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        //The Fibonacci series is a series of numbers in
        //which each number is the sum of the two numbers before it.
        //For example, if the first two numbers are 0 and 1,
        //the Fibonacci series will be as follows:
        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, etc.

        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("please enter a number: ");
        number = input.nextInt();

        int first_number = 0;
        int second_number = 1;
        int after_number = 1 ;

        System.out.print(first_number + ",");
        System.out.print(second_number + ",");
        System.out.print(after_number + ",");
        //0,1,1,


        for (int i = 0; i < number-2; i++) {
            first_number = second_number;
            second_number = after_number;
            after_number = first_number +second_number;
            System.out.print(after_number + ",");
        }


    }
}
