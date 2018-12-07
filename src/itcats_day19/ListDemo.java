package itcats_day19;

import java.lang.reflect.Array;
import java.util.*;

public class ListDemo {
    public static void main(String[] args){

        List<String> array = new ArrayList<String>();
        array.add("sdkfdk");
        array.add("abc2");
        array.add("abc3");
        System.out.println(array);
        int[] array1 = {2,4,3,7,9,1,90,6,100};
        Arrays.sort(array1);
//        System.out.println(array1);数组打印数组名则是数组首地址，集合打印集合名则是保存类型数组
        for(String i:array){
            System.out.println(i);
        }
        for(int i:array1){
            System.out.println(i);
        }


        Date today = new Date();
        System.out.println(String.format("%tA, %tB %td",today,today ,today));
        System.out.println(String.format("%tc",today));

        Calendar c = Calendar.getInstance();
        c.set(2018,9,26,15,18,50);
        long day1 = c.getTimeInMillis();
        day1 = day1 + 1000*60*60;
        System.out.println("new hour"+ c.get(c.HOUR_OF_DAY));
        System.out.println(day1);
    }
}
