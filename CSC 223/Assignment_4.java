import java.util.Arrays;
import java.util.Random;

public class Assignment_4 {
    public static void main(String[] args) {
        int[] numArray = new int[1000000];
        Random random1 = new Random(12345);

        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = random1.nextInt(1000);
        }

        int searchValue1 = 1001; 
        int searchValue2 = 274;   

        //unsorted operations
        long unsortedSeqTime1 = timeSequentialSearch(numArray, searchValue1);
        long unsortedSeqTime2 = timeSequentialSearch(numArray, searchValue2);
        
        //sorted operations
        Arrays.sort(numArray);

        long sortedSeqTime1 = timeSequentialSearch(numArray, searchValue1);
        long sortedSeqTime2 = timeSequentialSearch(numArray, searchValue2);

        long sortedBinaryTime1 = timeBinarySearch(numArray, searchValue1);
        long sortedBinaryTime2 = timeBinarySearch(numArray, searchValue2);

        //printing results
        System.out.printf("Sequential Search (Unsorted) - Value 1001: %d ns%n", unsortedSeqTime1);
        System.out.printf("Sequential Search (Unsorted) - Value 274: %d ns%n", unsortedSeqTime2);
        System.out.printf("Sequential Search (Sorted) - Value 1001: %d ns%n", sortedSeqTime1);
        System.out.printf("Sequential Search (Sorted) - Value 274: %d ns%n", sortedSeqTime2);
        System.out.printf("Binary Search (Sorted) - Value 1001: %d ns%n", sortedBinaryTime1);
        System.out.printf("Binary Search (Sorted) - Value 274: %d ns%n", sortedBinaryTime2);

        //Discussing results
        System.out.println("The search time of the sequential search for the unsorted array vs the sorted array does not vary much to search for 1001, as the program still has to go through each element.");
        System.out.println("The search time of the sequential search for the unsorted array vs the sorted array increases, as 274 is likely found earlier in the unsorted array/");
        System.out.println("Binary search is obviously faster than sequential search, as the number of element accesses are less, and it makes, at most, 20 decisions. ");
    }

    static long timeSequentialSearch(int[] array, int value) {
        long startTime = System.nanoTime();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                break;
            }
        }
        return System.nanoTime() - startTime;
    }

    static long timeBinarySearch(int[] array, int value) {
        long startTime = System.nanoTime();
        Arrays.binarySearch(array, value);
        return System.nanoTime() - startTime;
    }


}
