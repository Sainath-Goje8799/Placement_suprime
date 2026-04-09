package Array2d;

public class Practiceofarray 
{
    // static int FindMaxElement(int arr[][])
    // {
    //     int Row = arr.length;
    //     int col = arr[0].length;
    //     int Maxi = Integer.MIN_VALUE;

    //     for(int i = 0; i<Row; i++)
    //     {
    //         for(int j =0; j<col; j++)
    //         {
    //             int current = arr[i][j];
    //             Maxi = Math.max(Maxi, current);
    //         }
    //     }
    //     return Maxi;
    // }

    // public static void RowColsum(int arr[][])
    // {
    //     int ROw  = arr.length;
    //     int col = arr[0].length;
    //     int maxi = Integer.MIN_VALUE;
    //     String MaxLoc ="";


    //     for(int i = 0; i<ROw; i++)
    //     {
    //         int RowSum = 0;
    //         for(int j = 0; j<col; j++)
    //         {
    //             RowSum += arr[i][j];
    //         }
    //         if(RowSum > maxi)
    //         {
    //             maxi = RowSum;
    //             MaxLoc = " Row " +i+ " Maxi " +maxi;
    //         }
    //     }
    //     for(int i = 0; i<col; i++)
    //     {
    //         int ColSum = 0;
    //         for(int j = 0; j<ROw; j++)
    //         {
    //             ColSum += arr[i][j];
    //         }
    //         if(ColSum > maxi)
    //         {
    //             maxi = ColSum;
    //             MaxLoc = " COl " +i+ " Maxi " +maxi;
    //         }
    //     }
    //     System.out.println(MaxLoc);
    // }

    // static void Rowwisesum(int arr[][])
    // {
    //     int Row = arr.length;

    //     for(int i = 0; i<Row; i++)
    //     {
    //         int RowSum = 0;
    //         for(int j = 0; j<arr[i].length;j++)
    //         {
    //             RowSum += arr[i][j];
    //         }
    //         System.out.println("total sum of "+i+ " Row is "+RowSum);
    //     }
    // }


    // static void Searchelement(int arr[][], int target)
    // {
    //     int Row = 0;
    //     int col = arr[0].length -1;

    //     while(Row<=arr.length && col>=0)
    //     {
    //         if(arr[Row][col] == target)
    //         {
    //             System.out.println("Element is fount at index "+Row+" "+col);
    //             break;
    //         }
    //         else if(arr[Row][col] < target)
    //         {
    //             Row++;
    //         }
    //         else
    //         {
    //             col--;
    //         }
    //     }
    // }

    static void SpiralPrint(int arr[][])
    {
        int Row = arr.length;
        int Col = arr[0].length;
        int top = 0, bottom = Row-1, left = 0, right = Col-1;

        while(left<=right && top<=bottom)
        {
            for(int i = left; i<=right; i++)
            {
                System.out.print(arr[top][i]+" ");
            }
            top++;

            for(int j = top ; j<=bottom; j++)
            {
                System.out.print(arr[j][right]+" ");
            }
            right--;

            if(top<= bottom)
            {
                for(int i = right; i>=left; i--)
                {
                    System.out.print(arr[bottom][i]+" ");
                }
            
            }
            bottom--;

            if(left<=right)
            {
                for(int j =bottom; j>=top;j--)
                {
                    System.out.print(arr[j][left]+" ");
                }
            }
            left++;  
        }
    }
       
    public static void main(String args[])
    {
       int arr[][] ={
            {10,20,30,40},
            {15,25,35,44},
            {27,29,37,39},
            {32,33,39,43}
        };
        // int ans =FindMaxElement(arr);
        // System.out.println(ans);

        //Rowwisesum(arr);

        //Searchelement(arr,39);

        SpiralPrint(arr);
     }
}
