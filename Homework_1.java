import java.awt.*;
import java.util.Scanner;

public class Homework_1 {
    public static void main(String[] args) {
        /*Soru1:
        double tutar;
        double kdvli_tutar;
        Scanner scan = new Scanner(System.in);
        System.out.println("Para tutarını giriniz : ");
        tutar = scan.nextInt();
        kdvli_tutar = tutar*1.30;
        System.out.println("KDV'siz para tutarı : " +  tutar);
        System.out.println("KDV'li para tutarı : " + kdvli_tutar);
        System.out.println("KDV tutarı : " + (kdvli_tutar - tutar));*/

        /*soru2*/
        /*double tutar;
        double kdvli_tutar = 0.0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Para tutarını giriniz : ");
        tutar = scan.nextInt();
        if (tutar >= 0 && tutar <= 1000)
        {
            kdvli_tutar = tutar * 1.10;
            System.out.println("KDV tutari = " + (kdvli_tutar - tutar));
        }
        else if (tutar > 1000)
        {
            kdvli_tutar = tutar * 1.22;
            System.out.println("KDV tutari = " + (kdvli_tutar - tutar));
        }
        else {
            System.out.println("Geçersiz tutar girdiniz");
        }*/

        /*Switch-case kullanmadan gerekiyorsa if kullan
  */
        /*soru3
        Scanner scan = new Scanner (System.in);
        int not;
        not = scan.nextInt();
        if (not >= 90 && not <= 100 )
            System.out.println("AA");
        else if (not >=80 && not <= 89)
            System.out.println("BA");
        else if (not >= 70 && not <= 79)
            System.out.println("BB");
        else if (not >= 60 && not <= 69)
            System.out.println("CB");
        else if (not >= 50 && not <= 59)
            System.out.println("CC");
        else if (not < 50 && not >= 0)
            System.out.println("FF");
        else
            System.out.println("Geçersiz not girildi");
*/

        /*soru-5
        double number1;
        double number2;
        Scanner scan = new Scanner(System.in);
        System.out.printf("İlk sayıyı giriniz : ");
        number1 = scan.nextDouble();
        System.out.printf("İkinci sayıyı giriniz : ");
        number2 = scan.nextDouble();
        System.out.println(number1 + "*" + number2 + "=" + (number1*number2));
        System.out.println(number1 + "+" + number2 + "=" + (number1+number2));
        System.out.println(number1 + "-" + number2 + "=" + (number1-number2));
        System.out.println(number1 + "/" + number2 + "=" + (number1/number2));
         */

        /*soru-5
            Scanner scan = new Scanner(System.in);
            System.out.printf("Enter a number : ");
            int num = scan.nextInt();
            if (num % 2 == 0)
                System.out.printf("Çift");
            else
                System.out.printf("Tek");*/
        /*soru-6
        Scanner scan = new Scanner(System.in);
        System.out.printf("En küçüğü bulmak için 3 sayı giriniz : ");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int number3 = scan.nextInt();

        int min = number1;
        if ((number1 < number2) && (number1 < number3))
            min = number1;
        else if  ((number2 < number1) && (number2 < number3))
            min = number2;
        else if ((number3 < number1) && (number3 < number2))
            min = number3;

        System.out.println("Girdiğiniz üç sayıdan en küçüğü : " + min);

         */

        /*soru-7
        Scanner scan = new Scanner(System.in);
        System.out.printf("Hava durumu kodu giriniz : (G,R,K,Y,S)");
        String kod = scan.next();
        switch(kod)
        {
            case ("S"):
                System.out.printf("Hava sisli");
                break;
            case ("Y"):
                System.out.printf("Hava yağmurlu");
                break;
            case ("K"):
                System.out.printf("Hava karlı");
                break;
            case ("G"):
                System.out.println("Hava güneşli");
                break;
            case ("R"):
                System.out.println("Hava rüzgarlı");
                break;
            default:
                System.out.printf("Geçersiz hava durumu!");
        }*/

        /*soru-8
        Scanner scan = new Scanner(System.in);
        System.out.println("İki değer giriniz : ");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        System.out.printf("Yapılacak işlemi seciniz : ");
        char islem = scan.next().charAt(0);

        switch(islem)
        {
            case '*':
                System.out.printf(num1 + "*" + num2 + "=" + (num1*num2));
                break;
            case '/':
                System.out.printf(num1 + "/" + num2 + "=" + (num1/num2));
                break;
            case '+':
                System.out.printf(num1 + "+" + num2 + "=" + (num1+num2));
                break;
            case '-':
                System.out.printf(num1 + "-" + num2 + "=" + (num1-num2));
                break;
            default:
                System.out.println("Geçersiz işlem girdiniz !!!");
        }
         */
        /*soru-9*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Yapılacak işlemi seçiniz : (1-Dikdortgen, 2-Kare, 3-Ucgen)");
        int islem = scan.nextInt();
        double kisakenar;
        double uzunkenar;
        double yukseklik;
        switch (islem)
        {
            case 1:
                System.out.printf("Dikdörtgenin kısa kenarının uzunluğunu giriniz : ");
                kisakenar = scan.nextDouble();
                System.out.printf("Dikdörtgenin kısa kenarının uzunluğunu giriniz : ");
                uzunkenar = scan.nextDouble();
                System.out.printf("Dikdörtgenin alanı : " + (kisakenar * uzunkenar));
                break;
            case 2:
                System.out.printf("Karenin bir kenarını giriniz : ");
                kisakenar = scan.nextDouble();
                System.out.printf("Karenin alanı : " + (kisakenar * kisakenar));
                break;
            case 3:
                System.out.printf("Ucgenin taban uzunluğunu giriniz : ");
                kisakenar = scan.nextDouble();
                System.out.printf("Ucgenin yüksekliğini giriniz : ");
                uzunkenar = scan.nextDouble();
                System.out.printf("Üçgenin alanı : " + ((kisakenar * uzunkenar)/2));
                break;
            default:
                System.out.printf("Hatali islem girildi!!!!");
        }
    }
}
