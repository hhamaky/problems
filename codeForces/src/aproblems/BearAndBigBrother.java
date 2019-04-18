package aproblems;

import java.util.Scanner;

public class BearAndBigBrother {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int b = sc.nextInt();

        sc.close();
        BearAndBigBrother bigBrother = new BearAndBigBrother();

        int result = bigBrother.findYears(a, b);
        System.out.println(result);
    }

    private int findYears(int a, int b) {
        int noOfYears = 0;
        do {
            a = a * 3;
            b = b * 2;
            noOfYears++;

        } while (a <= b);

        return noOfYears;
    }


}
