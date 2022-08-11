import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        // Değişkenlerim
        double matematik,fizik,kimya,biyoloji,tarih,edebiyat,ortalama,toplam;

        Scanner girdi=new Scanner(System.in);

        //Kendimizi çok fazla tekrar ettiğimiz kısım burası fakat başlangıç için kabul edilebilir:
        System.out.print("Matematik notunuzu giriniz: ");
        matematik=girdi.nextDouble();
        System.out.print("Fizik notunuzu giriniz: ");
        fizik=girdi.nextDouble();
        System.out.print("Kimya notunuzu giriniz: ");
        kimya=girdi.nextDouble();
        System.out.print("Biyoloji notunuzu giriniz: ");
        biyoloji=girdi.nextDouble();
        System.out.print("Tarih notunuzu giriniz: ");
        tarih=girdi.nextDouble();
        System.out.print("Edebiyat notunuzu giriniz: ");
        edebiyat=girdi.nextDouble();

        System.out.println("Notlariniz sirasiyla: "+matematik+" "+fizik+" "+kimya+" "+biyoloji+" "+tarih+" "+edebiyat);

        //notların hesaplanması
        toplam=(matematik+fizik+kimya+biyoloji+tarih+edebiyat);
        ortalama=toplam/6;
        System.out.println("Not ortalamaniz : "+ortalama);

        //ortalamasının geçip geçmediğini gösteren sorgumuz
        String gectiMi=(60 <= ortalama)? "Sinifi Gectiniz" : "Sinifi Gecemediniz";
        System.out.println(gectiMi);
    }
}
