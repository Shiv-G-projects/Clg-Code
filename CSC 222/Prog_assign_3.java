import java.util.*;
class Prog_assign_3 {
    
    public static void main(String[] args) {
        // initial setup
        final double default_price = 99.0;
        Scanner keyboard = new Scanner(System.in);

        //input

        System.out.print("Enter the quantity of packages: ");
        int packages = keyboard.nextInt();
        double discount = calculateDiscount(packages);
        double discount_amt = discount * (default_price * packages);
        double total = (default_price * packages) - discount_amt;

        System.out.printf("The discount amount is %.2f%n", discount_amt);
        System.out.printf("The final amount is %.2f%n", total);



    }
private static double calculateDiscount(int packages){
    if (packages >= 10){
        return 0.10;
    }
    else if (packages >= 20){
        return 0.20;
    }
    else if (packages >= 50){
        return 0.30;
    }
    else if (packages >= 100){
        return 0.40;
    }
    else{
        return 0.0;
    }
}
}
