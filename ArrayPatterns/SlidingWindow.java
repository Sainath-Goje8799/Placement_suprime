package ArrayPatterns;

public class SlidingWindow
{
    public static int SumArraySizeK(int arr[], int k)
    {
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        int windowsum = 0;
        int i =0;
        for(; i<k; i++)
        {
            windowsum += arr[i];
        }
        maxi = Math.max(maxi, windowsum);

        for(; i<n; i++)
        {
            windowsum -= arr[i-k];
            windowsum += arr[i];
            maxi = Math.max(maxi, windowsum);
        }

        return maxi;

    }
    public static void main(String[] args) 
    {
        int arr[] = {2,1,5,1,3,2};
        int ans =SumArraySizeK(arr, 3);

        System.out.println(ans);
    }
}
