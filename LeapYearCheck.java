import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {

        //Leap years are years that are multiples of the number 4: 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024, etc.
        //Among the years that are multiples of 100, only those that are divisible by 400 without remainder are leap years:
        //For example, the years 1200, 1600, and 2000 are leap years, but 1700, 1800, and 1900 are not leap years.

        Scanner input = new Scanner(System.in);

        int year;
        System.out.print("Enter a year please: ");
        year = input.nextInt();

        if ((year % 4 == 0) && (year % 100 != 0)) {
            System.out.println(year + " is a leap year.");
        } else if ((year % 100 == 0 && year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }


    }
}
