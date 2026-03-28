public class Lengthoflastword 
{

    static int lengthoflastWord(String s)
    {
        String str = s.trim();
        int count = 0;

        for(int i=str.length()-1; i>=0; i-- )
        {
            if(str.charAt(i) != ' ')
            {
                count++;
            }
            else
            {
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) 
    {
        String str = "Hello my name is Sainath ";
        int ans = lengthoflastWord(str);
        System.out.println(ans);
    }
}
