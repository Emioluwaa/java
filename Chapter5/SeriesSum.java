public class SeriesSum {
    public static void main(String[] args) {
        
        // start our bucket at 0. using long as requested
        long sum = 0;
        
        // print a simple table header
        System.out.println("n       Sum");
        System.out.println("----------------");
        
        // loop from 1 to 100
        for (int n = 1; n <= 100; n++) {
            // toss the current number into the sum bucket
            sum = sum + n; 
            
            // print n and the sum using simple spacing
            System.out.printf("%-7d %d\n", n, sum);
        }
    }
}
