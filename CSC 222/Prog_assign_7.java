import java.util.*;

public class Prog_assign_7 {
    public static void main(String[] args) {
        double[] in_nums = new double[5];
        double[] differences = new double[5];
        //input
        Scanner keyboard = new Scanner(System.in);

        //array generation
        for (int num = 1; num <= 5; num++) {
            System.out.println("Enter a number: ");
            double num1 = keyboard.nextDouble();
            in_nums[num - 1] = num1;
        }
        // calculate avg
        double average = average(in_nums);
        System.out.println("The average is:" + average);

        //create array for differences
        for (int num = 1; num <= 5; num++) {
            if (average > in_nums[num-1]){
                System.out.println("The number " + in_nums[num-1] + " is " + (average - in_nums[num-1]) + " below than the average");
            }
            else if (average < in_nums[num-1]){
                System.out.println("The number " + in_nums[num-1] + " is " + (in_nums[num-1] - average) + " above than the average");
            }
            else if (average == in_nums[num-1]){
                System.out.println("The number " + in_nums[num-1] + " is equal to the average");
            }
        }


        
    }
    public static double average (double in_nums1[]) {
        double average1 = (in_nums1[0]+in_nums1[1]+in_nums1[2]+in_nums1[3]+in_nums1[4])/5;
        return average1;
    }
}
