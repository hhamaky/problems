package aproblems;

import java.util.Scanner;

public class BuyShovel {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int k = sc.nextInt();

        int r = sc.nextInt();

        sc.close();
        BuyShovel buyShovel = new BuyShovel();

        int result = buyShovel.getMinimumNumber(k, r);
        System.out.println(result);
    }

    private int getMinimumNumber(int k, int r) {

        int x = 0;
        int y = 1;
        do{
            x++;
            y = (x*k) % 10;

        } while (y != r && y!= 0);

        return x;
    }
}
