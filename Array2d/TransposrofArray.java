package Array2d;

public class TransposrofArray 
{
    public static void printArray(int arr[][])
    {
        int Row = arr.length;
        int Col = arr[0].length;
        for(int i = 0; i< Row; i++)
        {
            for(int j = 0; j<Col; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] Transpose(int arr[][])
    {
        int Row = arr.length;
        int Col = arr[0].length;
        int T[][] = new int [Row][Col];

        for(int i =0; i<Row; i++)
        {
            for(int j = 0; j<Col; j++)
            {
                T[i][j] = arr[j][i];
            }
        }
        return T;
    }


    public static void main(String[] args) 
    {
        int arr[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        

        System.out.println("Original 2d  array is ");
        printArray(arr);


        System.out.println("Transpose 2d array is");
        int transpose[][] = Transpose(arr);
        printArray(transpose);
        
    }
}
