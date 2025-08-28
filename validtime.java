import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String timeString=sc.nextLine();
        String[] t=timeString.split(":");
        int hours=Integer.parseInt(t[0]);
        int min=Integer.parseInt(t[1]);
        int sec=Integer.parseInt(t[2]);
        if(hours>=0 && hours<24 && min>=0 && min<59 && sec>=0 && sec<59)
            System.out.println("Valid");
        else
            System.out.println("Not Valid");

    }
}
