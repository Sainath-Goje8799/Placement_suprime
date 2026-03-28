package ArrayPatterns;

public class kadanesalgo 
{
    public static int kadanesAlgo(int arr[])
    {
        int maxi = Integer.MIN_VALUE;
        int currsum = 0;

        for(int val : arr)
        {
            currsum = currsum + val;

            maxi = Math.max(currsum, maxi);

            if(currsum<0)
            {
                currsum =0;
            }
        }

        return maxi;
    }
    public static void main(String[] args) 
    {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = kadanesAlgo(arr);
        System.out.println(ans);
    }
}
