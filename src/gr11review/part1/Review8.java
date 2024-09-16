package gr11review.part1;
import java.io.IOException;
import java.util.Random; 
/** 
 * A program Review8.java, runs a slot machine 1000 times and finds the 
 * number of times the slots had three numbers that are the same.
 * 
 * This program uses a for loop to repeat the process 1000 times,
 * then prints the number of triples at the end.
 * 
 * @Patrick-liu
 */
public class Review8{

    /**
     * Main Method to execute the main program logic.
     * 
     * @param args Command-line arguments (not used).
     * @throws IOException If there is an error during input.
     */
    public static void main(String[] args) throws IOException{
        Random randomSlotNumber = new Random();
        int intFirst;
        int intSecond;
        int intThird;
        int intTriples = 0;
        
        // Runs the program 1000 times, and increases a counter when all three numbers are the same
        for(int i = 0; i < 1000; i++){
            intFirst = randomSlotNumber.nextInt(8);
            intSecond = randomSlotNumber.nextInt(8);
            intThird = randomSlotNumber.nextInt(8);
            System.out.println(intFirst + " " + intSecond + " " + intThird);
            if (intFirst == intSecond && intFirst ==intThird){
                intTriples++;
            }
        }
        System.out.println(intTriples);
    }
}
