import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int l =word.length()-1;
        System.out.println(checkpal(word,0,l));
    }
    public static boolean checkpal(String s,int start,int end)
    {
        if(start>end)
        {
           return true;
        }
        if(s.charAt(start)!=s.charAt(end))
        {
            return false;
        }
        return checkpal(s,start+1,end-1);
    }
}
/*
Check Palindrome
Write a recursive function that checks whether string A is a palindrome or Not.
Return 1 if the string A is a palindrome, else return 0.
Note: A palindrome is a string that's the same when read forward and backward.

Input 1:
A = "naman"
Input 2:
A = "strings"

Output 1:
1
Output 2:
0
*
 */