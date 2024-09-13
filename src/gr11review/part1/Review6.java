package gr11review.part1;
import java.io.IOException;
import java.io.BufferedReader;
import java.text.DecimalFormat;
import java.io.InputStreamReader; 

public class Review6{
    public static void main (String[] args) throws IOException{
        // Variables
        int intItemNumber = 1;  
        double dblSubtotal = 0; 
        double dblCurrentItem = 1;
        DecimalFormat df = new DecimalFormat("#,###.00");

        // Asking user for number of items
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        while (dblCurrentItem != 0){
            System.out.println("Enter the price for item " + intItemNumber + ": ");
            dblCurrentItem = Double.parseDouble(keyboard.readLine());
            dblSubtotal += dblCurrentItem;
            intItemNumber++;
        }
        // Billing information
        System.out.println("Subtotal: $" + df.format(dblSubtotal));
        System.out.println("Tax: $" + df.format(dblSubtotal * 0.13));
        System.out.println("Total: $" + df.format(dblSubtotal * 1.13));

    }
}

