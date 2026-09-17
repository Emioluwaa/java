import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");

long num = input.nextLong();

long index; 

  for(index = 1; index <= num; index++) {

    if (num % index == 0){

        System.out.println(index);
            }
        }
    }
}
