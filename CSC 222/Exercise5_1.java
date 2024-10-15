import java.util.*;

public class Exercise5_1 {
 public static void main(String[] args) {
    // inital conditions
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the number of lines:");
    int r = keyboard.nextInt();

    // processing

    for (int step = 1; step <= r; step++) {

        for (int n = 1; n < (step+1); n++) { 
            if (n==1) {
                System.out.print("*");
            }
            else {
                for (int w = 1; w <=2; w++){
                    System.out.print("*");
                    }
                } 
        } 
  
        System.out.println("");
    } 
    }
}
