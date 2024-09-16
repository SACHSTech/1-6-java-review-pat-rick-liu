package gr11review.part1;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader; 

/** 
 * A program Review5.java, that takes the amount added each year, 
 * the compound interest rate and the target amount, to tell the 
 * user how many years it would take to reach the target amount
 * 
 * This program uses
 * 
 * @Patrick-liu
 */

public class Review5{
    /**
     * Main Method to execute the main program logic.
     * 
     * @param args Command-line arguments (not used).
     * @throws IOException If there is an error during input.
     */
    public static void main (String[] args) throws IOException{
        //Declaring variables
        double dblInvestedAmount = 0;
        double dblInterestRate = 0;
        double dblTargetAmount = 0; 
        double dblCurrent = 0; 
        int intNumberOfYears = 0;

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // Asks user for information
        System.out.print("Enter the yearly invested amount: ");
        dblInvestedAmount = Double.parseDouble(keyboard.readLine());
        System.out.print("Enter the compound interest rate: ");
        dblInterestRate = Double.parseDouble(keyboard.readLine());
        System.out.print("Enter the target amount: ");
        dblTargetAmount = Double.parseDouble(keyboard.readLine());

        // Solves the number of years it would take to 
        while(dblCurrent < dblTargetAmount){
            dblCurrent = (dblCurrent + dblInvestedAmount) * ((dblInterestRate / 100) + 1);
            intNumberOfYears++;
        }
        System.out.println("The target amount will be earned in " + intNumberOfYears + " years.");

    }
}