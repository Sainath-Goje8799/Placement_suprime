package Array;

public class CheckSorted
{
    public static boolean checkSorted(int arr[])
    {
        for(int i = 0; i<arr.length-1;i++)
        {
            if(!(arr[i] < arr[i+1]))
            {
                return false;
            }
        }
        return true;
    } 
    public static void main(String args[])
    {
        int arr[] = { 2,4,5,7,8,9,10};

        boolean isSorted = checkSorted(arr);

        System.out.println(isSorted);
    }    
}
