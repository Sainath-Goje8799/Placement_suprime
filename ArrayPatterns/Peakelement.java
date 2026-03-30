public class Peakelement 
{
    public static int Findpeakelement(int arr[])
    {
        int start = 0;
        int end = arr.length;

        while(start<end)
        {
            int mid = (start+end)/2;
            if(arr[mid] < arr[mid+1])
            {
                start = mid+1;
            }
            else
            {
                end = mid;
            }
        }
        return arr[end];
    }


    public static void main(String[] args) 
    {
        int arr[] = {1,2,1,3,5,6,4};
        int ans = Findpeakelement(arr);
        System.out.println(ans);
    }
}
