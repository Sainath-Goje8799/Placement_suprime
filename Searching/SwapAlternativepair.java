public class SwapAlternativepair
{
    public static void Pairswapped(int arr[])
    {
        for(int i = 0; i<arr.length; i+=2)
        {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        for(int i =0; i<arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }

    }
    public static void main(String[] args) 
    {
        int arr[]  = {1,2,3,4,5,6};
        Pairswapped(arr);
    }
}
