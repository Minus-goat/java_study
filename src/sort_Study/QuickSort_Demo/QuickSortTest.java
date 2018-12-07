package sort_Study.QuickSort_Demo;

public class QuickSortTest {
    static int[] a = {2,8,7,1,3,5,6,4};
    public static void main(String[] args){
        QuickSort quickSort = new QuickSort();
        quickSort.QuickSort1(a,0,a.length-1);
        System.out.println("数组a的长度：--"+a.length);
        for (int i = 0; i < a.length ; i++) {
            System.out.println(a[i]);

        }
    }
}
