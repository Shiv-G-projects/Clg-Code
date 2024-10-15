import java.util.*;

public class Exercise5_2 {
    public static void main(String[] args) {
        //input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = keyboard.nextInt();

        // processing
        boolean prime = isprime(num);

        //output

        if (prime == true){
            System.out.println("The number is a prime number");
        }
        else if (prime == false){
            System.out.println("The number is not a prime number");
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