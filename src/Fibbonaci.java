import java.util.Scanner;

public class Fibbonaci {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan jumlah suku: ");
            int n = scanner.nextInt();

            long[] fibonacci = new long[n];

            for (int i = 0; i < n; i++) {
                if (i < 2) {
                    fibonacci[i] = i;
                } else {
                    fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
                }
            }

            System.out.println("Deret Fibonacci hingga suku ke-" + n + ":");
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci[i] + " ");
            }
        }
    }
}
