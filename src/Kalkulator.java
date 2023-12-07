import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan angka pertama: ");
            double num1 = scanner.nextDouble();

            System.out.print("Masukkan operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Masukkan angka kedua: ");
            double num2 = scanner.nextDouble();

            switch (operator) {
                case '+':
                    System.out.println("Hasil: " + add(num1, num2));
                    break;
                case '-':
                    System.out.println("Hasil: " + subtract(num1, num2));
                    break;
                case '*':
                    System.out.println("Hasil: " + multiply(num1, num2));
                    break;
                case '/':
                    if (num2 != 0) {
                        System.out.println("Hasil: " + divide(num1, num2));
                    } else {
                        System.out.println("Error! Pembagian dengan nol tidak diperbolehkan.");
                    }
                    break;
                default:
                    System.out.println("Error! Operator tidak valid.");
                    break;
            }
        }
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }
}
