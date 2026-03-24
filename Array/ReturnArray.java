class ReturnArray
{
    public static int[] randomArray()
    {
        int randomarray[] = {1,2,3,4,5,6};
        return randomarray;
    }
    public static void main(String[] args) 
    {
        int returnedArray[] = randomArray();
        for(int val : returnedArray)
        {
            System.out.println(val);
        }
    }
}