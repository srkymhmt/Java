import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {

        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00,toplam=0,degisken;

        Scanner girdi=new Scanner(System.in);

        System.out.print("Armut kaç kilo ? :");
        degisken= girdi.nextDouble();
        toplam+=(degisken*armut);
        System.out.print("Elma kaç kilo ? :");
        degisken= girdi.nextDouble();
        toplam+=(degisken*elma);
        System.out.print("Domates kaç kilo ? :");
        degisken= girdi.nextDouble();
        toplam+=(degisken*domates);
        System.out.print("Muz kaç kilo ? :");
        degisken= girdi.nextDouble();
        toplam+=(degisken*muz);
        System.out.print("Patlican kaç kilo ? :");
        degisken= girdi.nextDouble();
        toplam+=(degisken*patlican);

        System.out.println(toplam);

    }
}
