package Hanoi;

import java.util.Scanner;

public class Hanoi {

    //p1为初始盘，p3为目标盘（p2作为中间盘）
    public static void solve(int n,int p1,int p2,int p3){
        if(n==1)
            System.out.println("从"+p1+"移动到"+p3);
        else{
            solve(n-1,p1,p3,p2);//将n-1个盘子，借由p2从p1移动到p3
            System.out.println("从"+p1+"移动到"+p3);//将第n个盘子从p1移动到p3
            solve(n-1,p2,p1,p3);//将n-1个盘，借由p1从p2移动到p3
        }
    }

    public static void main(String[] args) {
        System.out.println("请输入你要设置塔数：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solve(n,1,2,3);
    }
}

