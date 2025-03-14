import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Assignment_1 {
    public static void main (String [] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter size of shopping cart: ");
        int cartSize = keyboard.nextInt();
        int[] shopCart = new int[cartSize];
        ArrayList<Integer> cartSmaller  = new ArrayList<>(); 
        ArrayList<Integer> cartBigger  = new ArrayList<>(); 
        Random randomNumber = new Random(12345); 
        double tempNum = 0;
        double cartSmallerSum = 0;
        double cartBiggerSum = 0;
        double tempNum1 = 0;

        for (int i = 0; i < shopCart.length; i++){
            int randomInteger = randomNumber.nextInt(201);
            shopCart[i] = randomInteger;
        }
        System.out.println("shopCart Array: " + Arrays.toString(shopCart));

        for (int i = 0; i < shopCart.length; i++){
            if (shopCart[i] <= 75){
                cartSmaller.add(shopCart[i]);
            }
        }
        System.out.println("cartSmaller Array: " + cartSmaller);

        for (int i = 0; i < shopCart.length; i++){
            if (shopCart[i] > 75){
                cartBigger.add(shopCart[i]);
            }
        }
        System.out.println("cartBigger Array: " + cartBigger);

        for (int i = 0; i < cartSmaller.size(); i++){
            cartSmallerSum = cartSmaller.get(i) + tempNum;
            tempNum = cartSmallerSum;
        }
        double cartSmallerAvg = cartSmallerSum/cartSmaller.size();
        System.out.println("cartSmallerSum: " + cartSmallerSum);
        System.out.printf("cartSmallerSum Average: %.2f\n" ,cartSmallerAvg );

        for (int i = 0; i < cartBigger.size(); i++){
            cartBiggerSum = cartBigger.get(i) + tempNum1;
            tempNum1 = cartBiggerSum;
        }
        double cartBiggerAvg = cartBiggerSum/cartBigger.size();
        System.out.println("cartSmallerSum: " + cartBiggerSum);
        System.out.printf("cartSmallerSum Average: %.2f\n" ,cartBiggerAvg );

    }
}