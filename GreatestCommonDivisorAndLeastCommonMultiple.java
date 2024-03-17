import java.util.Scanner;

public class GreatestCommonDivisorAndLeastCommonMultiple {
    public static void main(String[] args) {

        //Program to find greatest common divisor
        //and least common multiple

        Scanner input = new Scanner(System.in);
        int number1,number2;
        int gcd = 1;  //GreatestCommonDivisor
        int lcm = 1;   //LeastCommonMultiple

        System.out.print("pleae enter number1: ");
        number1 = input.nextInt();
        System.out.print("pleae enter number2: ");
        number2 = input.nextInt();

        boolean flag = true;
        int x;
        if(number1 >= number2){
            for (int i = 1; i <= number2; i++) {   // to find greatest common divisor
                if((number1%i==0) && (number2%i==0)){
                    gcd = i;
                }
            }
            x = number1;
            while(flag==true){   // to find least common multiple
                if((x%number1==0) && (x%number2==0)){
                    lcm = x;
                    flag = false;
                }
                else{
                    x++;
                }
            }
        }
        else{
            for (int i = 1; i <= number1; i++) {
                if((number1%i==0) && (number2%i==0)){
                    gcd = i;
                }
            }
            x = number2;
            while(flag==true){
                if((x%number1==0) && (x%number2==0)){
                    lcm = x;
                    flag = false;
                }
                else{
                    x++;
                }
            }
        }

        System.out.println("Greatest Common Divisor: " +gcd);
        System.out.println("Least Common Multiple: " +lcm);


    }
}
