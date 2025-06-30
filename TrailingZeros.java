import java.util.*;
public class TrailingZeros {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        long cnt = 5;
        while(true){
            if(n/cnt == 0) {
                break;
            }
            ans += n / cnt;
            cnt *= 5;
        }

        System.out.println(ans);
    }
}
