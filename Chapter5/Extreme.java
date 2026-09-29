import java.util.Scanner;

public class Extreme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many values do you want to input: ");
        int count = input.nextInt();

        if (count > 0) {
            System.out.print("Enter integer 1: ");
            int number = input.nextInt();

            int min = number;
            int max = number;

            for (int counter = 2; counter <= count; counter++) {
                System.out.printf("Enter integer %d: ", counter);
                number = input.nextInt();

                if (number < min) {
                    min = number;
                }

                if (number > max) {
                    max = number;
                }
            }

            int sum = min + max;

            System.out.printf("%nMinimum value is: %d%n", min);
            System.out.printf("Maximum value is: %d%n", max);
            System.out.printf("Sum of two extremes is: %d%n", sum);
        } else {
            System.out.println("No values were entered.");
        }
    }
}
