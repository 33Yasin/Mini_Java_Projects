import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        //For a number to be a perfect number,
        //the sum of its positive divisors,
        //excluding itself, must be equal to itself.

        Scanner input = new Scanner(System.in);
        int number;
        int total = 0;
        System.out.print("please enter a number: ");
        number = input.nextInt();

        for (int i = 1; i < number; i++) {
            if(number%i==0){
                total += i;
            }
        }

        if(total == number){
            System.out.println(number + " is a perfect number.");
        }
        else{
            System.out.println(number + " is not a perfect number.");
        }


    }
}
