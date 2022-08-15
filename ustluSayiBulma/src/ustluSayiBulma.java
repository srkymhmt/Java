import java.util.Scanner;

public class ustluSayiBulma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sayi,ustu;

        System.out.print("Üstünü bulmak istediğiniz sayıyı giriniz: ");
        ustu=scan.nextInt();

        System.out.print("Hangi sayıya kadar üstleri yazdırayım?:  ");
        sayi=scan.nextInt();


        for (int i=1;i<=sayi;i*=ustu){
            System.out.println(i);
        }


    }
}
