public class CountVovels 
{
    public static int CountVovelsinString(String str)
    {
        int count = 0;
        str.toCharArray();

        String vowel = "aeiou";

        for(int i =0; i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(vowel.contains(String.valueOf(ch)))
            {
                count++;
            }
            
        }
        return count;
    } 
    public static void main(String[] args) 
    {
        String str = new String("Sainath");
        CountVovelsinString(str);
        System.out.println(CountVovelsinString(str));
    }
}
