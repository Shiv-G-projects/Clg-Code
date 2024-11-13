import java.util.*;

public class Exercise7 {
    public static void main(String[] args) 
    {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Enter ten numbers: ");
            int[] nums = new int[10];
            for (int f = 0; f < 10; f++) nums[f] = keyboard.nextInt();
    
            int maxNum = max(nums);
            int[] sortedNums = sort(nums);
    
            System.out.println("The maximum number is: " + maxNum);
            System.out.print("The sorted numbers: ");
            for (int n : sortedNums) System.out.print(n + " ");
    }
    public static int max(int[] arr) 
    {
        int m = arr[0];
        for (int n : arr) 
        {
            if (n > m) m = n;
        }
        return m;
    }

    public static int[] sort(int[] lst) 
    {
        int[] sortarr = Arrays.copyOf(lst, lst.length);
        Arrays.sort(sortarr);
        return sortarr;
    }
}
