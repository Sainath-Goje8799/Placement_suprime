package ArrayPatterns;

import java.util.Arrays;

public class Duchnationalflagalgo 
{
    private static void swap(int arr[], int i, int j)
    {
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void sort012(int arr[])
    {
        int n = arr.length;
        int i = 0; 
        int j=0; 
        int k=n-1;

        while(j<=k)
        {
            if(arr[j] == 0)
            {
                swap(arr, i,j);
                i++;
                j++;
            }
            else if(arr[j] == 1)
            {
                j++;
            }
            else
            {
                swap(arr,j,k);
                k--;
            }
        }

    }
    public static void main(String[] args) 
    {
        int arr[] = {2,0,2,1,1,0};
        sort012(arr);
        System.out.println(Arrays.toString(arr));

    }
    
}
