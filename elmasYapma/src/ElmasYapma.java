import java.util.Scanner;

public class ElmasYapma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz :");
        int n = scan.nextInt();

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i -1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int a = 1; a <=n-1 ; a++) {
            for (int b = 0; b < a; b++) {
                System.out.print(" ");
            }
            for (int k = (2*n-1-2*a); k >=1; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}