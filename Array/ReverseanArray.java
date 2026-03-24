package Array;

import java.util.Scanner;

public class ReverseanArray 
{
    public static void reversearray(int arr[])
    {
        int n = arr.length;
        System.out.println("Reverse arrays are :");
        for(int i=n-1; i>=0; i-- )
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the array elements");
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(" ");
        reversearray(arr);
    }

}
