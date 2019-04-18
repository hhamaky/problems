package Algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class problem {

    public static void main(String[] args) {

        int[] states = new int[]{1,1,1,0,1,1,1,1};

        cellCompete(states,2);
    }


    public static  List<Integer> cellCompete(int[] states, int days)
    {
        // WRITE YOUR CODE HERE
        int[] newStates = new int[states.length];
        for(int i=0; i<days;i++){
            for(int j=0; j< states.length;j++){
                if(j==0){
                    if(states[j+1] == 0){
                        newStates[j] = 0;
                    } else{
                        newStates[j] = 1;
                    }
                    continue;
                }
                if(j== states.length -1){
                    if(states[j-1] == 0){
                        newStates[j] = 0;
                    } else{
                        newStates[j] = 1;
                    }
                    continue;
                }
                if(states[j-1] == states[j+1]){
                    newStates[j] = 0;
                } else {
                    newStates[j] = 1;
                }
            }
            states = newStates.clone();
        }


        return Arrays.stream(newStates).boxed().collect(Collectors.toList());
    }
}
