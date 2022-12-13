package QuestionsOnLinearSearch;

import java.util.Scanner;

public class SearchInRange {
    public static int searchInRange(String str,char target,int start,int end)
    {
        for(int index=start;index<=end;index++)
        {
            if(str.charAt(index)==target)
                return index;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char target=sc.next().charAt(0);
        int index1=sc.nextInt();
        int index2= sc.nextInt();
        System.out.println(searchInRange(str,target,index1,index2));
    }
}
