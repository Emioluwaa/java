import java.util.Scanner;

public class Multiples {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

System.out.print("Enter first number: ");
    int numberOne = input.nextInt();
System.out.print("Enter second number: ");
    int numberTwo = input.nextInt();

        
        int triple = numberOne * 3;
        int doubled = numberTwo * 2;
        int result = triple % doubled;
System.out.println(triple);
System.out.println(doubled);
System.out.println(result);
    }
}
