import java.util.Stack;

public class Questions_54 {
    public static void main(String[] args) {
        Infix_Evaluation("2+6*4/8-3");
        
    }
    private static void Infix_Evaluation(String exp) {
        Stack<Integer> integers = new Stack<>();
        Stack<Character> optors = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(') {
                optors.push(ch);
            } else if (Character.isDigit(ch)) {
                integers.push(ch - '0');
            } else if (ch == ')') {
                while (optors.peek() != '(') {
                    char optor = optors.pop();
                    int v2 = integers.pop();
                    int v1 = integers.pop();
                    int opv = operation(v1, v2, optor);
                    integers.push(opv);
                }
                optors.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (optors.size() > 0 && optors.peek() != '(' && Precedence(ch) <= Precedence(optors.peek())) {
                    char optor = optors.pop();
                    int v2 = integers.pop();
                    int v1 = integers.pop();
                    int opv = operation(v1, v2, optor);
                    integers.push(opv);
                }
                optors.push(ch);
            }
        }
        while (optors.size() != 0) {
            char optor = optors.pop();
            int v2 = integers.pop();
            int v1 = integers.pop();
            int opv = operation(v1, v2, optor);
            integers.push(opv);
        }
        System.out.println(integers.peek());
    }

    private static int Precedence(char optor) {
        if (optor == '+') {
            return 1;
        } else if (optor == '-') {
            return 1;
        } else if (optor == '*') {
            return 2;
        } else {
            return 2;
        }
    }

    private static int operation(int v1, int v2, char optor) {
        if (optor == '+') {
            return v1 + v2;
        } else if (optor == '-') {
            return v1 - v2;
        } else if (optor == '*') {
            return v1 * v2;
        } else {
            return v1 / v2;
        }
    }
}
