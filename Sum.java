import java.util.Scanner;

public class Sum {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter a number: ");
         int num = input.nextInt();

         int index;

  for (index = 2; index < num; index++) {
    if (num % index == 0) {
            break;
    }
} 
    if (index == num) {
      System.out.print("It is a prime number");
} else {
      System.out.println("Number is not a prime number");
}
}
}
