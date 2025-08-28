import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        sc.nextLine();
        String a=sc.nextLine();
        int l=a.length();
        int n=k%l;
        String s=a.substring(n)+a.substring(0,n);
        System.out.println(s);
    }
}
