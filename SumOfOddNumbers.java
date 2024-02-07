import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        //Program that adds odd numbers from entered numbers and prints them on the screen

        Scanner input = new Scanner(System.in);
        int number;                     //to keep the number from the user
        int total = 0;                  //to keep the sum of odd numbers
        String yes_no = "";             //to keep whether the user will continue or not
        boolean isTrue = true;          //to loop

        //As long as isTrue
        while (isTrue){
            System.out.print("enter a number please: ");
            number = input.nextInt();
            if(number % 2 != 0){            //If it is not divisible by 0, it is an odd number.
                total += number;            //add odd numbers
            }
            else{
                System.out.print("Do you want to continue: ");
                yes_no = input.next();
                if(!yes_no.equalsIgnoreCase("yes")){        //If the yes_no value is not equal to the string "yes"
                    isTrue = false;
                }
            }
        }

        System.out.println("Total is: " +total);

    }
}
