package Sorting;
import java.util.Scanner;
public class Bubblesort
{
    public static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for(int i = 0; i < n-1; i++)
        {
            for(int j = 0; j < n-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to add");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the array Elements");
        for(int i = 0; i<n; i++)
        {
            System.out.println("Enter the array elements of " +i+ " index");
            arr[i] = sc.nextInt();
        }
        
        bubbleSort(arr);
        System.out.println("Sorted array is:");
        for(int i = 0; i < n; i++)
        {
            System.out.println(arr[i] + " ");
        }

    }
    

}
