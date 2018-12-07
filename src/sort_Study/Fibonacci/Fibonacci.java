package sort_Study.Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        System.out.println("请输入要计算的多少位数字n：");
        Scanner scanner = new Scanner(System.in);
        int next = scanner.nextInt();
        int x = fib(next);
        System.out.println(x);
    }
    public static int fib(int n){

        if( n == 0 || n == 1){
            return  n;
        }
        else return fib(n-1) + fib(n-2);

    }
}
