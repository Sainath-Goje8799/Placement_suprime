import java.util.Arrays;

public class PracticeString 
{

    public static void swap(char[] str, int i,int j)
    {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
    public static char[] ReverseString(String str)
    {
        char[] s2 = str.toCharArray();
        int low = 0;
        int high = str.length()-1;

        while(low<high)
        {
            swap(s2, low, high);
            low++;
            high--;
        }
        return s2;
    }

    public static boolean Palindrome(String str)
    {
        str.toCharArray();
        int start = 0;
        int end = str.length()-1;

        while(start<end)
        {
            if(str.charAt(start) != str.charAt(end))
            {
                return false;
            }
            start++;
            end--;

        }
        return true;
    }
    public static void main(String[] args) 
    {
        String s1 = new String("madam"); 
        ReverseString(s1);
        Palindrome(s1);
        System.out.println(Arrays.toString(ReverseString(s1)));

        System.out.println(Palindrome(s1));
        
    }
}
