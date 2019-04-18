package aproblems;

import java.util.Scanner;

public class Games {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] h = new int[n];
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
            a[i] = sc.nextInt();
        }

        int games = 0;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {
                if(i==j){
                    continue;
                }else  {
                    if(h[i]==a[j]){
                        games++;
                    }
                }
            }
        }

        System.out.println(games);
    }
}
