package aproblems;

import java.util.Arrays;
import java.util.Scanner;

public class VanyaFence {
    private static int width = 0;
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int h = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
            sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        }
        sc.close();
        VanyaFence x = new VanyaFence();
        int result = x.findWidth(h, heights);
        System.out.println(result);
    }

    private int hh;

    private int findWidth(int h, int[] heights) {
        hh = h;
        Arrays.stream(heights).forEach((v) -> {
            if (v > h) {
                width = width + 2;
            } else {
                width++;
            }
        });

//        Arrays.stream(heights).forEach( (v)-> v>h? width+2: width++);


        return Arrays.stream(heights)
                .map(this::getWidth).sum();
        // return width;
    }

    int getWidth(int manHight) {
        if (manHight > hh)
            return 2;
        else
            return 1;
    }

}
