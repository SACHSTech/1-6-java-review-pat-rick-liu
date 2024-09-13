package gr11review.part1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** 
 * A program Review2.java, that prints out a joke depending on what the user asks
 * @Patrick-liu
 */
public class Review2 {
    public static void main(String[] args) throws IOException{
        // Declaring variables
        int intOption; 

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // Get input values
        System.out.println("0 - print a joke about your hair");
        System.out.println("1 - print a joke about your feet");
        System.out.println("2 - print a joke about your clothes");
        System.out.println("3 - print a joke about your teacher");
        System.out.print("Choose a menu option: ");
        intOption = Integer.parseInt(keyboard.readLine()) ;
       
            // Joke output depending on the number chosen
            if(intOption == 0){
                System.out.println("Why do bees have sticky hair?");
                System.out.println("They always use honeycombs.");
            }
            else if(intOption == 1){
                System.out.println("What sort of snacks do feet like?");
                System.out.println("Dori-toes");
            }
            else if(intOption == 2){
                System.out.println("What did the policeman say to the criminal who hid in a laundry basket?");
                System.out.println("You're under a vest!");
            }
            else if(intOption == 3){
                System.out.println("Why did the boy eat his homework?");
                System.out.println("Because the teacher said it was a piece of cake!");
            }
            else{
                System.out.println("Invalid menu option");
            }

        
    }
}
