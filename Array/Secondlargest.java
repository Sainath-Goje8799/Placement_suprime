package Array;

class Secondlargest
{
    static int secondlarge(int arr[])
    {
        int largest = -1;
        int secondlargest = -1;

        for(int i = 0; i<arr.length-1; i++)
        {
            if(arr[i] > largest)
            {
                secondlargest = largest;
                largest = arr[i];
            }
        }
        return secondlargest;
    }
    public static void main(String[] args) 
    {
        int arr[] = {10,20,5,8};
        int ans = secondlarge(arr);
        System.out.println(ans);
    }
}