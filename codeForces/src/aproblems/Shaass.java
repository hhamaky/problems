package aproblems;

import java.util.Scanner;

public class Shaass {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int wires = sc.nextInt();

        int[] oskols = new int[wires];
        for (int i = 0; i < wires; i++) {
            oskols[i] = sc.nextInt();
        }

        int shots = sc.nextInt();

        for (int i = 0; i < shots; i++) {
            int wire = sc.nextInt();
            int birdShot = sc.nextInt();
            int birdsOnWire = oskols[wire-1];
            int remainingBirdsOnRight = birdsOnWire - birdShot;
            if(remainingBirdsOnRight > 0 ){
                if(wire != wires)
                    oskols[wire] = oskols[wire] + remainingBirdsOnRight;
            }
            oskols[wire-1] = 0;
            int remainingBirdsOnLeft = birdShot -1 ;
            if(remainingBirdsOnLeft > 0){
                if(wire> 1){
                    oskols[wire-2] = oskols[wire-2] + remainingBirdsOnLeft;
                }
            }
        }
        sc.close();
        for (int i = 0; i < wires; i++) {
            System.out.println(oskols[i]);
        }
    }
}
