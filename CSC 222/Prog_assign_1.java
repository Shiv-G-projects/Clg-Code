import java.util.*;

class Exercise1{
    public static void main(String[] args) {
        //input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the tempereture in Centigrade:");
        double numCelsius = keyboard.nextDouble();

        //process
        double numFahrenheit = (numCelsius * 9/5) + 32;

        //output
        System.out.println(numCelsius + " degrees Centigrade is " + numFahrenheit + " degrees Fahrenheit");
    }
}