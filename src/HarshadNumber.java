//Java Program to Check harshad number
//A number is sai to be harshad number if and only if the the sum of entered
//number completely divided the entered number(into base of 10)
//example
//input=18
//sum =1+8
//Now 18 is divided by the 9 comletely
import java.util.Scanner;
public class HarshadNumber {
    public static void main(String[] args) {
        int num = 18;
        int rem = 0, sum = 0, n;
        n = num;

        while(num > 0){
            rem = num%10;
            sum = sum + rem;
            num = num/10;
        }
        if(n%sum == 0)
            System.out.println(n + " is a harshad number");
        else
            System.out.println(n + " is not a harshad number");
    }
}




