import java.util.Scanner;

public class MyJavaApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Basit Hesap Makinesi ===");

        System.out.print("Birinci sayıyı girin: ");
        double sayi1 = input.nextDouble();

        System.out.print("İkinci sayıyı girin: ");
        double sayi2 = input.nextDouble();

        System.out.println("İşlem seçin (+, -, *, /): ");
        char islem = input.next().charAt(0);

        double sonuc;

        switch (islem) {
            case '+':
                sonuc = sayi1 + sayi2;
                System.out.println("Sonuç: " + sonuc);
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                System.out.println("Sonuç: " + sonuc);
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                System.out.println("Sonuç: " + sonuc);
                break;
            case '/':
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                    System.out.println("Sonuç: " + sonuc);
                } else {
                    System.out.println("Hata: Sıfıra bölme yapılamaz!");
                }
                break;
            default:
                System.out.println("Geçersiz işlem seçildi.");
        }

        input.close();
    }
}
