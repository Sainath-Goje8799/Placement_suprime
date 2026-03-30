package Array2d;

import java.util.Scanner;

public class Takinginputintwodarray 
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
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the number of rows and columns :");
        int Row = sc.nextInt();
        int Col = sc.nextInt();
        int arr[][] = new int[Row][Col];

        for(int i = 0; i< Row; i++)
        {
            for(int j = 0; j<Col; j++)
            {
                System.out.println("Enter the element for "+i+ " "+j);
                arr[i][j] = sc.nextInt();
           
            }
        }
        sc.close();
        printArray(arr);
    }
}
