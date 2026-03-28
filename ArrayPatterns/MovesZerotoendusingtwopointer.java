package ArrayPatterns;

import java.util.Arrays;

class MovesZerotoendusingtwopointer
{
    private static void swap(int arr[],int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void movezeroatend(int arr[])
    {
        int j = 0;
        for(int i =0; i<arr.length; i++)
        {
            if(arr[i] != 0)
            {
                swap(arr, i, j);
                j++;
            }
        }
    }

    public static void main(String[] args) 
    {
        int arr[] = {1,0,2,0,0,3};
        movezeroatend(arr);
        System.out.println(Arrays.toString(arr));
    }
}