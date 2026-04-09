package ArrayPatterns;

import java.util.Arrays;

public class Zpractice 
{
    private static void Swap(int arr[], int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

//Duch national flag algorithm(sort numbers)
    // static void SortNumbers(int arr[])
    // {
    //     int n = arr.length;
    //     int i = 0;
    //     int j =0;
    //     int k = n-1;

    //     while(j<=k)
    //     {
    //         if(arr[j] == 0)
    //         {
    //             Swap(arr,i,j);
    //             i++;
    //             j++;
    //         }
    //         else if(arr[j] == 1)
    //         {
    //             j++;
    //         }
    //         else
    //         {
    //             Swap(arr,j,k);
    //             k--;
    //         }
    //     }
    //     System.out.println(Arrays.toString(arr));
    // }


//Prineting all possible subarrays 
    // public static void FindAllSubArray(int arr[])
    // {
    //     for(int i =0;i<arr.length; i++)
    //     {
    //         for(int j =i; j<arr.length;j++)
    //         {
    //             for(int k =i;k<=j;k++)
    //             {
    //                 System.out.print(arr[k]+" ");
    //             }
    //             System.out.println();
    //         }
    //     }
    // }



//Kadanes algo
    // public static void KadanesAlgo(int arr[])
    // {
    //     int n = arr.length;
    //     int currSum =0;
    //     int maxi = Integer.MIN_VALUE;

    //     for(int val : arr)
    //     {
    //         currSum += val;

    //         maxi = Math.max(currSum, maxi);

    //         if(currSum<0)
    //         {
    //             currSum=0;
    //         }
    //     }
    //     System.out.println(maxi);

    // }

//move zeros to the end
    // static void moveZeroatend(int arr[])
    // {
    //     int j = 0;
    //     for(int i =0; i<arr.length; i++)
    //     {
    //         if(arr[i] != 0)
    //         {
    //             Swap(arr,i,j);
    //             j++;
    //         }
    //     }
    //     System.out.println(Arrays.toString(arr));
    // }

//PeakELement 
    // static void PeakElement(int arr[])
    // {
    //     int start  =0;
    //     int end = arr.length-1;

    //     while(start<end)
    //     {
    //         int mid = (start+end)/2;

    //         if(arr[mid]< arr[mid+1])
    //         {
    //             start = mid+1;
    //         }
    //         else
    //         {
    //             end = mid;
    //         }
    //     }
    //     System.out.println(arr[end]);
    // }


    // public static int RemoveDuplicate(int arr[])
    // {
    //     int n = arr.length;
    //     int i = 0;
    //     for(int j =1; j<n; j++)
    //     {
    //         if(arr[i] != arr[j])
    //         {
    //             i++;
    //             arr[i] = arr[j];
    //         }
    //     }
    //     return i+1;
    // }


//sliding window
    // public static int SlidingWindow(int arr[], int k)
    // {
    //     int n = arr.length;
    //     int maxi = Integer.MIN_VALUE;
    //     int winSum = 0;
    //     int i =0;

    //     for(; i<k; i++)
    //     {
    //         winSum += arr[i];
           
    //     }
    //     maxi = Math.max(maxi, winSum);

    //     for(; i<n; i++)
    //     {
    //         winSum -= arr[i-k];
    //         winSum += arr[i];
    //         maxi = Math.max(maxi, winSum);
    //     }
    //     return maxi;

    // }


//Reverse an array using two pointer

    // static void Reversearray(int arr[])
    // {
    //     int start = 0;
    //     int end = arr.length-1;

    //     while(start<=end)
    //     {
    //         Swap(arr,start,end);
    //         start++;
    //         end--;
    //     }
    //     System.out.println(Arrays.toString(arr));
    // }

//Voatingalgo 
    // static void Voatingalgo(int arr[])
    // {
    //     int candidate = -1;
    //     int votes  = 0;

    //     for(int i :arr)
    //     {
    //         if(votes == 0)
    //         {
    //             candidate = i;
    //             votes = 1;
    //         }
    //         else
    //         {
    //             if(i==candidate)
    //             {
    //                 votes++;
    //             }
    //             else
    //             {
    //                 votes--;
    //             }
    //         }
    //     }
    //     System.out.println("MAjority element is : "+candidate);
    // }


    public static int SearchPivote(int arr[])
    {
        int start =0;
        int end = arr.length-1;
        while(start<end)
        {
            int mid = (start+end)/2;

            if(arr[mid] < arr[end])
            {
                start = mid+1;
            }
            else
            {
                end = mid;
            }
        }
        return end;

        
    }
    public static int FindMaxElement(int arr[],int target)
    {
        int pivote = SearchPivote(arr);
        int n= arr.length;

        if(target>arr[pivote] && target <arr[n-1])
        {
            return Arrays.binarySearch(arr,pivote, n-1, target);
        }
        else
        {
            return Arrays.binarySearch(arr,0,pivote,target);
        }

    }
    public static void main(String[] args) 
    {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        int result = FindMaxElement(arr, 0);
        System.out.println(result);

       
       
       
       
       
       
       
       
       
        // Voatingalgo(arr);
        // Reversearray(arr)
       // int ans = SlidingWindow(arr, 3);
        // System.out.println(ans);
        // int length = RemoveDuplicate(arr);
        // System.out.println("LEngth of an array is "+length);

        // for(int i =0;i<length; i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }


        // SortNumbers(arr);
        // FindAllSubArray(arr);
        // KadanesAlgo(arr);

        // moveZeroatend(arr);

        // PeakElement(arr);
    }
}    
