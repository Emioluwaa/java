public class TrianglePrinting{
      public static void main(String[] args){
      
      for(int index = 1; index <= 10; index++){
            
            for(int count = 1; count <= index; count++){
                  System.out.print("*");
            }
                  for(int space = 10; space >= index; space--){
                        System.out.print(" ");
                  }
                        for(int star = 10; star >= index; star--){
                              System.out.print("*");
                        }
                              for(int counter = 1; counter <= index; counter++){
                                    System.out.print(" ");
                              }
      for(int star2 = 10; star2 >= index; star2--){
            System.out.print("*");
      }
            for(int space2 = 1; space2 <= index; space2++){
                 System.out.print(" "); 
            }
                  for(int star3 = 1; star3 <= index; star3++){
                        System.out.print("*");
                  }
                        for(int space4 = 10; space4 >= index; space4--){
                              System.out.print(" ");
                        }
                        System.out.println();
            }
      }
}
