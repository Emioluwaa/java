public class Statement {
    public static void main(String[] args){
int i = 2;
int j = 3;
int k = 2;
int m = 2;
System.out.println(i == 2);// this prints true
System.out.println(j == 5);// this prints false
System.out.println((i >= 0) && (j <= 3));//this prints true
System.out.println((m <= 100) & (k <= m));//this prints true
System.out.println((j >= i) || (k != m));//this prints true
System.out.println((k + i < j) | (4 - j >= k));//this prints false
System.out.println(!(k > j));//this prints true

}
}
