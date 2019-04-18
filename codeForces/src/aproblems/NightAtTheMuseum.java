package aproblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NightAtTheMuseum {

    public static void main(String[] args) {

        Map<Character,Integer> alphabet = new HashMap<>();
        alphabet.put('a',1);
        alphabet.put('b',2);
        alphabet.put('c',3);
        alphabet.put('d',4);
        alphabet.put('e',5);
        alphabet.put('f',6);
        alphabet.put('g',7);
        alphabet.put('h',8);
        alphabet.put('i',9);
        alphabet.put('j',10);
        alphabet.put('k',11);
        alphabet.put('l',12);
        alphabet.put('m',13);
        alphabet.put('n',14);
        alphabet.put('o',15);
        alphabet.put('p',16);
        alphabet.put('q',17);
        alphabet.put('r',18);
        alphabet.put('s',19);
        alphabet.put('t',20);
        alphabet.put('u',21);
        alphabet.put('v',22);
        alphabet.put('w',23);
        alphabet.put('x',24);
        alphabet.put('y',25);
        alphabet.put('z',26);

        Scanner sc = new Scanner(System.in);

        final String word = sc.nextLine();
        final char[] chars = word.toCharArray();

        int c = 1;

        int noOfMoves = 0;
        for (int i = 0; i < chars.length; i++) {

            int direction1 = Math.abs(alphabet.get(chars[i]) - c);
            int direction2 = 26 - Math.abs(alphabet.get(chars[i])-c);
            if(direction1 < direction2){
                noOfMoves += direction1;
            }else{
                noOfMoves += direction2;
            }
            c = alphabet.get(chars[i]);
        }
        System.out.println(noOfMoves);
    }


}
