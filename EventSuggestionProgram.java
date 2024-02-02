import java.util.Scanner;

public class EventSuggestionProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //get temperature information
        int temperature;
        System.out.println("What is the temperature?");
        temperature = input.nextInt();

        //select event by condition
        if(temperature < 5){
            System.out.println("you can ski");
        }
        else if(temperature>=5 && temperature<15){
            System.out.println("you can go to the theater");
        }
        else if(temperature>=15 && temperature<25){
            System.out.println("you can barbecue");
        }
        else{
            System.out.println("you can go swimming");
        }

    }
}
