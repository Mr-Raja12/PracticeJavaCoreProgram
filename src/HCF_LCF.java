public class HCF_LCF {
    public static void main (String[]args)
    {
        int num1 = 12, num2 = 6, hcf=0;

        for (int i = 1; i <= num1 || i <= num2; i++)
        {
            if (num1 % i == 0 && num2 % i == 0)
                hcf = i;
        }

        System.out.println("The HCF: "+ hcf);
    }
}










//HCF-->Largest integer that can exactly divide both no without any reminder
//LCM-->Smallest integer that is perfecticly divisible by both number