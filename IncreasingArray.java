import java.util.Scanner;

public class IncreasingArray {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      long n = sc.nextLong();
      Long[] arr = new Long[(int)n];
      for(int i = 0; i < n; i++){
          arr[i] = sc.nextLong();
      }
      long moves = 0;
      for(int i = 1; i < n; i++){
          if(arr[i] < arr[i-1]){
              moves += arr[i-1] - arr[i];
              arr[i] = arr[i-1];
          }
      }
      System.out.println(moves);
   }
}
