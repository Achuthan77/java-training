import java.util.*;
public class insertt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int a[] =new int[size+1];
        int i,data,pos;
        for(i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        data=sc.nextInt();
        pos=sc.nextInt();
        for(i=size;i>pos-1;i--)
        {
            a[i]=a[i-1];
        }
        a[pos-1]=data;
        for(i=0;i<size+1;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}