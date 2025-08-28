import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        sc.nextLine();
        String s=sc.nextLine();
        if(s.contains(String.valueOf(ch)))
        {
            System.out.println("Present");
        }
        else
        {
            System.out.println("Not Present");
        }
    }
}
