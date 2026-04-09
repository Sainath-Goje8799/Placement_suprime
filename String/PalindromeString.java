public class PalindromeString 
{

    public static boolean Palindrome(String str)
    {
        str.toCharArray();
        int low = 0; 
        int high  = str.length() -1;

        while(low<high)
        {
            if(str.charAt(low) != str.charAt(high))
            {
                return false;
            }
            low++;
            high--;
        }
        return true;
       
    }
    public static void main(String[] args) 
    {
        String s1 = new String("maday");
        Palindrome(s1);
        System.out.println(Palindrome(s1));
    }
}
