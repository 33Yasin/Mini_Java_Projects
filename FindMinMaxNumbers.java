import java.util.Scanner;

public class FindMinMaxNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        int number_count;
        int min_number = 99999;
        int max_number = -99999;
        System.out.print("How many numbers will you enter: ");
        number_count = input.nextInt();

        for (int i = 0; i < number_count; i++) {
            System.out.println("Enter " + (i+1) +". number: ");
            number = input.nextInt();
            if(number < min_number){
                min_number = number;
            }
            if(number >= max_number){
                max_number = number;
            }
        }
        System.out.println("smallest number is: " + min_number);
        System.out.println("biggest number is: " +max_number);

    }
}
