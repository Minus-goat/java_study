package sort_Study.QuickSort_02;

import java.util.Random;

public class QuickSort01 {

    public static <T extends Comparable<? super T>> void sort(T[] arr,int k) {
        sort(arr, 0, arr.length - 1, k);
    }

    /**
     * @param arr   待排序的数组
     * @param left  左闭
     * @param right 右闭
     * @param k     当快排递归到子问题的规模 <= k 时，采用插入排序优化
     * @param <T>   泛型，待排序可比较类型
     */
    public static <T extends Comparable<? super T>> void sort(T[] arr, int left, int right, int k) {
        // 规模小时采用插入排序
       if (right - left <= k) {
            insertionSort(arr, left, right);
            return;
       }

        if (left >= right) return;

        int p = partition(arr, left, right);
        sort(arr, left, p - 1, k);
        sort(arr, p + 1, right, k);
    }

    public static <T extends Comparable<? super T>> void insertionSort(T[] arr, int l, int r) {
        for (int i = l + 1; i <= r; i++) {
            T cur = arr[i];
            int j = i - 1;
            for (; j >= 0 && cur.compareTo(arr[j]) < 0; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = cur;
        }
    }

    private static <T extends Comparable<? super T>> int partition(T[] arr, int left, int right) {
        //排序前，先让基准值和随机的一个数进行交换。这样，基准值就有随机性。
        //就不至于在数组相对有序时，导致左右两边的递归规模不一致，产生最坏时间复杂度
        swap(arr, left, (int) (Math.random() * (right - left + 1) + left));

        T base = arr[left];//基准值，每次都把这个基准值抛出去，看成[left+1.....right]左闭右闭区间的排序

        int i = left + 1; //对于上一行提到的[left+1.....right]区间，i表示 [left+1......i)左闭右开区间的值都小于等于base。

        int j = right;//对于上二行提到的[left+1.....right]区间，j表示 (j......right]左开右闭区间的值都大于等于base。

        while (true) {
            //从左到右扫描，扫描出第一个比base大的元素，然后i停在那里。
            while (i <= right && arr[i].compareTo(base) < 0) i++;

            //从右到左扫描，扫描出第一个比base小的元素，然后j停在那里。
            while (j >= left && arr[j].compareTo(base) > 0) j--;

            if (i > j) {//虽说是i>j，但其实都是以j=i-1为条件结束的
                break;
            }
            swap(arr, i++, j--);
        }

        swap(arr, left, j);
        return j;//返回一躺排序后，基准值的下角标
    }


    public static void swap(Object[] arr, int i, int j) {
        if (i != j) {
            Object temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    private static void printArr(Object[] arr) {
        for (Object o : arr) {
            System.out.print(o);
            System.out.print("\t");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Integer[] arr = new Integer[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(10000);
        }
        printArr(arr);
        //*****当k值为15时计算排序时间*****//
        for (int k = 1; k < 50 ; k++) {
            long starTime=System.currentTimeMillis();
            sort(arr,k);
            long endTime=System.currentTimeMillis();
            long Time=endTime-starTime;
            System.out.println("Time1="+Time);
            printArr(arr);
        }
        /*long starTime1=System.currentTimeMillis();
        sort(arr,15);
        long endTime1=System.currentTimeMillis();
        long Time1=endTime1-starTime1;
        System.out.println("Time1="+Time1);
        printArr(arr);*/
        //*****当k值为30时计算排序时间*****//
       /* long starTime2=System.currentTimeMillis();
        sort(arr,650);
        long endTime2=System.currentTimeMillis();
        long Time2=endTime2-starTime2;
        System.out.println("time1="+Time2);
        printArr(arr);*/

    }
}