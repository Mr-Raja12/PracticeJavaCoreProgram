import java.util.Scanner;

public class Binary_To_Decimal {
    public static void main(String[] args) {
        System.out.println("Enter a binary Number");
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        int d = 0;
        int t = num;
        int i = 0;

        while (t > 0) {
            int r = t % 10;
            t = t / 10;
            d = d + r * (int) Math.pow(2, i++);
        }
        System.out.println("Decimal of " + num + " is " + d);
    }

}






//example
//        (1000)2===8 4 2 1==decimal 8
//        (10011)2==16 8 4 2 1 ==decimal 19
//         1*2^0 + 1*2^1 + 0*2^2 + 0*2^3 + 1*2^4 = 19