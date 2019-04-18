package aproblems;

import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        char[] chars = text.toCharArray();
        chars[0]=Character.toUpperCase(chars[0]);

        System.out.println(String.valueOf(chars));

    }
}
