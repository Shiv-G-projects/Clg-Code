
import java.util.*;

public class Prog_assign_2_1 {
    public static void main(String[] args){
        
        // Input
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of steps: ");
        int numSteps = keyboard.nextInt();

        // Process
        int numMiles = numSteps / 1760;
        int numYards = numSteps % 1760;

        //Output
        System.out.printf("Number of miles: %d \n", numMiles);
        System.out.printf("Number of Yards: %d \n", numYards);


    }
}
