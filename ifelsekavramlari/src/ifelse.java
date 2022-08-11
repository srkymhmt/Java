import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        int sayi1,sayi2,select;

        Scanner inp=new Scanner(System.in);

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Yapmak istediğiniz işlemi seçiniz:");
        select=inp.nextInt();

        System.out.print("İlk sayiyi giriniz: ");
        sayi1=inp.nextInt();

        System.out.print("İkinci sayiyi giriniz: ");
        sayi2=inp.nextInt();

        switch (select){
            case 1:
                System.out.print("Toplama : "+ (sayi1+sayi2));
                break;
            case 2:
                System.out.print("Çikarma : "+ (sayi1-sayi2));
                break;
            case 3:
                System.out.print("Çarpma : "+ (sayi1*sayi2));
                break;
            case 4:
                if(sayi2!=0){
                    System.out.print("Bölme : "+ (sayi1/sayi2));
                }else{
                    System.out.println("Hiçbir sayi 0 a bölünemez!!!");
                }

                break;
            default:
                System.out.println("Hatali giris yaptiniz!!!");

        }
    }
}
