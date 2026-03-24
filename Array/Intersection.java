public class Intersection
{
    public static void Common( int arr1[] , int arr2[])
    {
        int count = 0;
        for(int i =0; i<arr1.length; i++)
        {
            int  current = arr1[i];
            for(int j = 0 ; j<arr2.length; j++)
            {
                if(current == arr2[j])
                {
                    System.out.println(current);
                    count++;
                    break;
                }
            }
        }

        System.out.println("numberof common elements are "+count);;
    }
    public static void main(String[] args) 
    {
        int arr1[] ={1,2,2,1};
        int arr2[] = {2,2}; 

        Common(arr1,arr2);
    }
}