package aproblems;

import java.util.Scanner;

public class Juicer {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int noOfOranges = sc.nextInt();
        long maxSizeOfAnOrange = sc.nextInt();
        long maxSizeOfJuicer = sc.nextInt();


        long orderSize = 0;
        for (int i = 0; i < noOfOranges; i++) {
            long orangeOrder = sc.nextLong();
            if (orangeOrder > maxSizeOfAnOrange) {
                continue;
            }
            orderSize = orderSize + orangeOrder;
        }
        long result = Math.floorDiv(orderSize,maxSizeOfJuicer);

        if(orderSize == maxSizeOfJuicer){
            result = 0;
        }

        sc.close();
        System.out.println(result);
    }
}
