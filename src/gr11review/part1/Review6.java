package gr11review.part1;
import java.io.IOException;
import java.io.BufferedReader;
import java.text.DecimalFormat;
import java.io.InputStreamReader; 

// import java.io.*; 

/** 
 * A program Review6.java, that asks for the costs of items from the user, 
 * then calculates the total cost with tax.
 * 
 * This program uses a while loop to continue asking the user for the price
 * of the item until they input 0 as the price.
 * 
 * @author: Patrick-liu
 */
public class Review6{
    /**
     * Main Method to execute the main program logic.
     * 
     * @param args Command-line arguments (not used).
     * @throws IOException If there is an error during input.
     */
    public static void main (String[] args) throws IOException{
        // Declare and initialize variables
        double dblSubtotal = 0; 
        double dblCurrentItem = 1;
        DecimalFormat formatCurrency = new DecimalFormat("#,##0.00");
        
        // Set up keyboard input
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // Asking user for number of items
        while (dblCurrentItem != 0){ // loop stops when user inputs 0
            System.out.print("Enter the price for an item: ");
            dblCurrentItem = Double.parseDouble(keyboard.readLine());
            dblSubtotal += dblCurrentItem;
        }
        // Billing information
        System.out.println("Subtotal: $" + formatCurrency.format(dblSubtotal));
        System.out.println("Tax: $" + formatCurrency.format(dblSubtotal * 0.13));
        System.out.println("Total: $" + formatCurrency.format(dblSubtotal * 1.13));

    }
}

