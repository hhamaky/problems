package aproblems;

import java.util.Scanner;

public class CarrotCakes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();
        int k = sc.nextInt();
        int d = sc.nextInt();

        //  k > n means time to back k cakes in t minutes smaller than number of cakes needed, so no oven needed.
        // d > t means time to build oven greater than time needed to start a new back || d >= t
        if( k > n ){
            System.out.println("NO");
        }else{
            int bakeWithNewOven = backWithNewOven(n,t,k,d);
            int bakewithNoNewOven = backWithNoNewOven(n,t,k);

            if(bakeWithNewOven < bakewithNoNewOven){
                System.out.println("YES");
            }else {
                System.out.println("No");
            }
        }
    }

    private static int backWithNoNewOven(int n, int t, int k) {
        return (n*t)/k;
    }

    private static int backWithNewOven(int n, int t, int k, int d) {
        int y = ((d * k ) + (t-1))/ t ;
        int z = ((n-y)*t + (k-1))/k;
        if(z != t){
            z = z/2;
        }
        return d+z;
    }
}
