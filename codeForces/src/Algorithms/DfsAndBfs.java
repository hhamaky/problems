package Algorithms;

import java.util.*;
import java.util.stream.Collectors;

public class DfsAndBfs {

    HashMap<Integer, Node> nodeLookup = new HashMap<>();

    public static class Node {
        private int id;
        LinkedList<Node> adjacent = new LinkedList<>();

        private Node(int id) {
            this.id = id;
        }
    }

    private Node getNode(int src) {
        return nodeLookup.get(src);
    }

    private void addEdge(int source, int destination) {
        Node s = getNode(source);
        Node d = getNode(destination);
        s.adjacent.add(d);
    }

    public boolean hasDFSPath(int src, int destination) {

        //1- get Nodes
        Node s = getNode(src);
        Node d = getNode(destination);

        HashSet<Integer> visited = new HashSet<>();
        return hasDFSPath(s, d, visited);
    }



    private boolean hasDFSPath(Node s, Node d, HashSet<Integer> visited) {
        //if visited return false;
        if (visited.contains(s)) {
            return false;
        }
        //if not visited add to visited
        visited.add(s.id);

        //if it is the destination node.
        if (s == d) {
            return true;
        }

        //loop on children and check if they have path to destination
        for (Node child : s.adjacent
        ) {
            if (hasDFSPath(child, d, visited)) {
                return true;
            }

        }
        return false;
    }

    public boolean hasBFSPath(int source , int destination){
       return hasBFSPath(getNode(source),getNode(destination));
    }

    public List<Integer> cellCompete(int[] states, int days)
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
            states = newStates;
        }

//        final List<int[]> ints = Arrays.asList(states);

        return Arrays.stream(states).boxed().collect(Collectors.toList());
//        return  new ArrayList<Integer>(states);
    }

    private boolean hasBFSPath(Node source, Node destination){

        //I need to know what to visit next.
        LinkedList<Node> nextToVist = new LinkedList<Node>();

        //visited hashset
        HashSet<Integer> visited = new HashSet<>();

        //add first source node to be visited.
        nextToVist.add(source);


        while (!nextToVist.isEmpty()){
            nextToVist.remove();
            
            if(source == destination){
                return true;
            }
            if(visited.contains(source.id)){
                continue;
            }
            visited.add(source.id);

            for (Node child:source.adjacent
                 ) {
                nextToVist.add(child);
            }
        }

        int[] a = new int[5];
        Arrays.asList(a);
//        List<Integer> integers = new ArrayList<Integer>(a);

        return false;

    }

}
