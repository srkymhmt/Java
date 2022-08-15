import java.util.Scanner;

public class ciftSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        int sayac=0;

        for (sayac=1;sayac<10;sayac++){
            System.out.println(sayac);
        }
        */

        int num;
        System.out.print("lütfen sayi giriniz: ");
        num = input.nextInt();
/*
        for (int i = 1; i <= num; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }*/
        int i=1;
        while(i<=num){
            if (i%2==0){
                System.out.println(i);
            }
            i++;
        }
    }


}
