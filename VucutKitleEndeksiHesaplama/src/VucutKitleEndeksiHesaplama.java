import java.util.Scanner;


public class VucutKitleEndeksiHesaplama {
    public static void main(String[] args) {

        double boy,kilo,indeks;

        Scanner girdi=new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy= girdi.nextDouble();
        
        //Burada cm cinsinden girerse metreye cevirme kontrolü koydum.
        boy=(boy>3) ? (boy/100) : boy;

        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo= girdi.nextDouble();

        indeks=kilo/(boy*boy);

        System.out.print("Vücut kitle İndeksiniz: "+indeks);

    }
}
