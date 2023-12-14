import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik Notunuz");
        mat= inp.nextInt();

        System.out.println("Fizik Notunuzu Giriniz");
        fizik = inp.nextInt();

        System.out.println("Kimya Notunuzu Giriniz");
        kimya = inp.nextInt();

        System.out.println("Türkçe Notunuzu Giriniz ");
        turkce = inp.nextInt();

        System.out.println("Tarih Notunuzu Giriniz ");
        tarih = inp.nextInt();

        System.out.println("Müzik Notunuzu Giriniz ");
        muzik = inp.nextInt();

        int sonuc= mat+ fizik + kimya + turkce + tarih + muzik;
        double toplam= sonuc/6;
        boolean kosul = toplam >=60;
        String result= kosul ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println("Not Ortalamanız : " + toplam +" "+ result);


        }
    }
