package aproblems;

import java.util.Scanner;

public class DieRoll {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int w = sc.nextInt();


        int y = sc.nextInt();

        int no2compare = y;

        if (w > y){
            no2compare = w;
        }

        int nominator = 6 - no2compare +1 ;
        int dominator = 6;

        sc.close();



        int divisor = getGCD(nominator, dominator);
        System.out.println(nominator/divisor+"/"+dominator/divisor);
    }

    public static int getGCD(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return getGCD(n2, n1 % n2);
    }
}
