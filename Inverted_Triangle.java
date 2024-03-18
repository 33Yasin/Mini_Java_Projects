import java.util.Scanner;

public class Inverted_Triangle {
    public static void main(String[] args) {
        //A program that creates inverted triangles with stars

        Scanner input = new Scanner(System.in);

        int number;
        System.out.print("enter a number: ");
        number = input.nextInt();

        int star = 2 * number - 1;
        int blank = 1;

        for (int i = number; i > 0;  i--) {
            for (int k = 0; k < blank; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
            star -= 2;
            blank++;
        }


    }
}
