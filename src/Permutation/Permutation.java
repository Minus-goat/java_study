
package Permutation;

import java.util.Scanner;

/**
 * 归纳法的排列Arrangement
 * 1.2.3....n：生成所有排列的问题，以数组p[1-n]来存放每一个排列，假设可以生成n-1个数的所有排列。
 * 那么在这些所有排列的前面加上第n个数就好了。
 * 置换法：初始时时1-n的顺序排列的一种排列方式
 * 因此perm(p) = r1perm(p1), r2perm(p2), r3perm(p3), ... , rnperm(pn)。当n = 1时perm(p} = r1。
 * r1perm(p1)就是以r1开头的所有pn-r1的其他元素的全排列
 为了更容易理解，将整组数中的所有的数分别与第一个数交换，这样就总是在处理后n-1个数的全排列。
 * @author 金涛
 *
 */
public class Permutation {
    private static int count=0 ;
    private static int n ;
    private static int [] arrangementResult;

    public static void arrange(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字n:");
        int n = scanner.nextInt();
        Permutation.n = n;
        scanner.close();
        arrangementResult= new int[n+1];
        for(int i =1;i<n+1;i++){
            arrangementResult[i] = i;
        }

        permutation(1);
    }

    private static void permutation(int m) {
        //由于一个数的全排列就是其本身，所以m=n时是一种全排列
        if(m==n){
            count++;
            System.out.print("此次排列结果:");
            printResult();
        }else{
            for(int j = m;j<=n;j++){
                swap(j,m);
                permutation(m+1);
                swap(m,j);//将数组调整为原样
            }
        }
    }

    private static void printResult(){
        for(int i =1;i<=n;i++){
            System.out.print(arrangementResult[i]+"  ");
        }
        System.out.println();
    }

    private static void swap(int j,int m){
        int temp_j = arrangementResult[j];
        int temp_m = arrangementResult[m];
        arrangementResult[j]=temp_m;
        arrangementResult[m]=temp_j;
    }

    public static void main(String[] args) {
        arrange();
        System.out.println("总共有"+count+"种排列方式。");
    }
}

