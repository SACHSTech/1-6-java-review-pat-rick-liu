package gr11review.part1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** 
 * A program Review1.java, that asks the user to enter a month number and a day number to determine the day of the year, assuming it is not a leap year
 * @ Patrick Liu
 */
public class Review1 {
    /**
     * Main Method to execute the main program logic.
     * 
     * @param args Command-line arguments (not used).
     * @throws IOException If there is an error during input.
     */
    public static void main(String[] args) throws IOException{
        // Declaring variables
        int intMonth;
        int intDay;
        int intTotal = 0; 

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // Get input values
        System.out.print("Enter the month number: ");
        intMonth = Integer.parseInt(keyboard.readLine()) ;
        System.out.print("Enter the day number: ");
        intDay = Integer.parseInt(keyboard.readLine());

        for(int i = intMonth - 1; i > 0; i--){
            if(i == 1 || i == 3 ||i == 5 || i == 7 || i == 8 || i == 10){
                intTotal += 31;
            }
            else if(i == 2){
                intTotal += 28;
            }
            else if(i == 4 || i == 6 || i == 9 || i == 11){
                intTotal += 30;
            }
        }
        intTotal += intDay;

        System.out.println(intTotal);
    }
}
