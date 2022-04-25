import java.util.Scanner;

class Fun1
{
    public static void main(String args[])
    {
        int n,ans;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number");
        n=s.nextInt();
        ans = sum(n);

        System.out.println("Sum of "+ n +" numbers is: "+ ans);
    }


    static int sum(int num)
    {
        int a=0,i=1;
        
        while(i<=num)       
        {
            a=a+i;
            i++;
        }
        return a;
    }
}
