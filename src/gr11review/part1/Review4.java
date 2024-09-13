package gr11review.part1;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat; 
import java.io.BufferedReader;

public class Review4{

    public static void main (String[] args) throws IOException{
        // Variables
        int intNumberOfItems; 
        double dblSubtotal = 0; 
        DecimalFormat df = new DecimalFormat("#,###.00");

        // Asking user for number of items
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many items would you like to buy? ");
        intNumberOfItems = Integer.parseInt(keyboard.readLine());

        for (int i = 1; i < intNumberOfItems + 1; i++){
            System.out.println("Enter the price for item " + i + ": ");
            dblSubtotal += Double.parseDouble(keyboard.readLine());
        }
        // Billing information
        System.out.println("Subtotal: $" + df.format(dblSubtotal));
        System.out.println("Tax: $" + df.format(dblSubtotal * 0.13));
        System.out.println("Total: $" + df.format(dblSubtotal * 1.13));

    }
}
