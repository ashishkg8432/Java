package BinarySearch;

import java.util.Scanner;

public class BinarySearch {
    public static int search(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            //because if we do start+end/2 the range of int could be exceeded, basically to avoid error
            int mid=start+(end-start)/2;
            if(target>arr[mid])
            {
                start=mid+1;
            }
            else if(target<arr[mid])
            {
                end=mid-1;
            }
            else
                return mid;
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(search(arr,target));


    }
}
