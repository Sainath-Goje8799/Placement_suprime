package Searching;

public class LinearSearch 
{
    public static int linearsearchfun(int arr[], int target)
    {
        for(int i =0; i<arr.length ; i++)
        {
            if(arr[i] == target)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int arr[] = {1,4,5,2,6,8};
        int ans =linearsearchfun(arr,2);
        System.out.println(ans);


    }
}
