import java.util.Stack;
public class Questions_56 {
    public static void main(String[] args) {
        Postfix_Evaluations_and_Conversions("264*8/+3-");
    }
    public static void Postfix_Evaluations_and_Conversions(String exp) {
        Stack<Integer> value = new Stack<>();
        Stack<String> pre = new Stack<>();
        Stack<String> infix = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                int v2 = value.pop();
                int v1 = value.pop();
                int val = operation(v1, v2, ch);
                value.push(val);

                String i2 = infix.pop();
                String i1 = infix.pop();
                String ival = "(" + i1 + ch + i2 + ")";
                infix.push(ival);

                String p2 = pre.pop();
                String p1 = pre.pop();
                String pval = ch + p1 + p2;
                pre.push(pval);
            } else {
                value.push(ch - '0');
                infix.push(ch + "");
                pre.push(ch + "");
            }
        }
        System.out.println(value.pop());
        System.out.println(infix.pop());
        System.out.println(pre.pop());
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
