import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan kata atau frase: ");
            String text = scanner.nextLine();

            if (isPalindrome(text)) {
                System.out.println("\"" + text + "\" adalah palindrom");
            } else {
                System.out.println("\"" + text + "\" bukan palindrom");
            }
        }
    }

    public static boolean isPalindrome(String text) {
        String cleaned = text.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
