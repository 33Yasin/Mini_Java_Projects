import java.util.Scanner;

public class FindEvenNumbers {
    public static void main(String[] args) {

        //Program that finds even numbers up to the number entered by the user
        Scanner input = new Scanner(System.in);
        int number;
        boolean flag = true;

        //Run the program until the user types an odd number
        while (flag){
            System.out.print("Enter a number: ");
            number = input.nextInt();
            if(number % 2 == 0){
                System.out.println(number + " is even.");
            }
            else{
                System.out.println(number + " is not even.");
                flag = false;
            }
        }


    }
}
