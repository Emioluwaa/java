import java.util.Scanner;

public class CommonFactor {
    public static void main(String[] args) {

Scanner input = new Scanner(System.in);
System.out.print("Enter a number: ");
 int num = input.nextInt();

int index;

for(index = 2; index <= num; index++) {

 if (num % index == 0);

 int result = num / index;

System.out.println(result);
        }
    }
}
