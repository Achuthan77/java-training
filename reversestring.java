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

        char[] reversed = new char[s.length()];
        int j = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed[j++] = s.charAt(i);
        }
        for (int i = 0; i < reversed.length; i++) {
            System.out.print(reversed[i]);
        }
        System.out.println();
    }
}
