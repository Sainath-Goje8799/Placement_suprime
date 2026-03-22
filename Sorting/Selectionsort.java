package Sorting;
import java.util.Scanner;
public class Selectionsort
{

    public static void selectionSort(int arr[])
    {
        int n = arr.length;
        for(int i = 0; i < n-1; i++)
        {
            int minIndex = i;
            for(int j = i+1; j < n; j++)
            {
               if(arr[j] < arr[minIndex])
               {
                    minIndex = j;
               }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;            
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
        selectionSort(arr);
        System.out.println("Sorted array is:");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
}
