import java.util.Stack;

public class Questions_49 {
    public Questions_49() {
    }

    public static void main(String[] args) {
        unbracketed("[(a+b)+{(c+d)*(e/f)}]");
        unbracketed("[(a+b)+{(c+d)*(e/f)]}");
        unbracketed("[(a+b)+{(c+d)*(e/f)}");
        unbracketed("[(a+b)+{(c+d)*(e/f)}])");
    }

    public static void unbracketed(String exp) {
        Stack<Character> st = new Stack();

        for(int i = 0; i < exp.length(); ++i) {
            char ch = exp.charAt(i);
            if (ch != '(' && ch != '[' && ch != '{') {
                boolean b;
                if (ch == ')') {
                    b = handel(st, '(');
                    if (!b) {
                        System.out.println(false);
                        return;
                    }
                } else if (ch == ']') {
                    b = handel(st, '[');
                    if (!b) {
                        System.out.println(false);
                        return;
                    }
                } else if (ch == '}') {
                    b = handel(st, '{');
                    if (!b) {
                        System.out.println(false);
                        return;
                    }
                }
            } else {
                st.push(ch);
            }
        }

        if (st.size() == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

    public static boolean handel(Stack<Character> st, char corres) {
        if (st.size() == 0) {
            return false;
        } else if (st.peek() != corres) {
            return false;
        } else {
            st.pop();
            return true;
        }
    }
}
