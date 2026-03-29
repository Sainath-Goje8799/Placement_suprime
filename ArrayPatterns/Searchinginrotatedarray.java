package ArrayPatterns;

import java.util.Arrays;

public class Searchinginrotatedarray 
{
    // Find pivot (smallest element index)
    public static int searchpivote(int arr[])
    {
        int start = 0;
        int end = arr.length - 1;

        while(start < end)
        {
            int mid = (start + end) / 2;

            if(arr[mid] > arr[end])
            {
                start = mid + 1;
            }
            else
            {
                end = mid;
            }
        }
        return start; // pivot index
    }

    // Search target using pivot
    public static int findInRotatedArray(int arr[], int target)
    {
        int pivot = searchpivote(arr);
        int n = arr.length;

        // If target lies in right sorted part
        if(target >= arr[pivot] && target <= arr[n-1])
        {
            return Arrays.binarySearch(arr, pivot, n, target);
        }
        else // left part
        {
            return Arrays.binarySearch(arr, 0, pivot, target);
        }
    }

    public static void main(String[] args) 
    {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;

        int result = findInRotatedArray(arr, target);

        System.out.println("Index: " + result);
    }
}