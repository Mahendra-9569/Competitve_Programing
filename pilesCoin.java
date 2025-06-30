import java.util.*;

public class pilesCoin {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            if (isPossible(n, k)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    static boolean isPossible(long n, long k){
        long a = 2*k - n;
        long b = -k + 2*n;
        
        if (a < 0 || b < 0) return false;
        if (a % 3 != 0 || b % 3 != 0) return false;

        long y = a / 3;
        long x = b / 3;
        
        return x >= 0 && y >= 0;
    }
}
