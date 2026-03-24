public class MoveZeroelementatend
{
    public static void movezero(int arr[])
    {
        int index = 0;
        for(int i =0 ; i<arr.length; i++)
        {
            if(arr[i] != 0)
            {
                arr[index] = arr[i];
                index++;
            }
        }
        while(index<arr.length)
        {
            arr[index] = 0;
            index++;
        }
    }
    public static void main(String[] args) 
    {
        int arr[] = {1,0,2,0,0,3};
        movezero(arr);

        for(int i = 0; i<arr.length ; i++)
        {
            System.out.println(arr[i]); 
        }
    }
}
