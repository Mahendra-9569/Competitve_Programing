import java.util.Scanner;
public class TwoKnights {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        long k = 1;
        while(k <= t){
            if(k == 1){
                System.out.println(0 );
                k++;
                continue;
            }

            long totalways = (k * k) * (k * k - 1) / 2; 
            long attackingPlaces = 4*(k-1)*(k-2);
            long nonAttackingPlaces = totalways - attackingPlaces;
            System.out.println(nonAttackingPlaces );
            k++;
        }
            

    }
}
