import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kucuk, n1, n2, ebob = 0, ekok = 0;
        System.out.print("n1 sayisini giriniz: ");
        n1 = scan.nextInt();

        System.out.print("n2 sayisini giriniz: ");
        n2 = scan.nextInt();

        for (int i=1;i<=(n1*n2);i++){
            if(i%n1==0 && i%n2==0){
                ekok=i;
                System.out.println("En küçük ortak katları: "+ekok);
                break;
            }
        }




        if (n1 < n2) {
            kucuk = n1;
        } else {
            kucuk = n2;
        }
        for (int i = kucuk; i >= 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
                break;
            }

        }System.out.println("En büyük ortak bölenleri: "+ebob);

    }
}
