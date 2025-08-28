import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        double d=(double)n/n1;
        int rem=n%n1;
        System.out.printf("%d / %d = %.6f\n",n,n1,d);
        System.out.printf("%d %% %d = %d\n",n,n1,rem);
    }
}
