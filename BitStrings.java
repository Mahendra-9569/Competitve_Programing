import java.util.*;
public class BitStrings {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long mod = 1000000007;
        long ans = 1;

        for(long i=0;i<n;i++){
            ans = (ans * 2) % mod;
        }

        System.out.println(ans);
    }
}
