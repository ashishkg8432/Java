package QuestionsOnLinearSearch;

import java.util.Scanner;

public class SearchInStrings {
    public static boolean search(String str,char target)
    {
        for(int i=0;i<str.length();i++)
        {
            if(target==str.charAt(i))
            {
                return true;
            }
        }
        return false;

    }
    //using for each loop but to use this loop string is needed to be converted into char Array.
    public static boolean search2(String str,char target)
    {
        for(char ch:str.toCharArray())
        {
            if(ch==target)
            {
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char target=sc.next().charAt(0);
        System.out.println(search2(str,target));
    }
}
