package com.jackey.arithmetic.recursion;

import java.util.Arrays;

public class BubbleSort {

    /**
     *
     * @param arrays
     * @param L
     * @param R
     */
    public static void bubbleSort(int[] arrays, int L, int R) {
        int temp;
        //只有一个元素，什么都不用干
        if(L == R) ;
        else {
            for(int i = L; i < R; i++) {
                if(arrays[i] > arrays[i + 1]) {
                    temp = arrays[i + 1];
                    arrays[i + 1] = arrays[i];
                    arrays[i] = temp;
                }
            }
            //第一趟排序，最大值已经选好
            bubbleSort(arrays, L, R-1);
        }
    }


    public static void main(String[] args) {
        int[] arrays = new int[]{1, 5, 7, 2, 55, 33};
        bubbleSort(arrays, 0, arrays.length - 1);
        System.out.println(Arrays.toString(arrays));
    }


}
