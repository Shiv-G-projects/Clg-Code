import java.util.*;


public class Exercise2 {
    public static void main(String[] args) {
        
        //input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of boys:");
        int numBoys = keyboard.nextInt();
        System.out.println("Enter the number of girls:");
        int numgirls = keyboard.nextInt();

        //processing
        double totalNum = numBoys + numgirls;
        System.out.println("Total number of students is " + (int)totalNum);
        double percentageBoys = (numBoys / totalNum) * 100;
        double percentageGirls = (numgirls / totalNum) * 100;

        //output
        System.out.printf("Percentage of boys: %.1f%% \n" ,percentageBoys);
        System.out.printf("Percentage of girls: %.1f%% \n" ,percentageGirls);

    }
}
