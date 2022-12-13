package Arrays;

import java.util.*;


public class ArraysExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //  int[] arr=new int[5];
        //  arr[0]=1;
        //  arr[1]=2;
        //  arr[2]=3;
        //  arr[3]=4;
        //  arr[4]=5;
        //  int[] arr={1,2,3,4,5};
        int n=sc.nextInt();
         int[] arr=new int[n];
         for(int i=0;i<arr.length;i++)
         {
             arr[i]=sc.nextInt();
         }
         // printing using for loop
          for(int i=0;i<arr.length;i++)
          {
              System.out.println(arr[i]);
          }

          // printing using toString() method
        System.out.println(Arrays.toString(arr));

          //printing foreach loop
        for(int print:arr) {
            System.out.println(print);
        }

    }
}
