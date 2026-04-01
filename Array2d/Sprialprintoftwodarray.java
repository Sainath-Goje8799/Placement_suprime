public class Sprialprintoftwodarray
{

    public static void PrintSprial(int arr[][])
    {
        int row = arr.length;
        int col = arr[0].length;

        int top =0, left = 0, right = col-1, bottom = row-1;
        
        while(left<=right && top <=bottom)
        {
            //left - right
            for(int j =left; j<= right; j++)
            {
                System.out.print(arr[top][j]+ " ");
            }
            top++;


            //top - bottom
            for(int i = top; i<=bottom; i++)
            {
                System.out.print(arr[i][right]+ " ");
            }
            right--;

            //right - left
            if(top<=bottom)
            {
                for(int j = right; j>=left; j--)
                {
                    System.out.print(arr[bottom][j]+ " ");
                }
            }
            bottom--;

            //bottom - top
            if(left<=right)
            {
                for(int i = bottom; i>=top; i-- )
                {
                    System.out.print(arr[i][left]+ " ");
                }
            }
            left++;
        }
    }
    public static void main(String[] args) 
    {
        int arr[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        PrintSprial(arr);
    }
}
