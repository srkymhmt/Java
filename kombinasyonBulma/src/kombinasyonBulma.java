import java.util.Scanner;

public class kombinasyonBulma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int n,r,nt=1,rt=1,fark=1,answer;
        System.out.println("C(n,r)");
        System.out.print("n: ");
        n=scan.nextInt();
        System.out.print("\nr: ");
        r=scan.nextInt();

        for (int i=1;i<=n;i++){
            nt*=i;
            }
        for (int i=1;i<=r;i++){
            rt*=i;
        }
        for (int i=1;i<=(n-r);i++){
            fark*=i;
        }
        System.out.println("C(n,r)=n!/(r!(n-r)!)");
        answer=nt/(rt*fark);
        System.out.println(answer);
    }
}
