import java.util.Scanner;

public class BusTicketPrice {
    public static void main(String[] args) {

        //Create a program in Java that calculates bus ticket prices based on distance and situations.
        //Receive Distance (KM), age and trip type (One Way, Round Trip) information from the user and
        // the price per distance is 0.10 TL / km. First, calculate the total price of the trip and then
        // apply the following discounts to the customer according to the conditions;
        //The values received from the user must be valid (distance and age values must be positive numbers,
        // trip type must be 1 or 2). Otherwise, the user will be told "You have entered incorrect data!" A warning should be given.
        //If the person is under 12 years old, a 50% discount is applied on the ticket price.
        //If the person is between the ages of 12-24, a 10% discount is applied to the ticket price.
        //If the person is over 65 years old, a 30% discount is applied on the ticket price.
        //If the person has selected "Trip Type" round trip, a 20% discount is applied on the ticket price.
        //Sample Output
        //Enter the distance in km: 1500
        //Enter your age: 20
        //Enter the trip type (1 => One Way, 2 => Round Trip): 2
        //Total Amount = 216 TL

        Scanner input = new Scanner(System.in);

        double distance,age;
        int trip_type;
        double price = 0;
        double price_per_km = 0.1;

        System.out.println("How many kilometers will you travel?");
        distance = input.nextDouble();
        System.out.println("How old are you");
        age = input.nextDouble();
        System.out.println("select trip type: 1:one way or 2:round trip");
        trip_type = input.nextInt();

        price = distance*price_per_km;

        if(distance>0 && age>0 && trip_type==1 ){
            if(age<12){
                price *= 0.50;
            }
            else if(age>=12 && age<24){
                price *= 0.90;
            }
            else if(age>=65){
                price *= 0.70;
            }
            System.out.println("Your ticket price is: " +price +"$");
        }
        else if(distance>0 && age>0 && trip_type==2 ){
            if(age<12){
                price *= 0.50 * 0.80;
            }
            else if(age>=12 && age<24){
                price *= 0.90 * 0.80;
            }
            else if(age>=65){
                price *= 0.70 * 0.80;
            }
            else{
                price *= 0.80;
            }
            System.out.println("Your ticket price is: " +price +"$");
        }
        else{
            System.out.println("You have entered incorrect data!");
        }




    }
}
