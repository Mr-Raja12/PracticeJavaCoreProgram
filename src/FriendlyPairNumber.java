import java.util.Scanner;
public class FriendlyPairNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = sc.nextInt();
        System.out.println("Enter First Number");
        int num2 = sc.nextInt();
        int sum_num1 = 0, sum_num2 = 0;
        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0)
                sum_num1 += i;
        }
        for (int i = 1; i < num2; i++) {
            if (num2 % i == 0)
                sum_num2 += i;
        }
        if ((sum_num1 == num2) && (sum_num2 == num1))

            System.out.println("Number is Friendly Pair Number");
        else

            System.out.println("Number is Not Friendly Pair Number");
    }
}



//
//The amicable numbers are two different numbers (a pair of numbers)
//    so related that the sum of the proper divisors (excluding the number itself)
//    of one of the numbers is equal to the other. A proper divisor of a number
//        is a divisor other than the number itself.
//        It is also known as friendly numbers.
//example:
//        220 and 284 are Amicable
//factor of 220--> 1 2 4 5 10 11 20 22 44 55 110=Sum-284
//
//factor of 284--> 1 4 71 142 =sum-220