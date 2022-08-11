import java.util.Scanner;
public class taksiMetre {
    public static void main(String[] args) {
        int km;
        double perkm=2.20,total,startPrice=10;

        Scanner girdi=new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz: ");
        km=girdi.nextInt();

        total=km*perkm;
        total+=startPrice;

        total=(total<20) ? 20 : total;

        System.out.println("Toplam tutar: "+total);

    }
}
