import java.util.Scanner;

public class printofString 
{
    public static void main(String[] args) 
    {
        String s1 = new String("Computer Engineering");

        for(int i =0; i<s1.length(); i++)
        {
            System.out.print(s1.charAt(i) +" ");
        }
        System.out.println(" ");
        Scanner sc = new Scanner(System.in);
        String s2 = " ";
        System.out.println("Enter the string");
        s2 = sc.next();

        System.out.println("THE STRING IS ");
        for(int i = 0; i<s2.length(); i++)
        {
            System.out.print(s2.charAt(i) +" ");
        }

        sc.close();
    }

}
