package Array;

import java.util.Scanner;
public class MinArrayelement
{
    static int minArray(int arr[])
    {
        int ans = arr[0];
        for(int i =0; i<arr.length; i++)
        {
            int current = arr[i];

            if(current  < ans)
            {
                ans = current;
            }
        }

        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements of an array:");
        for(int i = 0; i<n; i++)
        {
            System.out.println("Enter the array element of " +i+ " position");
            arr[i] = sc.nextInt();
        }


        int minElement = minArray(arr);
        System.out.println("min element in an array is  = "+minElement);
    }
}
