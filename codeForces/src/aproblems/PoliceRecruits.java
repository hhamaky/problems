package aproblems;

import java.util.Scanner;

public class PoliceRecruits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int noOfOfficers = 0;
        int noOfCrimes = 0;

        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();

            if (crimesOccured(number)) {
                if (officerExists(noOfOfficers)) {
                    noOfOfficers--;
                } else {
                    noOfCrimes++;
                }
            } else {
                noOfOfficers = noOfOfficers + number;
            }
        }
        System.out.println(noOfCrimes);
    }

    private static boolean officerExists(int noOfOfficers) {
        if (noOfOfficers > 0) {
            return true;
        }
        return false;
    }

    private static boolean crimesOccured(int number) {
        if (number < 0) {
            return true;
        } else {
            return false;
        }
    }
}
