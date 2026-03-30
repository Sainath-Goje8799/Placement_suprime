package ArrayPatterns;

public class RemoveDuplicatefromSortedarray 
{
    public static int removeduplicate(int arr[])
    {
        int n = arr.length;
        int i =0;

        for(int j = 1; j<n;j++)
        {
            if(arr[j] != arr[i])
            {
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) 
    {
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        int length = removeduplicate(arr);
        System.out.println("Length of an array = " +length);

        System.out.println("array after removing duplicate elements are =");
        for(int i = 0; i<length; i++)
        {
            System.out.println(arr[i]);
        }

    }
}
