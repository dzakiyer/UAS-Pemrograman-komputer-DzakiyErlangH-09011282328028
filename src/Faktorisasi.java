import java.util.Scanner;

public class Faktorisasi {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan bilangan: ");
            int n = scanner.nextInt();

            System.out.print("Faktorisasi " + n + ": ");

            for (int i = 2; i <= n; i++) {
                while (n % i == 0) {
                    System.out.print(i);

                    n /= i;

                    if (n >= i) {
                        System.out.print(" * ");
                    }
                }
            }
        }

        System.out.println();
    }
}
