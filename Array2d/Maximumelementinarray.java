package Array2d;

public class Maximumelementinarray 
{
    public static int FindMaxi(int arr[][])
    {
        int Row = arr.length;
        int Col = arr[0].length;
        int Maxi = Integer.MIN_VALUE;

        for(int i = 0 ; i< Row; i++)
        {
            for(int j = 0; j<Col; j++)
            {
                int current = arr[i][j];
                Maxi = Math.max(Maxi, current);
            }
        }
        return Maxi;
    }
    public static void main(String[] args) 
    {
        int arr[][] = {
            {12,33,55},
            {11,45,76},
            {66,43,98}
        };

        int ans = FindMaxi(arr);
        System.out.println(ans);
     }
}
