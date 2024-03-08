import java.util.Scanner;

public class PrimeNumberControl {
    public static void main(String[] args) {

        //To check whether a number is prime or not,
        //it is necessary to check whether the number is divisible
        //by any number other than itself and 1.

        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("please enter a number: ");
        number = input.nextInt();

        boolean flag = true;
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                flag = false;
                break;
            }
        }

        if (flag == true){
            System.out.println(number + " is a prime.");
        }
        else{
            System.out.println(number + " is not a prime.");
        }

    }
}
