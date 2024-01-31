import java.util.Scanner;

public class CircleCalculate {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double r,area,circumference;

        //get radius
        System.out.println("Enter r value please: ");
        r = input.nextDouble();

        //calculate
        area = Math.PI * r * r;
        circumference = 2 * Math.PI * r;

        //write the console
        System.out.println("Area of the circle: " +area);
        System.out.println("Circumference of the circle: " +circumference);

    }
}
