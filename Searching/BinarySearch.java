public class BinarySearch
{
    public static int Binarysearch(int arr[], int key)
    {
        int n = arr.length;
        int start = 0;
        int end = n-1;
        
        while(start <= end)
        {
            int mid = (start+end) / 2;
            if(arr[mid] == key)
            {
                return mid;
            }
            else if(arr[mid] < key)
            {
                start = mid+1;
               
            }
            else
            {
                 end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        int arr[] = {2,4,6,8,9,12,14,15};
        int ans =Binarysearch(arr , 14);
        System.out.println(ans);
    }
}