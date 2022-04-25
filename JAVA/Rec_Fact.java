import java.util.Scanner;

class Rec_Fact
{
    public static void main(String args[])
    {
        int n,ans;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number");
        n=s.nextInt();
        ans = fact(n);

        System.out.println("Factorial of "+ n +" numbers is: "+ ans);
    }


    static int fact(int num)
    {
        if (num >= 1)
            return num * fact(num - 1);
        else
            return 1;
    }
}
