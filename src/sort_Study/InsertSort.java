package sort_Study;

import java.util.Arrays;

public class InsertSort {
    public  static  void  main(String[] args){
        int[] arr = {3,5,2,1,6,7,9,10,0};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertSort(int[] a)
    {
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];//此项为待插入的数据
            while((i-1)>= 0 && a[i-1] > temp){       // 从数组的第二个元素开始循环将数组中的元素插入
                a[i] = a[i-1];//此代码为从小到大排序，下面的代码为从大到小排序
                i--;
            }
            a[i] = temp;

        }

        /*int i,insertNote;// 要插入的数据
        for (i = 1; i < a.length; i++)
        {// 从数组的第二个元素开始循环将数组中的元素插入
            insertNote = a[i];// 设置数组中的第2个元素为第一次循环要插入的数据
            while (i >= 1 && insertNote > a[i-1])
            {
                a[i] = a[i-1];// 如果要插入的元素小于第i-1个元素,就将第i-1个元素向后移动
                i--;
            }
            a[i] = insertNote;// 直到要插入的元素不小于第j个元素,将insertNote插入到数组中
        }*/
    }

}
