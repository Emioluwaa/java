import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
  System.out.print("Enter radius: ");
    int radius = input.nextInt();

    int diameter = 2 * radius;
    double circumference = 2 * 3.141 * radius;
    double area = 3.141 * radius * radius;

  System.out.printf("Diameter = %d %n", diameter);
  System.out.printf("Circumference = %.2f%n", circumference);
  System.out.printf("Area = %.2f %n", area);
    }
}
