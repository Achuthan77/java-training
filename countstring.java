import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int cnt=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            cnt++;
        }
        System.out.println(cnt);
    }
}
