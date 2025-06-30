import java.util.Scanner;
public class NumberSpiral {
    public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int m = sc.nextInt();
          long Spiralgrid[][] = new long[n][m];
          for(int i = 0; i<n; i++){
            
          }

          int t = sc.nextInt();
          while(t-- > 0){
                int x = sc.nextInt() -1;
                int y = sc.nextInt() -1;
                System.out.println(Spiralgrid[x][y]);
          }
    }
}
