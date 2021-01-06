package com.pxt.algorithm.sort.bubble;

import java.util.Arrays;

/**
 * @author Peng xue-tao
 * @since 2021/1/6
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] a = {2,4,5,3,77,85,12,54,78,99,21};
        System.out.println(Arrays.toString(a));
        int[] b = BubbleSort.bubbleSort(a);
        System.out.println(Arrays.toString(b));
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println("第"+i+"轮");
            for (int j = 0; j < arr.length-i-1; j++) {
                int tmp;
                if(arr[j] > arr[j+1]) {
                    System.out.println("交换"+arr[j]+" "+arr[j+1]);
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                } else {
                    System.out.println("不交换"+arr[j]+" "+arr[j+1]);
                }
            }
        }
        return arr;
    }
}
