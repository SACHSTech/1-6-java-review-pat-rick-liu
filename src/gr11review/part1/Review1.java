package gr11review.part1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Review1 {
    public static void main(String[] args) throws IOException{
        // Declaring variables
        int intMonth;
        int intDay;
        int intTotal = 0; 

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader keyboard2 = new BufferedReader(new InputStreamReader(System.in));

        // Get input values
        System.out.println("Input the month number:");
        intMonth = Integer.parseInt(keyboard.readLine()) ;
        System.out.println("Input the day number:");
        intDay = Integer.parseInt(keyboard2.readLine());

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
