import java.util.Scanner;

public class harmonikSayi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.print("Lütfen n sayısının giriniz: ");
        num=input.nextInt();

        double total =0;
        for (double i=1;i<=num;i++){
            total+=(1/i);
        }
        System.out.println("Toplam sayimiz: "+total);
    }
}
