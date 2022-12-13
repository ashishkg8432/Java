package QuestionsOnArray;

import java.util.Scanner;

public class MaxValue {
    public static int maxValue(int[] arr)
    {
        if(arr.length==0)
        {
            return -1;
        }
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
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
        System.out.println(maxValue(arr));


    }
}
