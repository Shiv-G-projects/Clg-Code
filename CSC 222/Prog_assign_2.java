
import java.util.*;

public class Prog_assign_2 {
    public static void main(String[] args){
        
        // Input
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of miles: ");
        float numMiles = keyboard.nextFloat();
        System.out.print("Enter the number of yards: ");
        float numYards = keyboard.nextInt();

        // Process
        double numSteps = ((double)numMiles * 1760.0) + (numYards);

        //Output
        System.out.printf("Number of steps: %.0f \n", numSteps);



    }
}
