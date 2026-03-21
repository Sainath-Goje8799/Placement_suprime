package Array;
import java.util.Scanner;
public class Arrayex2userarray {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        
       
        int arr[] = new int[n];

        for(int i = 0; i<n ; i++)
        {
            System.out.println("Enter element for index " +i+ " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Your array elements are :");
        for(int i = 0 ; i<n; i++)
        {
            System.out.println(arr[i]);
        }

    }
}
