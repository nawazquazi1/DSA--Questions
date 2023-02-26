import java.util.Stack;

public class Questions_57 {
    public static void main(String[] args) {
        Prefix_Evaluations_and_Conversions("-+2/*6483");

    }
    public static void Prefix_Evaluations_and_Conversions(String exp) {
        Stack<Integer> val = new Stack<>();
        Stack<String> infix = new Stack<>();
        Stack<String> post = new Stack<>();
        for (int i = exp.length() - 1; i >= 0; i--) {
            char ch = exp.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                int v1 = val.pop();
                int v2 = val.pop();
                int opv = operation(v1, v2, ch);
                val.push(opv);
                String iv1 = infix.pop();
                String iv2 = infix.pop();
                String iop = "(" + iv1 + ch + iv2 + ")";
                infix.push(iop);
                String pv1 = post.pop();
                String pv2 = post.pop();
                String pop = pv1 + pv2 + ch;
                post.push(pop);
            } else {
                val.push(ch - '0');
                infix.push(ch + "");
                post.push(ch + "");
            }
        }
        System.out.println(val.pop());
        System.out.println(infix.pop());
        System.out.println(post.pop());
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
