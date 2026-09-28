import java.util.Scanner;

public class Kata {
    public static void main(String[] args) {
   
  }
  
  public static int maximum(int numberOne, int numberTwo) {

    if(numberOne > numberTwo) {
        return numberOne;
    }
    else {
        return numberTwo;
   }
}

public static boolean isEven(int number) {

    if(number % 2 == 0) {
        return true;
    }
    else {
        return false;
    }
}
 
public static boolean isPrimeNumber(int number) {
    
   int count = 0;
    for(int index = 2; index <= number; index++){
       
        if(number % index == 0){
             count++;
            return true;
     }    
}
      if (number == 2){
        return true;
    
  } else {
  return false;
       } 
    }
 }
