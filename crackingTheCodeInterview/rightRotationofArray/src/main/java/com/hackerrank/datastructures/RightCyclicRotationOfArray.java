package com.hackerrank.datastructures;

/**
 * Arrays
 * @author elhamaky
 *
 */
public class RightCyclicRotationOfArray {

    public static void main(String[] args) {
        int k = 3;
        int[] A = new int[] { 3, 8, 9, 7, 6 };

        int[] result = solution(A, k);

        for (int element : result) {
            System.out.print(element + " ");
        }
    }

    public static int[] solution(int[] arr, int d) {
        int n = arr.length;

        int temp, i, k, j;

        for (i = 0; i < n % d; i++) {
            /* move i-th values of blocks */
            temp = arr[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= n) {
                    k = k - n;
                }
                if (k == i) {
                    break;
                }
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
        return arr;
    }

}
