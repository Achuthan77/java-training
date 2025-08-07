import java.util.*;
public class basicc{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int gcd=1;
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int min=(num1<num2)? num1:num2;
        for(int i=1;i<=min;i++)
        {
            if(num1%i==0 && num2%i==0)
            {
                gcd=i;
            }
        }
        System.out.println(gcd);
    }}