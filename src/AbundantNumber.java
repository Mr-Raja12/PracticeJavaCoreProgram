import java.util.Scanner;
public class AbundantNumber {
    public static void main(String[] args) {
        int n,i,sum=0,x;
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for (i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum>n)
        {
            System.out.println("It is a abundant Number "+n);
            x=sum-n;
            System.out.println("Abundance of the number "+x);

        }
        else
        {
            System.out.println("It is Not a abundant Number "+n);
        }
    }
}

//A number n is said to be Abundant Number if  sum
//of all the proper divisor of the is greater than Number n
//The difference b/w Sum & Number is called the abundance
//It is also called as excessive Number
//example
// input 12
//Proper divisor 1,2,3,4,6
//sum of Divisor 16
//abundance 16-12=4