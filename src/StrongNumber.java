import java.util.Scanner;
public class StrongNumber {
    public static int fac(int n)
    {
        int f=1;
        for (int i=1;i<=n;i++)
            f=f*i;
        return f;
    }
    public static void main(String[] args) {
        int n;
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter a Number");
         n=sn.nextInt();
         int sum=0, n1=n;
        while(n!=0)
        {
            int d=n%10;
            sum=sum+fac(d);
            n=n/10;
        }
        if(sum==n1)
            System.out.println("Strong number");
        else
             System.out.println("Not a Strong Number");
        }



    }










