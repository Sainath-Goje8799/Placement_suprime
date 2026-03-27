package Array;

public class Printallsubarryas 
{
    public static void printallsubarrays(int arr[])
    {
        int n = arr.length;
        for(int i =0; i<n; i++)         //start
        {
            for(int j =i; j<n; j++)     //end
            {
                for(int k =i; k<=j; k++)        //range
                {
                    System.out.print(arr[k]);
                }
                System.out.println(" ");
            }
        }
    }
    public static void main(String[] args) 
    {
        int arr[] ={1,2,3};
        printallsubarrays(arr);

    }    
}
