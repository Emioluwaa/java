import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");

long num = input.nextInt();


long index; 

  for(index = 10; num <= index; index++);

    if (num % index == 0){

long result = num / index;

System.out.println(result);
        }
    }
}
