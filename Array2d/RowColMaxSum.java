package Array2d;

public class RowColMaxSum 
{

    public static void rowcolmaxsum(int[][] arr)
    {
        int row = arr.length;
        int col = arr[0].length;
        int maxi = Integer.MIN_VALUE;
        String maxloc = "";

        for(int i =0; i< row; i++)
        {
            int rowSum = 0;
            for(int j =0; j< col; j++)
            {
                rowSum += arr[i][j];
            }

            if(rowSum > maxi)
            {
                maxi = rowSum;
                maxloc = "Row " + i + " maximum is  " +maxi; 
            } 
        }
       
        for(int j =0; j<col ; j++)
        {
            int colsum = 0;
            for(int i =0; i< row; i++)
            {
                colsum += arr[i][j];
            }
            if(colsum > maxi)
            {
                maxi =colsum;
                maxloc = "col " + j +" maximum is  " +maxi; 
            }
        }
        System.out.println(maxloc);
    }
    public static void main(String[] args) 
    {
        int arr[][] = {
            {100,200,3},
            {4,500,6},
            {7,8,9}
        };

        rowcolmaxsum(arr);
    }
}
