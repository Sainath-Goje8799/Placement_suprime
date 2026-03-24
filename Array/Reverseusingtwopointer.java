package Array;
public class Reverseusingtwopointer
{
    public static void reversearray(int arr[])
    {
        int start = 0;
        int end = arr.length-1;

        while(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

            System.out.println("Array elements after reverse =");
            for(int i = 0; i<arr.length; i++)
            {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String args[])
    {
        int arr[] = {1,2,4,5,7,8};
        reversearray(arr);
    }
}