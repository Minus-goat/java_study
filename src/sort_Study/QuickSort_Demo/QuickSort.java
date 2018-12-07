package sort_Study.QuickSort_Demo;

public class QuickSort {
   public  void QuickSort1(int[] a,int p ,int r){
       if(p < r){
           int q = Partition(a,p,r);
           QuickSort1(a,p,q-1);
           QuickSort1(a,q+1,r);
       }
   }
   private int Partition(int[] A,int p ,int r){
       int x = A[r];
       int i = p-1;
       for(int j = p;j < r;j++){
           if(A[j] <= x ){
               i++;
               int temp = A[j];
               A[j] = A[i];
               A[i] = temp;
           }
       }
       int temp = A[r];
       A[r] = A[i+1];
       A[i+1] = temp;

       return  i+1;
   }
}
