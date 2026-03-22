package Basic;
import java.util.Scanner;
class Calculator
{

    static int add(int a , int b)
    {
        int ans = a + b;
        return ans;
    }

    static int sub(int a , int b)
    {
        int ans = a - b;
        return ans;
    }   
    static int mul(int a , int b)
    {
        int ans = a * b;
        return ans;
    }
    static int div(int a , int b)
    {
        int ans = a / b;
        return ans;
    }
    public static void main(String args[])
    {
        System.out.println("Welcome to the Calculator program!");

        while(true)
        {   
            System.out.println("Enter your choice: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Divisionn");

            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();

            System.out.println("Enter the first number: ");
            int a = sc.nextInt();
            System.out.println("Enter the second number: ");
            int b = sc.nextInt();


            int ans = 0;
            switch(ch)
            {
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                    break;
                case 1:
                    ans = add(a , b);
                    break;
                case 2:
                    ans = sub(a,b);
                    break;
                
                case 3:
                    ans = mul(a,b);
                    break;
                
                case 4:
                    ans = div(a,b);
                    break;

                default:
                    System.out.println("Invalid choice ");
                    continue;
            }

            System.out.println("ans = " + ans);
        }
    }
}