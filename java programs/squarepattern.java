import java.util.*;
public class squarepattern{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int rows=1;rows<=n;rows++)
        {
            for(int col=1;col<=n;col++)
            {
               if(rows==1||rows==n||col==1||col==n)
               {
                System.out.print("*");
               }
               else{
                System.out.print(" ");
               }
            }
            System.out.println();
        }
        
    }
}