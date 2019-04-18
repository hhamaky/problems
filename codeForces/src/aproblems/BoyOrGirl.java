package aproblems;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BoyOrGirl {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        final char[] chars = text.toCharArray();
        Set<Character> characters = new HashSet<>();
        for (char c : chars) {
            characters.add(c);
        }
        if (characters.size() % 2 != 0) {
            System.out.println("IGNORE HIM!");
        } else {
            System.out.println("CHAT WITH HER!");
        }

    }
}
