import java.util.Scanner;

public class SMS_Message_Size {
    public static void main(String[] args) {

        //Write a program in Java that
        // calculates the message length of the text entered by the user.
        // Each message has a character limit of 160 words.


        Scanner input = new Scanner(System.in);
        String text = "";   //to keep the message
        int text_length;    //to keep the number of characters
        int message_count;  //to keep message count
        System.out.print("Enter your message: ");
        text = input.nextLine();

        text_length = text.length();
        message_count = (text_length/160) + 1;

        System.out.println("Your message has " + text_length +" character.");
        System.out.println("Your message " + message_count +" SMS size.");



    }
}
