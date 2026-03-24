public class FrequencyofElement
{

    public static void Frequencount(int arr[])
    {
        for(int i = 0; i<arr.length; i++)
        {
            int count = 1;
            boolean isCount = false;
            for(int k = 0 ; k<i; k++ )
            {
                if(arr[i] == arr[k])
                {
                    isCount = true;
                    break;
                }
            }

            if(isCount)
            {
                continue;
            }

            for(int j =i+1; j<arr.length;j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                }
            }

            System.out.println("The number of count of " +arr[i] + " element is "+count);
        }
    }
    public static void main(String args[])
    {
        int arr[] = {1,2,2,3,1};
        Frequencount(arr);
    }
}