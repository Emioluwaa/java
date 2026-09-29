public class DivisionAndSum {
    public static void main(String[] args) {
    
    int Totalsum = 0;
    for(int index = 1; index < 31; index++){
       if(index % 3 == 0){
    Totalsum += index;
  }  
  }
 System.out.println("The Total sum is " + Totalsum);
    }
}
