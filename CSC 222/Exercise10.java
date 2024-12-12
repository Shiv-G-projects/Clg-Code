
import java.io.*;
import java.util.*;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("File name: ");
        String filename = keyboard.nextLine();

        String[] dictionary = new String[10];
        Scanner inputstream = null;

        try {
            inputstream = new Scanner(new File(filename));
        }
        catch (FileNotFoundException e) 
        {
            System.out.println("Error: file not found " + filename);
            System.exit(0);
        }

        int i = 0;
        while(inputstream.hasNext()){
            dictionary[i] = inputstream.nextLine();
            i++;    
        }
        for(int j = 0; j<dictionary.length;j++)
            System.out.println(dictionary[j]); 

        while (true) { 
            System.out.print("Search for word: ");
            String target = keyboard.nextLine();

            if (target.equals("stop") || target.equals( "Stop")){
                System.out.println("Bye");
                break;
            }
            boolean flag = false;
            for (int k = 0; k < dictionary.length;k++){
                if (target.equals(dictionary[k])){
                    flag = true;
                    System.out.println(target + " is found at position " + k);
                }
            }
            if (!flag){
                System.out.println(target + "is NOT found"); 
            }

        }
    }

}
