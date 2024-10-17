import java.util.*;

public class Exercise6 {
    public static void main(String[] args) {
        instructions();
        draw_shape(menu());

}

    public static void instructions() {
        String inst = "\nEnter 1 to draw a triangle\nEnter 2 to draw a diamond\nEnter 3 to quit";
        System.out.println(inst);

}
    public static int menu() {
        System.out.println("Enter your choice (1/2/3): ");
        Scanner keyboard = new Scanner(System.in);
        int choi = keyboard.nextInt();
        return choi;

}
    public static void draw_shape(int choi) {
        if (choi == 1){
            draw_triangle(get_size(), get_char());
        }
        else if (choi == 2){
            draw_diamond(get_size(), get_char());
        }
        else if (choi == 3){
            System.exit(0);
        }
}
    public static int get_size() {
        System.out.println("Enter the size of your shape: ");
        Scanner keyboard = new Scanner(System.in);
        int size_shape = keyboard.nextInt();
        return size_shape;
}
    public static char get_char() {
        System.out.println("Enter the character you want your shape to use: ");
        Scanner keyboard = new Scanner(System.in);
        char c = keyboard.next().charAt(0);
        return c;

}
    public static void draw_triangle(int size, char c) {
        System.out.println("");
        for (int step = 1; step <= size; step++) {

            for (int n = 1; n < (step+1); n++) { 
                if (n==1) {
                    System.out.print(c);
                }
                else {
                    for (int w = 1; w <=2; w++){
                        System.out.print(c);
                        }
                    } 
            } 
      
            System.out.println("");
        } 

}
    public static void draw_diamond(int size, char c){
        System.out.println("");
		int m = 1;
		int n;
		while (m <= size) {
            n = 1;
			while (n++ <= (size - m)) {
				System.out.print(" ");
			}
            n = 1;
			while (n++ <= m * 2 - 1) {
				System.out.print(c);
			}
			System.out.println();
			m++;
		}
        draw_bottom(size, c);
}
    public static void draw_bottom(int size, char c) {
            int n;
            int m = size - 1;
		while (m > 0) {
			n = 1;
			while (n++ <= (size - m)) {
				System.out.print(" ");
			}
            n = 1;
			while (n++ <= m * 2 - 1) {
				System.out.print(c);
			}
			System.out.println();
			m--;
		}
        } 
}
