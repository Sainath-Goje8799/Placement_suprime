package Basic;
import java.util.Scanner;
class Scannerclass
{
    static int add(int a , int b)
    {
        return a + b;
    }

    static int sub(int a , int b)
    {
        return a - b;
    }
    static int mul(int a , int b)
    {
        return a * b;
    }
    static int div(int a , int b)
    {
        return a / b;
    }
    static int mod(int a , int b)
    {
        return a % b;
    }

    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();

        add(a , b);
        sub(a , b); 
        mul(a , b);
        div(a , b);

        System.out.println("The sum of a and b is: " + add(a , b));
        System.out.println("The difference of a and b is: " + sub(a , b));
        System.out.println("The product of a and b is: " + mul(a , b));
        System.out.println("The quotient of a and b is: " + div(a , b));
        System.out.println("The modulus of a and b is: " + mod(a , b));
    }
}