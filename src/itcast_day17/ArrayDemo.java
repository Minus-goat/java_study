package itcast_day17;
import java.util.*;
public class ArrayDemo {
    public static  void main(String[] args){

       function3();
    }
    public static void function(){
        int[] arr = {3,65,2,1,78,9,20};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void function2(){
        int[] arr1 = {1,3,5,6,7,8,9};
        int index = Arrays.binarySearch(arr1,7);
        System.out.println(index);
    }
    public static void function3(){
        int[] arr1 = {1,3,5,6,7,8,9};
        String s = Arrays.toString(arr1);
        System.out.println(s);
    }
}
