package QuestionsOnArray;

import java.util.*;

public class Swap {
    public static void swap(int[] arr,int index1,int index2)
    {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter values: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter values of index1 and index2: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        swap(arr,a,b);
        //System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }


    }
}
