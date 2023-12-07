import java.util.Scanner;

public class TokoOnline {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan harga barang: ");
            double harga = scanner.nextDouble();

            System.out.print("Masukkan jumlah barang: ");
            int jumlah = scanner.nextInt();

            double total = harga * jumlah;
            double diskon = 0;

            if (jumlah < 5) {
                diskon = 0;
            } else if (jumlah >= 5 && jumlah <= 10) {
                diskon = 0.05;
            } else if (jumlah > 10 && jumlah <= 20) {
                diskon = 0.1;
            } else if (jumlah > 20) {
                diskon = 0.2;
            }

            total -= total * diskon;

            System.out.println("Total harga setelah diskon: " + total);
        }
    }
}
