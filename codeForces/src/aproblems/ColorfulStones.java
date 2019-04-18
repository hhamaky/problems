package aproblems;

import java.util.Scanner;

public class ColorfulStones {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String stones = sc.next();


        String instructions = sc.next();

        sc.close();
        ColorfulStones colorfulStones = new ColorfulStones();

        int result = colorfulStones.getLisPostion(stones, instructions);
        System.out.println(result);
    }

    private int getLisPostion(String stones, String instructions) {
        final char[] stonesChars = stones.toCharArray();

        final char[] instructionChars = instructions.toCharArray();

        int p = 0;
        for (char c: instructionChars) {
            if(c == stonesChars[p]){
                p++;
            }
        }

        return p+1;
    }

}
