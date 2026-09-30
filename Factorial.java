import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter firstNumber: ");
long numberOne = input.nextLong();

System.out.print("Enter secondNumber: ");
long numberTwo = input.nextLong();


long index;
long count; 

  for(index = 1; index <= numberOne ; index++) {
        
    if (numberOne % index == 0){

        System.out.println(index);
        }
   }
    for(count = 1; count <= numberTwo; count++){
        if (numberTwo % count == 0) {
        System.out.println(count);
            }
        }
    }
}

