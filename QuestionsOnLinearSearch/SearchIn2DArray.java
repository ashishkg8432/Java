package QuestionsOnLinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {
    public static int[] search(int[][] arr,int target)
    {
        for(int i=0;i< arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target)
                    return new int[]{i,j};

            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int target=sc.nextInt();
        System.out.println(Arrays.toString(search(arr, target)));
    }
}
