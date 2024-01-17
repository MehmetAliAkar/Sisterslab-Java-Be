import java.util.Scanner;

public class Homework_2 {
    /* q-1)

    public static int fibonacci(int num)
    {
        if (num == 0 || num == 1)
            return 1;
        return fibonacci(num-2)+fibonacci(num-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int step;
        System.out.printf("Enter the step number");
        step = scan.nextInt();
        System.out.println("number of " + step + ". element is :" + fibonacci(step));
    }*/

    /* q-2
    public static boolean is_polindrome(int num)
    {
        int poli=0,contNum;
        contNum = num;
        while (num != 0)
        {
            poli *=10;
            poli += num %10;
            num /= 10;
        }
        if (poli == contNum)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Enter a number to check is Polindrome or not : ");
        num = scan.nextInt();
        if (is_polindrome(num) == true)
            System.out.println("The number is polindrome!");
        else
            System.out.println("The number is not polindrome");
    }*/

   /* q-3
    public static int calcPermutation(int num)

    {
        int calc=1;
        while (num > 0)
        {
            calc*=num;
            num--;
        }
        return calc;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Enter a number to calculate the permutation : ");
        num = scan.nextInt();
        System.out.println("Permutation of "+ num+ " : "+calcPermutation(num));
    }*/

   /* q4 public static boolean is_prime(int num)
    {
        if (num < 2)
            return false;
        int i = 2;
        while (i <=(num/2))
        {
            if (num % i == 0)
                return false;
            i++;
        }
        return true;
    }
    */

    /* q-5
    public static double hesapMakinesi(double num1, double num2, char islem)
    {
        if (islem == '*')
            return (num1 * num2);
        else if (islem == '/')
            return (num1/num2);
        else if (islem == '-')
            return num1- num2;
        else if (islem == '+')
            return num1+num2;
        else
        {
            System.out.println("Hatali islem girdiniz");
            return 0;
        }
    }

    public static void main(String[] args) {
        double num1, num2;
        char islem;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num1, num2 and the process : ");
        System.out.printf("Num1 : ");
        num1 = scan.nextDouble();
        System.out.printf("Num2 : ");
        num2 = scan.nextDouble();
        System.out.printf("Islem : ");
        islem = scan.next().charAt(0);
        System.out.println(num1 + " " + islem + " " + num2 + " = " + hesapMakinesi(num1,num2,islem));
    }
     */

   /* q-6
    public static int ekok(int num1, int num2)
    {
        int max = (num1 < num2 ? num1 : num2);
        for(int i = max; i < (num1*num2);i+=max)
        {
            if (i % num1 == 0 && i % num2 == 0)
            {
                return i;
            }
        }
    }
    public static int ebob(int num1, int num2)
    {
        int gcd=0;
        for( int i =1 ;i <= num1 && i <= num2; i++)
        {
            if (num1 % i == 0 && num2 % i == 0)
                gcd = i;
        }
        return gcd;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two number to find ebob and ekok : ");
        int num1,num2;
        num1 = scan.nextInt();
        num2=scan.nextInt();
        System.out.println("Iki sayinin ebobu : "+ ebob(num1,num2) + "Iki sayinin ekoku : "+ekok(num1,num2));
    }*/

    public static int power(int a, int b)
    {
        int res = 1;
        while (b > 0)
        {
            res *= a;
            b--;
        }
        return res;
    }

    public static int ft_len(int num)
    {
        int digit=0;
        while (num != 0){
            num/=10;
            digit++;
        }
        return digit;
    }
    public static boolean isArmstrong(int num)
    {
        int cnum = num;
        int digit = ft_len(num);
        int sum = 0;
        while (num != 0)
        {
            sum += power((num%10),digit);
            num/=10;
        }
        if (sum == cnum)
            return true;
        else
            return false;
    }
}
