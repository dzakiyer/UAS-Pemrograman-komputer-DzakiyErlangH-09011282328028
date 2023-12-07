import java.util.Scanner;

public class Autentikasi {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String username = "user";
            String password = "pass";

            System.out.print("Masukkan username: ");
            String inputUsername = scanner.nextLine();

            System.out.print("Masukkan password: ");
            String inputPassword = scanner.nextLine();

            if (username.equals(inputUsername) && password.equals(inputPassword)) {
                System.out.println("Autentikasi Berhasil");
            } else {
                System.out.println("Autentikasi Gagal");
            }
        }
    }
}
