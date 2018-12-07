package sort_Study;

import java.util.Arrays;

public class BubbleSort {
    public static void BubbleSort(int[] array){
        for (int i = 0; i <array.length-1; i++) {
            for (int j = 0; j <array.length-i-1 ; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j+1];
                    array[j+1] =array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    public static void selectSort(int[] array1){
        for (int i = 0; i < array1.length-1; i++) {
            for (int j = i+1; j < array1.length ; j++) {
                if(array1[i] > array1[j]){
                    int temp = array1[i];
                    array1[i] = array1[j];
                    array1[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array1));
    }
    public static void main(String[] args){
        int[] arr = {12,45,89,2,10,9};
        BubbleSort(arr);
        selectSort(arr);

    }
}
