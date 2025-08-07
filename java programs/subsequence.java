import java.util.*;
public class subsequence {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        {
            String main=sc.nextLine();
            String sub=sc.nextLine();
            int i=0;
            int j=0;
            while(i<main.length() && j<sub.length())
            {
                if(main.charAt(i)==sub.charAt(j))
                {
                    j++;
                }
                i++;
            }
            if(j==sub.length())
            {
                System.out.println("Yes it is subsequence of"+sub+"is"+main);
            }
            else
            {
                System.out.println(" it is not subsequence of"+sub+"is"+main);

            }
        }
    }
}
