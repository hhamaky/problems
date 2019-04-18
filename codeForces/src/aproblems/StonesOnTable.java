package aproblems;

import java.util.Scanner;

public class StonesOnTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int noOfStones = sc.nextInt();

        String stones = sc.next();

        char[] chars = stones.toCharArray();

        int p1= 0;
        int p2= 1;

        int toBeRemoved = 0;
        while(p2<noOfStones){
            if (chars[p1] == chars[p2]){
                toBeRemoved++;
            }
            p1++;
            p2++;
        }
        System.out.println(toBeRemoved);

    }
}
