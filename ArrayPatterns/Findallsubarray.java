package ArrayPatterns;

public class Findallsubarray 
{
    public static void printallsubarray(int arr[])
    {
        int n = arr.length;
        for(int i =0;i<n;i++)
        {
            for(int j = i; j<n; j++)
            {
                for(int k=i; k<=j;k++)
                {
                    System.out.print(arr[k]);
                }
                System.out.print(" ");
            }
        }
    }
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3};
        printallsubarray(arr);
    }
}
