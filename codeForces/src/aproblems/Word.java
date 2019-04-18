package aproblems;
import java.util.Scanner;

public class Word {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        int upperCase = 0;
        int lowerCase = 0;
        final char[] chars = text.toCharArray();
        for (char aChar : chars) {
            if(String.valueOf(aChar).matches("[A-Z]")){
                upperCase++;
            }else{
                lowerCase++;
            }
        }
        if (upperCase > lowerCase) {
            System.out.println(text.toUpperCase());
        } else {
            System.out.println(text.toLowerCase());
        }

    }
}