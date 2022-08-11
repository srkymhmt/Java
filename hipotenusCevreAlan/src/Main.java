import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kenar1,kenar2,kenar3;
        double hipotenus,alan,cevre;
        Scanner girdi=new Scanner(System.in);

        System.out.print("Lütfen 1.kenari giriniz: ");
        kenar1=girdi.nextInt();
        System.out.print("Lütfen 2. kenari giriniz: ");
        kenar2=girdi.nextInt();


        //hesaplamalarımızı yapalım

        hipotenus=Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
        alan=(kenar1*kenar2)/2;
        System.out.println("Belirttiginiz kenarlara göre üçgenin hipotenusu: "+hipotenus+"\nAlanı: "+alan);

        System.out.print("Lütfen 3. kenari giriniz: ");
        kenar3=girdi.nextInt();

        cevre=kenar1+kenar2+kenar3;

        System.out.println("Belirttiginiz kenarlara göre üçgenin hipotenusu: "+hipotenus+"\nAlanı: "+alan+"\nCevresi: "+cevre);




    }
}
