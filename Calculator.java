import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //variables
        double number1,number2;
        double total = 0;
        String operation;

        //get number1 number2 and sign
        System.out.println("please enter number1: ");
        number1 = input.nextDouble();
        System.out.println("please enter number2: ");
        number2 = input.nextDouble();
        System.out.println("choose operation: ");
        operation = input.next();


        switch (operation){
            case "+":
                total = number1 + number2;
                break;
            case "-":
                total = number1 - number2;
                break;
            case "*":
                total = number1 * number2;
                break;
            case "/":
                total = number1 / number2;
                break;
        }

        System.out.println("Result is: " +total);

    }
}
