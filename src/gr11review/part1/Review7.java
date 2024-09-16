package gr11review.part1;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader; 

/** 
 * A program Review7.java, that asks the user for a sentence and finds the number of characters, 
 * the number of spaces, the number of a's, and prints a dash for every odd character
 * 
 * This program uses a for loop to analyze each character of the sentence individually, to find
 * the total number of characters, the number of spaces, the number of a's and the number of dashes
 * to output
 * 
 * @Patrick-liu
 */
public class Review7{
    /**
     * Main Method to execute the main program logic.
     * 
     * @param args Command-line arguments (not used).
     * @throws IOException If there is an error during input.
     */
    public static void main (String[] args) throws IOException{
        // Declare and initialize variables
        String theSentence;
        int intNumberOfSpaces = 0;
        int intNumberOfA = 0;
        // Set up keyboard input
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("");
        theSentence = (keyboard.readLine());

        // Finding number of spaces and number of a's
        for(int i = 0; i < theSentence.length() - 1;i ++){
            if(theSentence.charAt(i) == ' '){
                intNumberOfSpaces++;
            }
            if(theSentence.charAt(i) == 'a'){
                intNumberOfA++;
            }
        }
        
        // Prints the output
        System.out.println("There are " + theSentence.length() + " characters in the sentence.");
        System.out.println("There are " + intNumberOfSpaces + " spaces in the sentence.");
        System.out.println("There are " + intNumberOfA + " letter a in the sentence.");
        for(int i = 0; i < (theSentence.length()+1)/2;i++ ){
            System.out.print("-");
        }
        

    }
}
