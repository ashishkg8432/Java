package QuestionsOnArray;

import java.util.Scanner;

public class MaxValueInRange {
    public static int maxValueRange(int[] arr,int start,int end)
    {
        if(arr.length==0)
        {
            return -1;
        }
        if(end>start)
        {
            return -1;
        }
        int max=arr[0];
        for(int i=start;i<=end;i++)
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
        int a= sc.nextInt();
        int b=sc.nextInt();

        System.out.println(maxValueRange(arr,a,b));

    }
}
