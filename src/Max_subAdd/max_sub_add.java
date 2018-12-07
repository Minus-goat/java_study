package Max_subAdd;

public class max_sub_add {
    public static void main(String[] args){
        int[] a = {31, -41, 59, 26, -53,  58, 97, -93, -23, 84};
        int sum;
        int besti = 0;
        int bestj = 0;
        int max_sum = 0;
        for (int i = 0; i < a.length ; i++) {
            for(int j = i;j < a.length; j++){
                sum = 0;
                for (int k = i; k < j; k++) {
                    sum = sum+a[k];
                }
                if(sum > max_sum){
                    max_sum = sum;
                    besti = i;
                    bestj = j;
                }

            }
        }
        System.out.println("最大子段和最大值"+max_sum);
        for (int i = besti; i < bestj ; i++) {
            System.out.println(a[i]);
        }
    }
}
/*
    int a[10]={31, -41, 59, 26, -53,  58, 97, -93, -23, 84};//动态规划做的

        int b=0,sum=a[0];

        for(int i=0;i<10;i++)
        {
        if(b>0)
        b+=a[i];
        else
        b=a[i];//如果前面为零，如果相加，则影响后面结果，所以抛弃前面总和
        if(b>sum)
        sum=b;
        }
*/

