import java.util.*;
public class Prog_assign_5 {

    public static void main(String[] args) {
        int num = 1;
        int n = 1;
        //input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int rows = keyboard.nextInt();

        while (n <= rows){
            if (isprime(num) == true){
                if (n % 10 == 1){
                    String suf = "st";
                    System.out.println("The " + n + suf + " prime number is: " + num);
                    num = num + 1;
                    n = n+1;
                }
                else if (n % 10 == 2){
                    String suf = "nd";
                    System.out.println("The " + n + suf + " prime number is: " + num);
                    num = num + 1;
                    n = n+1;
                }
                else if (n % 10 == 3){
                    String suf = "rd";
                    System.out.println("The " + n + suf + " prime number is: " + num);
                    num = num + 1;
                    n = n+1;
                }
                else{
                    String suf = "th";
                    System.out.println("The " + n + suf + " prime number is: " + num);
                    num = num + 1;
                    n = n+1;
                }
            }
            else{
                num = num + 1;
            }
        }
    }

    public static boolean isprime(int num){
        boolean t_f = true;
        if (num == 0 || num == 1){
            return false;
        }
        else if (num > 1) {
            for (int i = 2; i <= (num/2); i++){
                if ((num % i) == 0)
                {
                t_f = false;
                break;
                }
            }
            
        }
        else {
            t_f = true;
        }
        return t_f;
}
}
