import java.util.Arrays;

public class ReverseaString 
{
    private static void swap(char[] str, int i, int j)
    {
        char temp = str[i];
        str [i] = str[j];
        str[j] = temp;

    }
    public static char[] reverseanString(String str)
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
    public static void main(String[] args) 
    {
        String s1 = new String("Hello");
        reverseanString(s1);
        System.out.println(Arrays.toString(reverseanString(s1)));

    }
}
