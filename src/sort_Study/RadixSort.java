package sort_Study;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args){
        int[] A = {73,22,93,43,55,14,28,65,39,81,99};
        radixSort(A,100 );
        Arrays.toString(A);
        for(int num:A){
            System.out.println(num);
        }
    }
    public static void radixSort(int[] array,int d){
        int n = 1;//代表位数对应的数，1,10,100
        int k = 0;//保存每一位排序的后果，用于下一位排序的输入
        int length = array.length;
        int[][] bucket = new int[10][array.length];//排序桶用于保存每次排序后的结果，这一位上排序结果相同的数字放在一个桶里
        int[] order = new int[length];
        while(n < d){
            for(int num:array){
                int digt = (num/n)%10;
                bucket[digt][order[digt]] = num;//将array 的数组数字按照个位数放在对应的桶里
                order[digt]++;
            }
            for (int i = 0; i < array.length; i++) {//这个桶里有数据，从上到下遍历这个桶并将数据保存到原数组中
                if(order[i] !=0){
                    for (int j = 0; j < order[i] ; j++) {
                        array[k] = bucket[i][j];
                        k++;
                    }
                }
                order[i] = 0;//数组清零，用于下次基数排序
            }
            n *= 10;
            k = 0;//k为0，用于下次保存位排序
        }
    }
}
