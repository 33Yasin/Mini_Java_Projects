import java.util.Scanner;

public class PowersOfTheNumber {
    public static void main(String[] args) {

        //We write a program that prints the powers of the number n
        // up to the entered number, where the value n is taken from the user.

        Scanner input = new Scanner(System.in);
        int n,limit_value;
        int i = 0;
        boolean flag = true;

        System.out.print("Enter n value: ");
        n = input.nextInt();
        System.out.print("Enter limit value: ");
        limit_value = input.nextInt();

        while (flag){
            if(Math.pow(n,i) <= limit_value){
                System.out.println(i + " is a power of the number n");
            }
            else{
                flag = false;
            }
            i++;
        }


    }
}
