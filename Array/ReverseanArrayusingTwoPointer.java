package Array;
import java.util.Arrays;
public class ReverseanArrayusingTwoPointer 
{
    private static void swap(int arr[], int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverseArray(int arr[])
    {
        int n = arr.length;
        int start =0;
        int end =n-1;

        while(start<=end)
        {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr)); // using tostring

        System.out.println("reversed array is ");
        {
            for(int i =0; i<arr.length; i++)
            {
                System.out.print (arr[i] +" ");
            }
        }

    }
    
}
