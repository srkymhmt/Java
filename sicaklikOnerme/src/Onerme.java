import java.util.Scanner;

public class Onerme {
    public static void main(String[] args) {

        int sicaklik;
        Scanner inp=new Scanner(System.in);
        System.out.print("Hava kaç derece: ");
        sicaklik=inp.nextInt();

        if (sicaklik<5){
            System.out.println("Kayak yapmaya gidebilirsiniz.");
            }
        if (sicaklik>=5 && sicaklik<=15){
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        if (sicaklik>=10 && sicaklik<=25){
            System.out.println("Pikniğe gidebilirsiniz.");
        }
        if (sicaklik>25){
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
