import java.util.Stack;

public class Questions_48 {
    public Questions_48() {
    }

    public static void main(String[] args) {
        System.out.println(duplicate("((a+b)+(c+d))"));
        System.out.println(duplicate("(a+b)+((c+d))"));
    }

    public static boolean duplicate(String exp) {
        Stack<Character> stack = new Stack();

        for(int i = 0; i < exp.length(); ++i) {
            char c = exp.charAt(i);
            if (c != ')') {
                stack.push(c);
            } else {
                if (stack.peek() == '(') {
                    return true;
                }

                while(stack.peek() != '(') {
                    stack.pop();
                }

                stack.pop();
            }
        }

        return false;
    }
}
