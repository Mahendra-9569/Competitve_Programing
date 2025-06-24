
import java.util.Scanner;
public class Repetitions {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int left = 0;
        int right = 0;
        int ans = 0;
        while(right < s.length()){
            if(s.charAt(left) == s.charAt(right)){
                right++;
                ans = Math.max(ans, right - left);
            } else {
                left = right;
                right++;
            }
        }
        System.out.println(ans);
    }
}
