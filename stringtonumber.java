import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch;
        StringBuilder dig=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(Character.isDigit(ch))
            {
                dig.append(ch);
            }
            }
          if(dig.length()>0) {
            System.out.println(dig.toString());
        } else {
            System.out.println(0);
        }
        }
    
}
