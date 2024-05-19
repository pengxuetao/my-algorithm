package com.pxt.algorithm.basic.sort;

import java.util.Arrays;

/**
 * 选择排序
 * @author Peng xue-tao
 * @since 2024/5/19
 */
public class Selection {

    public static void main(String[] args) {
        int[] a = {2,4,5,3,77,85,12,54,78,99,21};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(Selection.selectionSort(a)));
    }

    /**
     * 选择排序
     *
     * 排序规则：
     * 1、首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置。
     * 2、再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
     * 3、重复第二步，直到所有元素均排序完毕。
     * @param arr 待排序数据
     * @return int[] 已排序数据
     */
    public static int[] selectionSort(int[] arr) {
        for (int j = 0; j < arr.length-1; j++) {
            int minPos = j;
            for (int i = j+1; i < arr.length; i++) {
                if(arr[minPos] > arr[i]) {
                    minPos = i;
                }
            }
            int tmp = arr[minPos];
            arr[minPos] = arr[j];
            arr[j] = tmp;
        }
        return arr;
    }
}
