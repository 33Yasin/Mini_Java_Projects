import java.util.Scanner;

public class FindNumberOfDigits {
    public static void main(String[] args) {

        //Program that finds the number of digits of a number
        //entered by the user and prints it on the screen

        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter a number: ");
        number = input.nextInt();

        int i =  1;
        int number_of_digits = 0;
        if(number >= 0){
            if(number == 0){
                number_of_digits = 1;
            }
            else{
                while (number / i > 0){
                    i *= 10;
                    number_of_digits++;
                }
            }
        }
        else{
            while ((-number) / i > 0){
                i *= 10;
                number_of_digits++;
            }
        }

        System.out.println("Number of digits: " +number_of_digits);

    }
}
