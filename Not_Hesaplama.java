package days.day11;

import java.util.Scanner;

public class Not_Hesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        System.out.print("fizik notunuz : ");
        int fizik = scan.nextInt();

        System.out.print("matematik notunuz : ");
        int  matematik = scan.nextInt();

        System.out.print("turkce notunuz : ");
        int turkce = scan.nextInt();

        System.out.print("kimya notunuz : ");
        int  kimya = scan.nextInt();

        System.out.print("müzik notunuz : ");
        int muzik= scan.nextInt();

        System.out.print("tarih notunuz : ");
        int tarih = scan.nextInt();

        double sonuc;

        sonuc =(fizik + tarih + matematik + turkce + kimya + muzik) / 6.0;

        System.out.print("ortalamanız: "+ sonuc);


    }

}
