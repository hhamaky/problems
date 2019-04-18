package Algorithms;

// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED

import java.util.ArrayList;
import java.util.Arrays;

class GCD {
    ArrayList<Integer> IDsOfSongs(int rideDuration,
                                  ArrayList<Integer> songDurations) {
        int song1Id = 0;
        int song2Id = 0;

        // WRITE YOUR CODE HERE

        for (int i = 0; i < songDurations.size(); i++) {
            for (int j = 1; j < songDurations.size(); j++) {
                if ((songDurations.get(i) + songDurations.get(j)) == (rideDuration - 30)) {
                    if (song1Id == 0) {
                        song1Id = i;
                        song2Id = j;
                    } else if ((songDurations.get(i) > songDurations.get(song1Id)) || (songDurations.get(j) > songDurations.get(song2Id))) {
                        song1Id = i;
                        song2Id = j;
                    }

                }
            }
        }

        ArrayList<Integer> songs = new ArrayList();
        songs.add(song1Id);
        songs.add(song2Id);
        return songs;
    }


    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public int generalizedGCD(int num, int[] arr) {
        Arrays.sort(arr);
        int size = num;
        int result = arr[0];
        int i = 1;
        while (i < size) {
            if (arr[i] % result == 0) {
                i++;
            } else {
                result = arr[i] % result;
                i++;
            }
        }


        return result;

    }
    // METHOD SIGNATURE ENDS
}