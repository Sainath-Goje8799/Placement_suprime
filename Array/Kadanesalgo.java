
//Kadanesalgo is used to find maximum sum subarray 
package Array;

public class Kadanesalgo 
{
    // public static void printallsubarrays(int arr[])
    // {
    //     int n = arr.length;
    //     for(int i =0; i<n; i++)         //start
    //     {
    //         for(int j =i; j<n; j++)     //end
    //         {
    //             for(int k =i; k<=j; k++)        //range
    //             {
    //                 System.out.print(arr[k]);
    //             }
    //             System.out.println(" ");
    //         }
    //     }
    // }
    public static int kadanesalgo(int arr[])
    {
        int maxi = Integer.MIN_VALUE;
        int currsum =0;

        for(int val:arr)
        {
            currsum = currsum+val;
            maxi = Math.max(currsum,maxi);

            if(currsum<0)
            {
                currsum=0;
            }
        }
        return maxi;
    }
    public static void main(String[] args) 
    {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        // printallsubarrays(arr);
        int ans =  kadanesalgo(arr);
        System.out.print(ans);
    }
}
