package SelectionSort;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void sort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int last=arr.length-i-1;
            int maxIndex=getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    private static void swap(int[] arr,int first,int last) {
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;

    }

    public static int getMaxIndex(int[] arr,int start,int end)
    {
        int max=start;
        for(int i=start;i<=end;i++)
        {
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
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
