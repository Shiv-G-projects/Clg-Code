import java.util.Scanner;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public void input(){
        System.out.println("Enter the length of Side 1: ");
        Scanner keyboard = new Scanner(System.in);
        side1 = keyboard.nextDouble();
        System.out.println("Enter the length of Side 2: ");
        side2 = keyboard.nextDouble();
        System.out.println("Enter the length of Side 3: ");
        side3 = keyboard.nextDouble();
        keyboard.close();
        if (side1 + side2 < side3 || side2 + side3 < side2 || side1 + side3 < side2 ){
            System.out.println("Invalid side length(s)");
            input();
        }
    }
    public double perimeter(){
        double perim = side1+side2+side3;
        return perim;
    }
    public boolean isEquilateral(){
        Boolean equi = false;
        if (side1 == side2 && side1 == side3 && side2 == side3){
            equi = true;
        }
        return equi;
    }
    public double area(){
        double ar;
        double heron = (side1+side2+side3)/2;
        ar = (heron*(heron-side1)*(heron-side2)*(heron-side3));
        return ar;
    }

    public void output(){
        System.out.printf("The sides of the triangle are: %.2f, %.2f, %.2f\n" , side1, side2, side3);
        System.out.printf("The perimeter of the triangle is: %.2f\n" , perimeter());
        if (isEquilateral() == true){
            System.out.println("The triangle is equilateral\n");
        }
        else if (isEquilateral() == false){
            System.out.println("The triangle is NOT equilateral");
        }
        System.out.printf("The area of the triangle is: %.2f\n" , area());

    }
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.input();
        t1.output();
    }
}

