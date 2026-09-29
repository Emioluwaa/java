import java.util.Scanner;

public class BarChart{
      public static void main(String[] args){
      
      Scanner input = new Scanner(System.in);
      
      int number = 0;
      for(int index = 0; index < 5; index++){
            System.out.print("Enter a number: ");
                  number = input.nextInt();
            }
      for(int count = 0; count < 5; count++){
            for(int star = 1; star < number; star++){
                  System.out.print("*");
                  }
                        System.out.println();
            }
      }
}
