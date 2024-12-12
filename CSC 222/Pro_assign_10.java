import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pro_assign_10 {
    public static void main (String [] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter count: ");
        int count = keyboard.nextInt();

        int[] dictionary = new int[15];
        Scanner inputstream = null;
        try {
            inputstream = new Scanner(new File("C:\\Users\\srish\\OneDrive\\Documents\\Coding\\CSC 222\\data.txt"));
        }   
        catch (FileNotFoundException e) 
        {
            System.out.println("Error: file not found");
            System.exit(0);
        }

        int i = 0;
        while(inputstream.hasNext()){
            dictionary[i] = inputstream.nextInt();
            i++;    
        }

        if (count < 15){
        int summation = 0;
        System.out.println("Here are the numbers:");
        for (int n=0; n<count; n++){
            summation += dictionary[n];
            System.out.println(dictionary[n]);
        }
        System.out.println("Here is the sum:");
        System.out.println(summation);
        }
        else if (count>15){
            System.out.println("Whoopsy daisy you there darned entered the wrong number of rows pardner.");
        }
    }
}
