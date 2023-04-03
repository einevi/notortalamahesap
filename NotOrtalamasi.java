import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat, fizik, kimya, turce, tarih, muzik;
        double ortalama=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matematik Notunuzu Giriniz:");
        mat = scanner.nextInt();

        System.out.println("Fizik Notunuzu Giriniz:");
        fizik = scanner.nextInt();

        System.out.println("Turkce Notunuzu Giriniz:");
        turce = scanner.nextInt();

        System.out.println("Kimya Notunuzu Giriniz:");
        kimya = scanner.nextInt();

        System.out.println("Tarih Notunuzu Giriniz:");
        tarih = scanner.nextInt();

        System.out.println("Muzik Notunuzu Giriniz:");
        muzik = scanner.nextInt();

        ortalama = (mat + fizik + turce + kimya + tarih + muzik)/6;
        System.out.println("Ortalama : " + ortalama);
        System.out.println(ortalama>60?"Sınıfı Geçti":"Sınıfta Kaldı");


    }
}
