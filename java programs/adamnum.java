import java.util.*;
public class adamnum{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
            int copy=num;
            int sq=num*num;
            int rev=0;
            int rev1=0;
            while(copy!=0)
            {
                int rem=copy%10;
                rev=rev*10+rem;
                copy=copy/10;
            }
            
            int sq1=rev*rev;
            int temp=sq1;
            while(temp!=0)
            {
                int rem1=temp%10;
                rev1=rev1*10+rem1;
                temp=temp/10;
            }
            if(sq==rev1)
            {
                System.out.println("It is Adam number");
            }
            else{
                System.out.println("It is not Adam number");
            }
        }
}