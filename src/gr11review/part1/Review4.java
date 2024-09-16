package gr11review.part1;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat; 
import java.io.BufferedReader;

/** 
 * A program Review4.java, that asks for the costs of items from the user, then calculates the total cost with tax
 * @Patrick-liu
 */
public class Review4{
    /**
     * Main Method to execute the main program logic.
     * 
     * @param args Command-line arguments (not used).
     * @throws IOException If there is an error during input.
     */
    public static void main (String[] args) throws IOException{
        // Variables
        int intNumberOfItems; 
        double dblSubtotal = 0; 
        
        DecimalFormat df = new DecimalFormat("#,##0.00");
        // Asking user for number of items
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("How many items do you want to buy? ");
        intNumberOfItems = Integer.parseInt(keyboard.readLine());

        for (int i = 1; i < intNumberOfItems + 1; i++){
            System.out.print("Enter the price for item " + i + ": ");
            dblSubtotal += Double.parseDouble(keyboard.readLine());
        }
        // Billing information
        System.out.println("Subtotal: $" + df.format(dblSubtotal));
        System.out.println("Tax: $" + df.format(dblSubtotal * 0.13));
        System.out.println("Total: $" + df.format(dblSubtotal * 1.13));

    }
}
