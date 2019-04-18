package aproblems;

import java.util.Scanner;

public class AntonAndDanik {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String winners = sc.next();

        sc.close();
        AntonAndDanik x = new AntonAndDanik();

        String result = x.findWinners(winners);
        System.out.println(result);
    }

    private String findWinners(String winners) {
        char[] chars = winners.toCharArray();
        int countA = 0;
        int countB = 0;
        for (char c : chars) {
            if (c == 'A') {
                countA++;
            }else{
                countB++;
            }

        }

//        long countAA = IntStream.range(0, chars.length).mapToObj(i -> chars[i]).filter(c -> c.equals('A')).count();

//        long CountBB = chars.length - countAA;

//        System.out.println(countAA);

        if (countA > countB) {
            return "Anton";
        } else if (countA < countB) {
            return "Danik";
        } else {
            return "Friendship";
        }



    }

}
