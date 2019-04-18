package aproblems;

import java.util.ArrayList;
import java.util.Scanner;

public class SerejaAndDima {
    static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int s = 0;
        int d = 0;
        boolean round1 = true;
        boolean round2 = false;

        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            numbers.add(number);
        }

        for (int i = 0; i < n; i++) {
            if (round1) {
                s = s + findMaxAndRemoveIt();

            } else if (round2) {
                d = d + findMaxAndRemoveIt();
            }
            round1 = !round1;
            round2 = !round2;
        }
        System.out.printf("%d %d", s, d);

    }

    static int findMaxAndRemoveIt() {
        if (numbers.size() == 1) {
            return numbers.get(0);
        }
        if (numbers.get(0) > numbers.get(numbers.size() - 1)) {
            int max = numbers.get(0);
            numbers.remove(0);
            return max;
        } else {
            int max = numbers.get(numbers.size() - 1);
            numbers.remove(numbers.size() - 1);
            return max;
        }
    }
}
