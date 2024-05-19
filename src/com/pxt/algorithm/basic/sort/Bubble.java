package com.pxt.algorithm.basic.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * @author Peng xue-tao
 * @since 2021/1/6
 */
public class Bubble {

    /**
     * 计数器
     */
    private static int count = 0;

    public static void main(String[] args) {
        int[] a = {2,4,5,3,77,85,12,54,78,99,21};
        System.out.println(Arrays.toString(a));
//        BubbleSort.bubbleSort(a);
        Bubble.bubbleSortV2(a);
        System.out.println(Arrays.toString(a));
        System.out.println(count);
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println("第"+i+"轮");
            for (int j = 0; j < arr.length-i-1; j++) {
                count++;
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
    }

    /**
     * 冒泡排序优化
     * 加入是否有序的判断
     * 加入无序数列边界
     *
     * @param arr
     */
    public static void bubbleSortV2(int[] arr) {
        int lastExchangeIndex = 0;
        int sortBorder = arr.length-1;
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println("第"+i+"轮");
            boolean sortedFlag = true;
            for (int j = 0; j < sortBorder; j++) {
                count++;
                int tmp;
                if(arr[j] > arr[j+1]) {
                    System.out.println("交换"+arr[j]+" "+arr[j+1]);
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    sortedFlag = false;
                    lastExchangeIndex = j;
                } else {
                    System.out.println("不交换"+arr[j]+" "+arr[j+1]);
                }
            }
            sortBorder = lastExchangeIndex;
            if (sortedFlag) {
                break;
            }
        }
    }
}
