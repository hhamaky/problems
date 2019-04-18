package aproblems;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class horseshoe {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int result = 0;
        Set<Integer> colors = new HashSet<Integer>();
        for (int i = 0; i < 4; i++) {

            int color = sc.nextInt();

            if (colors.contains(color)) {
                result++;
            } else {
                colors.add(color);
            }

        }
        sc.close();
        System.out.println(result);
    }
}
