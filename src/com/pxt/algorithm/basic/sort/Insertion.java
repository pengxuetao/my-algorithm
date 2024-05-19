package com.pxt.algorithm.basic.sort;

import java.util.Arrays;

/**
 * 插入排序
 * @author Peng xue-tao
 * @since 2024/5/19
 */
public class Insertion {

    public static void main(String[] args) {
        int[] a = {2,4,5,3,77,85,12,54,78,99,21};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(Insertion.insertionSort(a)));
    }

    /**
     * 插入排序
     *
     * 排序规则：
     * 1、将第一待排序序列第一个元素看做一个有序序列，把第二个元素到最后一个元素当成是未排序序列。
     * 2、从头到尾依次扫描未排序序列，将扫描到的每个元素插入有序序列的适当位置。（如果待插入的元素与有序序列中的某个元素相等，则将待插入元素插入到相等元素的后面。）
     * @param arr 待排序数据
     * @return int[] 已排序数据
     */
    public static int[] insertionSort(int[] arr) {
        for (int j = 1; j < arr.length; j++) {
            for (int i = j; i > 0; i--) {
                if(arr[i] < arr[i-1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = tmp;
                }
            }
        }
        return arr;
    }
}
