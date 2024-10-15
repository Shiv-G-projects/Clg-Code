import java.util.*;

public class Prog_assign_4 {
    public static void main(String[] args) {

    // initial conditions
    boolean loop_condition = true;
    Scanner keyboard = new Scanner(System.in);
    int red = 0;
    int blue = 0;
    int yellow = 0;
    

    // adding to variables based on user input
    while (loop_condition = true){

        System.out.print("Enter the color of the marble (or 'q' to quit): ");
        String m = keyboard.next();
        
        if (m.equals("r")){
            red = red + 1;
        }
        else if (m.equals("b")){
            blue = blue + 1;
        }
        else if (m.equals("y")){
            yellow = yellow + 1;
        }
        else if (m.equals("q")){
            break;
        }
    }
    
    // printing values
    System.out.println("Red: " + red + "\t" + "Blue: " + blue + "\t" + "Yellow: " + yellow);
    System.out.println("Total: " + (red+blue+yellow));

    // determining winners
    while (loop_condition = true){
    if (red>blue && red>yellow){
        System.out.println("Red Wins!");
        break;
    }
    else if (blue>red && blue>yellow){
        System.out.println("Blue Wins!");
        break;
    }
    else if (yellow>blue && yellow>red){
        System.out.println("Yellow Wins!");
        break;
    }
    else{
        Random rand = new Random();
        int rand_int1 = rand.nextInt(1000);
        int rand_int2 = rand.nextInt(1000);
        int rand_int3 = rand.nextInt(1000);
        red = red + rand_int1;
        blue = blue + rand_int2;
        yellow = yellow + rand_int3;
    }
    }
}
}