import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {

   Scanner input = new Scanner(System.in);

   System.out.print("Enter your age: ");
   int age = input.nextInt();
  
    int group; 



      if (age < 13) group = 1;
      else if (age < 20) group = 2;
      else if (age < 35) group = 3;
      else if (age < 60) group = 4;
    else group = 5;

    switch (group) {
      case 1:
         System.out.println("child: 0-12 years");
          break;
      case 2:
         System.out.println("Teen: 13-19 years");
          break;
      case 3: 
         System.out.println("adult: 20-34 years");
          break;
      case 4:
         System.out.println("Elders: 40-59 years");
          break;
      case 5:
          System.out.println("Oldies: 60+ years");
          break;
    default:
          System.out.println("Invalid age entered"); 
          break;
      }
   }
}
