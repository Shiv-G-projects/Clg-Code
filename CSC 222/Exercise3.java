import java.util.*;

public class Exercise3 {
    public static void main(String[] args) {
        Boolean flag;
        //input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the year:");
        int numYear = keyboard.nextInt();
        

        //solution 1
        int cond4 = numYear % 4;
        int cond400 = numYear % 400;
        int cond100 = numYear % 100;
        if (numYear < 100 && cond4 == 0) {
            flag = true;

        }
        else if (cond100 == 0 && cond400 == 0) {
            flag = true;
        }
        else if (cond100 != 0 && cond4 == 0) {
            flag = true;
        }
        else {
            flag = false;
        } 

        //solution 2
        if ((numYear % 4) == 0){
            flag = true;
            if ((numYear % 400) != 0 && (numYear % 100) == 0){
                flag = false;
            }
        }
        else {
            flag = false;
        }

        // solution 3
        if ((cond4 == 0) || ((cond100 == 0 && cond400 == 0)) || (cond100 != 0 && cond4 == 0)){
            flag = true;
        }
        else{
            flag = false;
        }

        //output

        if (flag == true){
            System.out.println("The year " + numYear + " is a leap year");
        }
        else {
            System.out.println("The year " + numYear + " is not a leap year");
        }
    }
}
