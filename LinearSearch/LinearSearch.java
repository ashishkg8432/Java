package LinearSearch;

import java.util.Scanner;

public class LinearSearch {
    public static int search(int[] arr,int target)
    {
        for(int index=0;index<arr.length;index++)
        {
            if(arr[index]==target)
            {
                return arr[index];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target= sc.nextInt();
        System.out.println(search(arr,target));
    }
}
