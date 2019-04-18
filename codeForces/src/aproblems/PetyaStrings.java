package aproblems;

import java.util.Scanner;

public class PetyaStrings {

    private static int width = 0;
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String text1 = sc.next();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String text2 = sc.next();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        sc.close();
        PetyaStrings x = new PetyaStrings();
        int result = x.compare(text1, text2);

        System.out.print(result);

    }

    private int compare(String text1, String text2) {
        text1 = text1.toLowerCase();
        text2 = text2.toLowerCase();
        int result = 0;
        final char[] text1Chars = text1.toCharArray();

        int i = 0;
        for (char c : text2.toCharArray()) {
            if (c < text1Chars[i]) {
                return 1;
            } else if (c > text1Chars[i]) {
                return -1;
            } else {
                i++;
            }
        }

        return result;
    }
}
