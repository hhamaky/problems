package com.hackerrank.algorithms;
import java.util.Arrays;

/**
 * Binary Search Tree
 * @author elhamaky
 *
 */
class IceCream implements Comparable<IceCream> {
    int flavor;
    int index;

    public IceCream(int flavor, int index) {
        this.flavor = flavor;
        this.index = index;
    }

    public int compareTo(IceCream o) {
        return this.flavor - o.flavor;
    }

    public boolean equals(IceCream o) {
        if (o.flavor == this.flavor) {
            return true;
        }
        return false;
    }

}

public class BstIceCreamPorler {

    public static int binarySearch(int first, int last, IceCream[] arr, int search) {

        if (first > last) {
            return -1;
        }
        int mid = first + (last - first) / 2;
        if (search == arr[mid].flavor) {
            return arr[mid].index;
        }
        else if (search < arr[mid].flavor) {
            return binarySearch(first, mid - 1, arr, search);
        }
        else {
            return binarySearch(mid + 1, last, arr, search);
        }

    }

    public static void main(String[] args) {

        int t;
        int n, m;

        t = 2;
        for (int test = 0; test < t; test++) {

            m = 4;
            n = 5;
            IceCream[] arr = new IceCream[n];
            int[] cost = new int[] { 1, 4, 5, 3, 2 };
            for (int i = 0; i < n; i++) {
                arr[i] = new IceCream(cost[i], i + 1);
            }

            Arrays.sort(arr);
            int firstIndex = 100000, secondIndex = 100000;
            for (int i = 0; i < n - 1; i++) {
                int search = m - arr[i].flavor;
                if (search >= arr[i].flavor) {
                    int index = binarySearch(i + 1, n - 1, arr, search);
                    if (index != -1) {
                        System.out.println(Math.min(arr[i].index, index) + " " + Math.max(arr[i].index, index));
                        break;

                    }
                }
            }

        }

    }

}