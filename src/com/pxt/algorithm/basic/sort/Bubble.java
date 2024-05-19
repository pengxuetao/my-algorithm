package com.pxt.algorithm.basic.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * @author Peng xue-tao
 * @since 2021/1/6
 */
public class Bubble {

    public static void main(String[] args) {
        int[] a = {2,4,5,3,77,85,12,54,78,99,21};
        int[] b = a.clone();
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        Bubble.bubbleSort(a);
        Bubble.bubbleSortV2(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

    /**
     * 冒泡排序
     *
     * 排序规则：
     * 1、比较相邻的元素。如果第一个比第二个大，就交换他们两个。
     * 2、对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
     * 3、针对所有的元素重复以上的步骤，除了最后一个。
     * 4、持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
     * @param arr 待排序数据
     * @return int[] 已排序数据
     */
    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }

    /**
     * 冒泡排序优化
     * 加入是否有序的判断
     * 加入无序数列边界
     *
     * @param arr 待排序数据
     * @return int[] 已排序数据
     */
    public static int[] bubbleSortV2(int[] arr) {
        int lastExchangeIndex = 0;
        int sortBorder = arr.length-1;
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println("第"+i+"轮");
            boolean sortedFlag = true;
            for (int j = 0; j < sortBorder; j++) {
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
        return arr;
    }
}
