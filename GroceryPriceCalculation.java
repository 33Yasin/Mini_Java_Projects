import java.util.Scanner;

public class GroceryPriceCalculation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //price of vegetables and fruits
        double cucumber_price = 2.14;
        double tomato_price = 2.25;
        double apple_price = 1.18;
        double carrot_price = 3.78;

        //variables
        double cucumber_kg, tomato_kg,apple_kg,carrot_kg,total_price;

        //get input values
        System.out.println("How many kilograms of cucumbers will you buy? ");
        cucumber_kg = input.nextDouble();
        System.out.println("How many kilograms of tomatoes will you buy? ");
        tomato_kg = input.nextDouble();
        System.out.println("How many kilograms of apples will you buy? ");
        apple_kg = input.nextDouble();
        System.out.println("How many kilograms of carrots will you buy? ");
        carrot_kg = input.nextDouble();

        //calculate total price
        total_price = (cucumber_kg*cucumber_price + tomato_kg*tomato_price
                    + apple_kg*apple_price +carrot_kg*carrot_price);

        //write the console
        System.out.println("Total price is: " +total_price);

    }
}
