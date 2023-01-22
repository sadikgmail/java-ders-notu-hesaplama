package deneme;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double Matematik, Fizik, Kimya, Turkce, Tarih, Muzik;

        Scanner inp = new Scanner(System.in);


        System.out.print("Matematik Notunuz : ");
        Matematik = inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        Fizik = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        Kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz : ");
        Turkce = inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        Tarih = inp.nextInt();

        System.out.print("Muzik Notunuz : ");
        Muzik = inp.nextInt();

        double Toplam = (Matematik + Fizik + Kimya + Turkce + Tarih + Muzik);

        double ortalama = Toplam / 6.0;


        boolean sonuc = ortalama > 60.00;

        System.out.println("Ortalamanız : " + ortalama);
        System.out.println(sonuc ? "Geçtiniz" : "Kaldınız");



    }
}
