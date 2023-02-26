import java.util.Stack;

public class Questions_55 {
    public static void infix_Conversions(String ex) {
        Stack<String> post = new Stack<>();
        Stack<String> pre = new Stack<>();
        Stack<Character> oop = new Stack<>();
        for (int i = 0; i < ex.length(); i++) {
            char ch = ex.charAt(i);
            if (ch == '(') {
                oop.push(ch);
            } else if (ch >= '0' && ch <= '9' || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                post.push(ch + "");
                pre.push(ch + "");
            } else if (ch == ')') {
                while (oop.peek() != '(') {
                    char op = oop.pop();

                    String postv2 = post.pop();
                    String postv1 = post.pop();
                    String postv = postv1 + postv2 + op;
                    post.push(postv);

                    String prev2 = pre.pop();
                    String pre1 = pre.pop();
                    String prev = op + pre1 + prev2;
                    pre.push(prev);
                }
                oop.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (oop.size() > 0 && oop.peek() != '(' && precedence(ch) <= precedence(oop.peek())) {
                    char op = oop.pop();
                    String postv2 = post.pop();
                    String postv1 = post.pop();
                    String postv = postv1 + postv2 + op;
                    post.push(postv);

                    String prev2 = pre.pop();
                    String pre1 = pre.pop();
                    String prev = op + pre1 + prev2;
                    pre.push(prev);
                }
                oop.push(ch);
            }
        }
        while (oop.size() > 0) {
            char op = oop.pop();
            String postv2 = post.pop();
            String postv1 = post.pop();
            String postv = postv1 + postv2 + op;
            post.push(postv);

            String prev2 = pre.pop();
            String pre1 = pre.pop();
            String prev = op + pre1 + prev2;
            pre.push(prev);
        }
        System.out.println(post.pop());
        System.out.println(pre.pop());
    }

    private static int precedence(char op) {
        if (op == '+' || op == '-') {
            return 1;
        } else if (op == '*' || op == '/') {
            return 2;
        } else {
            return 0;
        }
    }

}
