import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the length of the equilateral triangle: ");
        double length = input.nextDouble();
        
        // Area of equilateral triangle = (sqrt(3)/4) * length^2
        double area = (Math.sqrt(3) / 4) * length * length;
        
        // Volume = area * length (prism length same as side in your formula)
        double volume = area * length;
        
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}
