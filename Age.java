import java.util.Scanner;

public class Age {
   public static void main(String[]args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter your age: ");
int age = input.nextInt();
input.nextLine();

System.out.print("Enter your full name: ");
String name = input.nextLine();

System.out.println("Age: " + age);
System.out.println("Name: " + name);

 }
}
