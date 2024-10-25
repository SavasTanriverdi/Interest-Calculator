import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan ana para, faiz oranı ve süreyi alma
        System.out.print("Ana parayı girin (TL): ");
        double principal = scanner.nextDouble();

        System.out.print("Yıllık faiz oranını girin (%): ");
        double rate = scanner.nextDouble();

        System.out.print("Vade süresini girin (yıl): ");
        int time = scanner.nextInt();

        // Basit faiz hesaplama
        double interest = (principal * rate * time) / 100;
        double totalAmount = principal + interest;

        // Sonuçları gösterme
        System.out.println("\nBasit Faiz: " + interest + " TL");
        System.out.println("Toplam Tutar: " + totalAmount + " TL");

        scanner.close();
    }
}