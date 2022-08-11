import java.util.Scanner;


public class Daire {
    public static void main(String[] args) {
        int merkezAci;
        double yaricap,cevre,alan,pi=3.14,daireDilimiAlan;
        System.out.print("Lütfen dairenin yaricapini giriniz: ");
        Scanner girdi=new Scanner(System.in);
        yaricap= girdi.nextDouble();

        cevre=2*pi*yaricap;
        alan=pi*(yaricap*yaricap);

        System.out.println("Dairenin cevresi:"+cevre+"\nAlanı: "+alan);

        System.out.print("Merkez açısının ölçüsünü giriniz: ");
        merkezAci= girdi.nextInt();


        daireDilimiAlan=(pi*(yaricap*yaricap)*merkezAci)/360;

        System.out.println("Daire diliminin alanı: "+daireDilimiAlan);

    }
}
