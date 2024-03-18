import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        //Program to find out whether the value
        //entered by the user is a palindrome number
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("please enter a number: ");
        number = input.nextInt();

        String x = String.valueOf(number);
        int num_length = x.length();   //find out how many digits the number has

        boolean flag = true;
        for (int i = 0; i < num_length/2; i++) {
            if(x.charAt(i) == x.charAt(num_length-i-1)){
                continue;
            }
            else{
                flag = false;
                break;
            }
        }

        if (flag == true){
            System.out.println(number + " is palindrome.");
        }
        else{
            System.out.println(number + " is not palindrome.");
        }



    }
}

