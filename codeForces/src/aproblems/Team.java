package aproblems;

import java.util.Scanner;

public class Team {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] problems = new int[n * 3];
        for (int i = 0; i < n * 3; i++) {
            problems[i] = sc.nextInt();
        }
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        sc.close();


        Team team = new Team();

        int result = team.findNoOfProblemToSolve(n, problems);
        System.out.println(result);
    }

    private int findNoOfProblemToSolve(int n, int[] problems) {

        int ones = 0;
        int zeros = 0;

        int no = 0;
        for (int i = 0; i < problems.length; i++) {
            if (problems[i] == 0) {
                zeros++;
            }
            if (problems[i] == 1) {
                ones++;
            }
            if ((i + 1) % 3 == 0) {
                if (ones > zeros) {
                    no++;
                }
                zeros = 0;
                ones = 0;
            }
        }
        return no;
    }
}
