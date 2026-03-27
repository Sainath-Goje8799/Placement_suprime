//find majority elements in an array

package Array;

public class Votingalgo 
{
    public static int majorityelement(int arr[])
    {
        int candidate=-1;
        int votes = 0;

        for(int i : arr)
        {
            if(votes == 0)
            {
                candidate = i;
                votes = 1;
            }
            else
            {
                if(i == candidate)
                {
                    votes++;
                }
                else
                {
                    votes--;
                }
            }

           
        }
        return candidate;
    }
    public static void main(String[] args) 
    {
        int arr[] = {3,2,3};
        int ans = majorityelement(arr);
        System.out.println(ans);

    }
}
