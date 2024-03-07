import java.util.Scanner;

public class TriangleWithStars {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;  //to hold the number entered by the user
        System.out.print("please enter a number: ");
        number = input.nextInt();

        int star = 1;  //to keep track of the number of stars
        int blank = number - star; //to keep the number of blanks

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < blank; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < star; k++) {
                System.out.print("*");
            }
            System.out.println();  //to move to the next line at the end of each round
            blank--;
            star+=2;
        }

    }
}
