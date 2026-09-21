import java.util.Scanner;


public class SafeDivision {

    public static void main(String[] args){

 
 Scanner input = new Scanner(System.in);

   int firstNumber;

   int secondNumber;
   
   double result;

System.out.print("Enter first integer: ");

   firstNumber = input.nextInt();

System.out.print("Enter second integer: ");

   secondNumber = input.nextInt();

   if (secondNumber !=0) { 

   result = (double) firstNumber / secondNumber;
 
  System.out.printf("Result; %.2f%n", result);
 }

  else {

   System.out.println("cannot divide by zero");
   }
 }

}
