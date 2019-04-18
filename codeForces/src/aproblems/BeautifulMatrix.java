package aproblems;

import java.util.Scanner;

public class BeautifulMatrix {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] matrix = new int[5][5];
        int x_index = 0;
        int y_index = 0;

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] == 1) {
                    x_index = i;
                    y_index = j;
                }
                sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            }

        sc.close();


        BeautifulMatrix beautifulMatrix = new BeautifulMatrix();

        int result = beautifulMatrix.detectNoOfMoves(x_index, y_index);
        System.out.println(result);
    }

    private int detectNoOfMoves(int x, int y) {
        int no = 0;
        no = Math.abs(2 - x) + Math.abs(2 - y);
        return no;
    }
}
