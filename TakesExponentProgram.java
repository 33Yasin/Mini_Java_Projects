import java.util.Scanner;

public class TakesExponentProgram {
    public static void main(String[] args) {

        //Write a program that takes the exponent
        //with the values entered by the user

        Scanner input = new Scanner(System.in);
        double a,b;
        double result = 1;

        System.out.print("Number to Expose: ");
        a = input.nextDouble();
        System.out.print("Number to be Base: ");
        b = input.nextDouble();

        for (int i = 0; i < b; i++) {
            result *= a;
        }

        System.out.println("Result is: " +result);

    }
}
