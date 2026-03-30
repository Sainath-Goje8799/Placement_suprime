package Array2d;

public class Twodarrayex
{
    public static void main(String[] args) 
    {
        int arr[][] = new int[3][3];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        arr[0][1] = 10;
        arr[0][2] = 11;
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);
        System.out.println(arr[1][1]);
    
        int arr2[][] ={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        System.out.println(arr2[1][1]);
    }
}
