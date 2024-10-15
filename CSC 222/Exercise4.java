public class Exercise4 {
    public static void main(String[] args) {
        System.out.println("Celsius\tFahrenheit");
        int c = 0;
        while (c<=20)
        {
            double f = ((1.8)*c) + 32;
            System.out.printf("%d\t%.2f\n", c, f);
            c ++;
        }
        
    }
}
