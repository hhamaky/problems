package aproblems;

import java.util.Arrays;
import java.util.Scanner;

public class GravityFlip {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] problems = new int[n];
        for (int i = 0; i < n; i++) {
            problems[i] = sc.nextInt();
        }
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        sc.close();


        GravityFlip gravityFlip = new GravityFlip();

        int[] result = gravityFlip.flip(n, problems);

        for (int i = 0; i < n; i++) {
            System.out.println(problems[i]);
        }

    }

    private int[] flip(int n, int[] problems) {

        Arrays.sort(problems);

        return problems;
    }
}
