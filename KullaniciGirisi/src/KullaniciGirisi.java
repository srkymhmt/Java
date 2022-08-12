import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String username,password,sifresifirlama,yeniSifre;

        Scanner inp=new Scanner(System.in);

        System.out.print("Kullanici Adınız: ");
        username=inp.nextLine();

        System.out.print("Sifreniz: ");
        password= inp.nextLine();

        if(username.equals("username")){
            if (password.equals("password")) {
                System.out.println("Kullanici girişiniz yapılmıştır.");
            }else {
                System.out.println("Sifrenizi mi unuttunuz? Sıfırlamak ister misiniz? Yes / No ");
                sifresifirlama=inp.nextLine();
                if ((sifresifirlama.equals("Yes"))||(sifresifirlama.equals("yes"))){
                    System.out.println("Lütfen oluşturmak istediğiniz şifreyi giriniz. ");
                    yeniSifre=inp.nextLine();
                    if (yeniSifre==password){
                        System.out.println("Eski şifreyle aynı şifreyi oluşturamazsınız.");
                    }else {
                        password=yeniSifre;
                        System.out.println("Şifreniz başarıyla kaydedilmiştir."+password);
                    }

                }else {
                    System.out.print("Lütfen tekrar deneyiniz.Parola sıfırlamaya gidilmedi.");
                }
            }
            }else{
            System.out.println("Lütfen kullanici adınızı ya da parolanızı kontrol ediniz.");
        }

        }

    }

