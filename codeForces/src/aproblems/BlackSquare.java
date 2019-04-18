package aproblems;

import java.util.ArrayList;
import java.util.Scanner;

public class BlackSquare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> cals = new ArrayList();

        final String line1Input = sc.nextLine();
        final String[] line1Values = line1Input.split(" ");
        //how to determine n
        for (int i = 0; i < line1Values.length ; i++) {
            int number = Integer.parseInt(line1Values[i]);
            cals.add(number);
        }


        final String line2Input = sc.nextLine();


        //how to split to digits
        final char[] chars = line2Input.toCharArray();

        long calsBurnCount = 0;

        for (int i = 0; i < chars.length; i++) {
            final int i1 = Integer.parseInt(Character.toString(chars[i]));
            Integer integer = cals.get(i1-1);
            calsBurnCount = calsBurnCount + integer;
        }
        System.out.println(calsBurnCount);
    }

}
