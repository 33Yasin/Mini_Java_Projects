import java.util.Scanner;

public class RepeatedNumbers {
    public static void main(String[] args) {

        //Write a program that finds repeating numbers in a sequence.

        Scanner input = new Scanner(System.in);
        int count,number;
        System.out.print("How many numbers will you enter: ");
        count = input.nextInt();
        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Please enter " + (i + 1) + ". number: ");
            number = input.nextInt();
            numbers[i] = number;
        }

        System.out.println("Duplicate numbers in the array and their frequencies:");
        for (int i = 0; i < numbers.length - 1; i++) {
            int count_t = 1; // Assume each number occurs at least once
            if (numbers[i] != -1) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        count_t++;
                        // Mark duplicates as -1 to skip them in subsequent comparisons
                        numbers[j] = -1;
                    }
                }
                if (count_t > 1) {
                    System.out.println(numbers[i] + " (occurs " + count_t + " times)");
                }
            }
        }



    }
}
