import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String cleaned=s.replaceAll("[^a-zA-Z]","").toLowerCase();
        // String reversed=new StringBuilder(cleaned).reverse().toString();
         String reversed = "";
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed += cleaned.charAt(i);
        }
        if(cleaned.equals(reversed))
        {
            System.out.println("Palindrome:"+reversed);
        }
        else
        {
            System.out.println(" not Palindrome:"+reversed);

        }
    }
}
