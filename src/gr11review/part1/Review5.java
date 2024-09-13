package gr11review.part1;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader; 

public class Review5{
    public static void main (String[] args) throws IOException{
        //Declaring variables
        double dblInvestedAmount;
        double dblInterestRate;
        double dblTargetAmount; 
        int intNumberOfYears = 0;

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // Asks user for information
        System.out.println("Enter the yearly amount invested: ");
        dblInvestedAmount = Double.parseDouble(keyboard.readLine());
        System.out.println("Enter the compound interest rate: ");
        dblInterestRate = Double.parseDouble(keyboard.readLine());
        System.out.println("Enter the target amount: ");
        dblTargetAmount = Double.parseDouble(keyboard.readLine());

        // Solves the number of years it would take to 
        while(dblInvestedAmount < dblTargetAmount){
            dblInvestedAmount += dblInvestedAmount * (dblInterestRate / 100);
            dblInvestedAmount += 100;
            intNumberOfYears++;
        }
        System.out.println("The target amount will be earned in " + intNumberOfYears + " years.");

    }
}