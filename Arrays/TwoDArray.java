package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        //2D Array
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr2D=new int[n][n];
        for(int row=0;row<arr2D.length;row++)
        {
            for(int col=0;col<arr2D[row].length;col++)
            {
                arr2D[row][col]=sc.nextInt();
            }
        }
        // printing using foreach loop
        for(int[] num:arr2D)
        {
            System.out.println(Arrays.toString(num));
        }

        // printing using for loop
        for(int row=0;row<arr2D.length;row++)
        {
            for(int col=0;col<arr2D[row].length;col++)
            {
                System.out.println(arr2D[row][col]);

            }
            System.out.println();
        }
    }
}
