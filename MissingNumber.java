import java.util.Scanner;
public class  MissingNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n =  sc.nextLong();
        long sum = 0;
        for(int i = 1; i <= n - 1; i++){
            long x = sc.nextLong();
            sum += x;
        }
        long total = n * (n + 1) / 2;
        System.out.println( (total - sum));
    }
}
