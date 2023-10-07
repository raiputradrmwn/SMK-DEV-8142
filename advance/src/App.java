import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int inputNumber = scanner.nextInt();
        
        if (inputNumber > 0) {
            for (int i = 1; i <= inputNumber; i++) {
                int cube = i * i * i;
                System.out.println("Angka saat ini adalah : " + i + " dan kubusnya adalah " + cube);
            }
        } else {
            System.out.println("Masukkan nomor bulat positif.");
        }
        scanner.close();
    }
}
