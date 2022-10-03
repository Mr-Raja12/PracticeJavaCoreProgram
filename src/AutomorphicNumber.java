//An automorphic number is an integer whose squre ends with the given
//interger
//eg--5==5^2=25  5 is a atomorphic number
//eg 6==6^2=36   6 is a automrphic number


import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n, l=0;
        while(t>0)
        {
            t=t/10;
            l++;
        }
        int sq=n*n;
        int end =sq%(int)Math.pow(10,l);
        if(n==end)
            System.out.println("It is Automorphic Number");
        else
            System.out.println("It is Not Automorphic Number");
    }
}
