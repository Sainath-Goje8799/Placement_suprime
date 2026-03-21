package Array;
import java.util.Arrays;
public class Arrayex {
    public static void main(String args[])
    {
        
        int arr[] = new int [5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        int n = arr.length;
       
        for(int i = 0; i<n; i++)
        {
            System.out.println(arr[i]);
           
        }
         System.out.println("   ");


        int arr1[] = {1,4,6,2,3,8,7};
        arr1[2] = 10;
        //Arrays.sort(arr1);
        for(int i=0; i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }
    }
}
