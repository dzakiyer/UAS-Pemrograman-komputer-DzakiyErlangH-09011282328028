import java.util.Stack;

public class DataStack {
    public static void main(String[] args) {
        String expression = "((1 + 2) * (3 / 4))"; // Contoh ekspresi matematika

        if (isBalanced(expression)) {
            System.out.println("Urutan kurung pada ekspresi matematika sudah benar");
        } else {
            System.out.println("Urutan kurung pada ekspresi matematika tidak benar");
        }
    }

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
