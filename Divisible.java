
import java.util.Scanner;

public class Divisible{
   public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter First number:  ");

int number = input.nextInt();

if (number % 3 == 0){
System.out.println("It is divisible");
} 
else {
System.out.println("It is not divisible");
        }
    }
}
