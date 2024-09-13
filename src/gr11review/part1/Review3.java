package gr11review.part1;
import java.io.IOException;

/** 
 * A program Review3.java, that prints the odd numbers from 21 to 100 and the prints the numbers from 29 to 2
 * @ Patrick Liu
 */
public class Review3 {
    public static void main(String[] args) throws IOException{
        // Prints odd numbers from 21 to 100
         for(int i  = 21 ; i < 100; i+=2){
            System.out.println(i);
         }
         System.out.println();
         // Prints numbers from 29 to 2
         for(int k  = 29 ; k > 1; k--){
            System.out.println(k);
         }
        
    }
}
