package sort_Study.QuickSort;

import java.util.Arrays;

public class CountSort_Demo2 {
    public static void main(String[] args){
        int[] theArray = {6,3,5,1,8,7,9,4};
        System.out.println("之前的排序");
        System.out.println(Arrays.toString(theArray));

        int[] resultArray = countingSort(theArray);
        System.out.println(Arrays.toString(resultArray));

    }
    public static int[] countingSort(int[] theArray){//循环计算数组中多少个数字小于自己，填到自己的位置
        int[] lastArray = new int[theArray.length];
        for(int i = 0;i < theArray.length; i++){
            int count = 0;
            for (int j = 0; j < theArray.length ; j++) {
                if(theArray[j] < theArray[i]){
                    count++;
                }
            }
            lastArray[count] = theArray[i];
        }
        return lastArray;
    }
}
