
import java.util.Arrays;
public class BinarySearchex 
{
    public static int BinarySearch(int arr[], int target)
    {
        Arrays.sort(arr);
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");

        }
        System.out.println("  ");
        int start = 0;
        int end = arr.length-1;

        while(start <=end)
        {
            int mid = (start+end)/2;
            if(arr[mid] == target)
            {
                return mid;
            }
            else if(arr[mid] < target)
            {
                start = mid+1;
            }
            else
            {
                end = mid -1;
            }
            
        }
        return -1;

    }
    public static void main(String[] args) 
    {
        int arr[] = {3,5,4,2,7,6,11,13,43,54};
        int ans = BinarySearch(arr, 7);
        System.out.println(ans);

    }
}
