package aproblems;

import java.util.ArrayList;
import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int groupsCount = 0;
        ArrayList<String> magnets = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String text = sc.next();
            if(i>0){
                if(!text.equalsIgnoreCase(magnets.get(magnets.size()-1))){
                    magnets.add(text);
                    groupsCount++;
                }
            }else {
                magnets.add(text);
                groupsCount++;
            }
        }

        System.out.println(groupsCount);

    }
}
