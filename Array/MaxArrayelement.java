package Array;
import java.util.Scanner;
public class MaxArrayelement
{
    static int maxArray(int arr[])
    {
        int ans = -1;
        for(int i = 0; i<arr.length; i++)
        {
            int current = arr[i];
            if(current  > ans)
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

        for(int i= 0 ; i<n; i++)
        {
            System.out.println("Enter the element of "+i + " index:" );
            arr[i] = sc.nextInt();
        }

        int maxElement = maxArray(arr);
        
        System.out.println("The max element in an array is :"+maxElement);
    }
}