package sort_Study;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args){
        int[] arr = {9,8,7,6,5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] array){
    //构建大顶堆
        for (int i = array.length/2-1; i > 0 ; i--) {
            //第一个非叶子节点自下而上，从右至左进行调整
            adjustHeap(array,i,array.length);
        }
        //将调整好的大顶堆，第一个元素（最大）和最后一个叶子节点进行交换
        for (int j = array.length-1 ; j > 0 ; j--) {
            swap(array,0,j);
            adjustHeap(array,0,j);//交换后的大顶堆最后一个元素为有序的，对之前的树进行堆调整

        }

    }
    public static void adjustHeap(int[] array,int i ,int length){
        int temp = array[i];
        //此处排序不明白？？？
        for (int k = 2*i+1; k < length;k = 2*k+1 ) {
            if((k+1) < length && array[k+1] > array[k]){
                k++;//如果右节点大的话，则k值指向右节点
            }
            if(array[k] > temp){
                array[i] = array[k];
                i = k;
            }else{ break; }
        }

    }
    public static void swap(int[] array,int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
