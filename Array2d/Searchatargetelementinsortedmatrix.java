package Array2d;

public class Searchatargetelementinsortedmatrix 
{
    public static void FindTargetelement(int arr[][],int target)
    {
        int Row = 0;
        int col = arr[0].length-1;

        while(Row <= arr.length && col >=0)
        {
            if(arr[Row][col] == target)
            {
                System.out.println("Target element is found at index = ["+Row+","+col +"]");
                break;
            }
            else if(arr[Row][col] < target)
            {
                Row++;
            }
            else
            {
                col--;
            }
        }
    }
    public static void main(String[] args) 
    {
        int arr[][] ={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };

        FindTargetelement(arr, 29);
    }
}
