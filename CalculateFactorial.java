import java.util.Scanner;

public class CalculateFactorial {
    public static void main(String[] args) {

        //Write a program in Java that
        // calculates the factorial of the value entered by the user.

        Scanner input = new Scanner(System.in);
        int number;
        int result = 1;

        System.out.print("Please enter a number: ");
        number = input.nextInt();

        for (int i = number; i >= 1 ; i--) {
            result *= i;
        }
        System.out.println("Result is: " +result);

    }
}
