import java.util.Scanner;


public class SinifiGecmeDurumu {
    public static void main(String[] args) {

        int matematik,fizik,turkce,kimya,muzik,toplam=0,sayac=0;
        double ortalama;

        Scanner inp=new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        matematik=inp.nextInt();
        if(matematik<=100 && matematik>=0){
            toplam+=matematik;
            sayac++;
        }
        System.out.print("Fizik notunuz: ");
        fizik=inp.nextInt();
        if(fizik<=100 && fizik>=0){
            toplam+=fizik;
            sayac++;
        }
        System.out.print("Türkçe notunuz: ");
        turkce=inp.nextInt();
        if(turkce<=100 && turkce>=0){
            toplam+=turkce;
            sayac++;
        }
        System.out.print("Kimya notunuz: ");
        kimya=inp.nextInt();
        if(kimya<=100 && kimya>=0){
            toplam+=kimya;
            sayac++;
        }
        System.out.print("Müzik notunuz: ");
        muzik=inp.nextInt();
        if(muzik<=100 && muzik>=0){
            toplam+=muzik;
            sayac++;
        }
        ortalama=toplam/sayac;
        if (sayac==5){
            if (ortalama>55){
                System.out.println("Sınıfı geçtiniz tebrikler....");
            }else {
                System.out.println("Sınıfı geçemediniz...");
            }
            System.out.println("Not ortalamanız: "+ortalama);
        }else {
            System.out.println("Eksik veya hatalı not girişi yaptınız.Lütfen girdiğiniz notların 0 ile 100 arasında olduğundan emin olunuz...");
            System.out.println("Doğru girdiğiniz not adedi: "+sayac);
        }


    }
}
