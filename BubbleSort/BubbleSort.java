package BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void sort(int[] arr)
    {
        boolean swapped;
        for(int i=0;i<arr.length;i++)
        {
            swapped=false;
            //using length-i because largest element will be at the end after every pass
            //so no need to check the elements which are already sorted
            for(int j=1;j<=arr.length-i-1;j++)
            {
                if(arr[j]<arr[j-1])// 1,2,3,4,5
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped)
            {
                break;
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
