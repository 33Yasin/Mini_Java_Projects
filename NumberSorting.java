import java.util.Scanner;

public class NumberSorting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //get three number from user
        int number1, number2, number3;
        System.out.println("Enter number1 please: ");
        number1 = input.nextInt();
        System.out.println("Enter number2 please: ");
        number2 = input.nextInt();
        System.out.println("Enter number3 please: ");
        number3 = input.nextInt();

        //sort in ascending order
        if(number1>number2 && number2>number3){
            System.out.println("Sorting is: " + number1 +" - " +number2 + " - " +number3);
        }
        else if(number1>number3 && number3>number2){
            System.out.println("Sorting is: " + number1 +" - " +number3 + " - " +number2);
        }
        else if(number2>number1 && number1>number3){
            System.out.println("Sorting is: " + number2 +" - " +number1 + " - " +number3);
        }
        else if(number2>number3 &&  number3>number1){
            System.out.println("Sorting is: " + number2 +" - " +number3 + " - " +number1);
        }
        else if(number3>number1 &&  number1>number2){
            System.out.println("Sorting is: " + number3 +" - " +number1 + " - " +number2);
        }
        else{
            System.out.println("Sorting is: " + number3 +" - " +number2 + " - " +number1);
        }



    }
}
