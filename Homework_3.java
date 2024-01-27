import java.util.*;
import java.util.function.IntBinaryOperator;

public class Homework_3 {
    /* q-1
    public static void main(String[] args) {

        HashMap<String, Integer> ogrenci = new HashMap<>();
        int secim;
        Scanner scan = new Scanner(System.in);
        while (true)
        {
            menu();
            secim = scan.nextInt();
            switch(secim)
            {
                case 1:
                    ogrenciEkle(ogrenci,scan);
                    break;
                case 2:
                    notSorgula(ogrenci,scan);
                    break;
                case 3:
                    System.out.println("Proogramdan cikiliyor...");
                    scan.close();
                    System.exit(0);
                default:
                    System.out.println("Gecersiz bir secim yaptiniz lutfen yeniden yazin");
            }
        }
    }

    public static void menu()
    {
        System.out.println("Hangi islemi yapmak istiyorsunuz ?");
        System.out.println("1-Öğrenci ekle");
        System.out.println("2-Not sorgula");
        System.out.println("3-Çıkış yap");
    }

    private static void ogrenciEkle(HashMap<String,Integer> ogrenciNotlari, Scanner scan){
        System.out.print("Ogrenci adini giriniz: ");
        String ogrenciAdi = scan.nextLine();
        scan.nextLine();
        System.out.print("Ogrenci notunu giriniz :");
        int ogrenciNotu = scan.nextInt();

        ogrenciNotlari.put(ogrenciAdi, ogrenciNotu);
        System.out.println(ogrenciAdi+ " ogrencisi eklendi. Notu :" + ogrenciNotu);
    }

    private static void notSorgula(HashMap<String, Integer>ogrenciNotlari, Scanner scan){
        System.out.print("Sorgulamak istediginiz ogrenci adini giriniz : ");
        String ogrenciAdi = scan.nextLine();

        if (ogrenciNotlari.containsKey(ogrenciAdi)){
            int ogrenciNotu = ogrenciNotlari.get(ogrenciAdi);
            System.out.println(ogrenciAdi + " ogrencisinin notu: "+ogrenciNotu);
        }
        else{
            System.out.println(ogrenciAdi+ " ogrencisi bulunamadi.");
        }
    }*/

   /* public static void main(String[] args) {
        ArrayList<Integer> randomSayi = new ArrayList<>();
        HashSet<Integer> ciftSayilar = new HashSet<>();
        ArrayList<Integer> tekSayilar = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i<10;i++)
        {
            int randomNum = random.nextInt(100);
            randomSayi.add(randomNum);
        }

        for(int sayi : randomSayi){
            if (sayi % 2 == 0){
                ciftSayilar.add(sayi);
            }
            else{
                tekSayilar.add(sayi);
            }
        }

    }*/

   /*q-3
    public static void main(String[] args) {

        HashMap<String, Integer> oyuncuPuani = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        while (true)
        {
            menu();
            int secim = scan.nextInt();
            switch (secim)
            {
                case 1:
                    puanEkle(oyuncuPuani, scan);
                    break;
                case 2:
                    puanlariGoruntule(oyuncuPuani);
                    break;
                case 3:
                    System.out.println("Program cikiliyor...");
                    scan.close();
                    System.exit(0);
                default:
                    System.out.println("Gecirsiz secim. Lutfen yeniden seciniz");
            }
        }
    }

    private static void puanEkle(HashMap<String, Integer>oyuncuPuani,Scanner scan){
        System.out.print("Oyuncu adi : ");
        String oyuncuAdi = scan.nextLine();

        System.out.print("Eklemek istediginiz puani giriniz : ");
        int eklenenPuan = scan.nextInt();
        scan.nextLine();

        oyuncuPuani.put(oyuncuAdi, oyuncuPuani.get(oyuncuAdi) + eklenenPuan);
        System.out.println(oyuncuAdi + " oyuncusuna "+eklenenPuan+" eklenmistir.");
    }

    private static void puanlariGoruntule(HashMap<String, Integer>oyuncuPuani){
        if(oyuncuPuani.isEmpty()){
            System.out.println("Liste bostur.");
        }
        else {
            System.out.println("Oyuncu Puanlari: ");
            for(String oyuncuAdi : oyuncuPuani.keySet()){
                int oyuncuPuaniDeger = oyuncuPuani.get(oyuncuAdi);
                System.out.println(oyuncuAdi+": "+oyuncuPuaniDeger);
            }
        }
    }

    public static void menu()
    {
        System.out.println("Lutfen yapmak istediginiz islemi seciniz : ");
        System.out.println("1-Ogrenci Notu Ekle ");
        System.out.println("2-Puanlari Goruntule");
        System.out.println("3-Cikis");
        System.out.println("Seciminizi Yapin");
    }*/

    public static void main(String[] args) {
        HashMap<String, Double> satislar = new HashMap<>();
        satislar.put("Ahmet",1000.0);
        satislar.put("Mehmet",2000.0);
        satislar.put("Yade",2500.0);
        satislar.put("Metehan",3000.0);
        satislar.put("Duru",2050.0);

        double toplamSatis = hesaplaToplamSatis(satislar);
        String enCokSatisYapanMusteri = findMaximumSeller(satislar);

        System.out.println("Toplam Satis Miktari : " + toplamSatis);
        System.out.println("En cok satis yapan musteri : " + enCokSatisYapanMusteri);
    }

    private static double hesaplaToplamSatis(HashMap<String, Double>satislar){
        double toplamSatis = 0.0;
        for(Double satis : satislar.values()){
            toplamSatis += satis;
        }
        return toplamSatis;
    }

    private static String findMaximumSeller(HashMap<String, Double>satis){
        String enCokSatisYapanMusteri = null;
        double maksimumSatis = Double.MIN_VALUE;

        for(Map.Entry<String, Double> entry:satis.entrySet()){
            String musteriAdi = entry.getKey();
            double satisMiktari = entry.getValue();

            if(satisMiktari > maksimumSatis){
                maksimumSatis=satisMiktari;
                enCokSatisYapanMusteri=musteriAdi;
            }
        }
        return enCokSatisYapanMusteri;
    }
}
