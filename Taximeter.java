import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args) {

        //Taximeter costs 2.20 TL per kilometer.
        //Short distance fee is 20 TL. For fares under 20 TL, 20 TL will still be charged.
        //Taximeter opening fee is 10 TL.

        Scanner input = new Scanner(System.in);
        double km,total_cost;
        double costs_per_km = 2.20;
        double opening_fee = 10;
        double short_distance_fee = 20;

        System.out.println("How many kilometers were traveled by taxi?");
        km = input.nextDouble();

        total_cost = opening_fee + km * costs_per_km;

        if(total_cost <= 20){
            System.out.println("Total cost is: " +short_distance_fee);
        }
        else{
            System.out.println("Total cost is: " +total_cost);
        }



    }
}
