package Algorithms;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class GraphProblem {
    private static HashMap<Integer, Node> nodesLookup = new HashMap<>();
    static int index = 1;

    public static class Node {
        int x;
        int y;
        int v;

        LinkedList<Node> adjacent = new LinkedList<>();

        public Node(int x, int y, int v) {
            this.x = x;
            this.y = y;
            this.v = v;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();

        int c = sc.nextInt();

        int[][] values = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                values[i][j] = sc.nextInt();
                nodesLookup.put(index, new Node(i,j, values[i][j]));
            }
        }


    }

    private static void createNodesLookup(int[][] values,int r, int c) {

        int x = 0;
        int y = 0;

        Node start = new Node(x, y, values[x][y]);





        while(x<r && y <c){

//            addChildNodes();
        }



    }
}
