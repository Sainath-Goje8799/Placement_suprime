//reverse the array without using any extra space i.e inplace (Two pointer)

package ArrayPatterns;
import java.util.Arrays;
public class TwoPointer 
{
    private static void swap(int arr[] ,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void ReverseanArray(int arr[])
    {
        int n = arr.length;
        int start = 0;
        int end = n-1;

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
        ReverseanArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
