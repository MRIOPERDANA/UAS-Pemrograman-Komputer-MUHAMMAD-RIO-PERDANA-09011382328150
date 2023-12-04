import java.util.Stack;

public class Soal9 {
    public static boolean isBracketBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char bracket : expression.toCharArray()) {
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.push(bracket); 
            } else if (bracket == ')' || bracket == '}' || bracket == ']') {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), bracket)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char openingBracket, char closingBracket) {
        return (openingBracket == '(' && closingBracket == ')') ||
                (openingBracket == '{' && closingBracket == '}') ||
                (openingBracket == '[' && closingBracket == ']');
    }

    public static void main(String[] args) {
        String expression1 = "((a + b) * (c - d))";
        String expression2 = "{[a + b] * (c - d))";

        if (isBracketBalanced(expression1)) {
            System.out.println(expression1 + " memiliki urutan kurung yang benar.");
        } else {
            System.out.println(expression1 + " memiliki urutan kurung yang salah.");
        }

        if (isBracketBalanced(expression2)) {
            System.out.println(expression2 + " memiliki urutan kurung yang benar.");
        } else {
            System.out.println(expression2 + " memiliki urutan kurung yang salah.");
        }
    }
}
