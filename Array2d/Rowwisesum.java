class Rowwosesum
{

    public static void RowSum(int arr[][])
    {
        int Row = arr.length;

        for(int i = 0; i< Row; i++)
        {
            int rowSum = 0;
            for(int j = 0; j<arr[i].length; j++)
            {
                rowSum += arr[i][j];
            }

            System.out.println("Sum of total elements for row - "+ i + "is " +rowSum);
        }
    }
    public static void main(String[] args) 
    {
        int arr[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        RowSum(arr);
    }
}