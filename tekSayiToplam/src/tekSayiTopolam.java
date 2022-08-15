import java.util.Scanner;

public class tekSayiTopolam {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int girdi, toplam = 0;

        System.out.print("Lüttfen bir sayi giriniz: ");
        girdi = inp.nextInt();

        for (int i = 0; i <= girdi; i++) {

            if (i % 2 == 1) {
                toplam += i;
            }
        }
        System.out.println(toplam);
    }
}
