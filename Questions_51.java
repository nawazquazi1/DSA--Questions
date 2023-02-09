import java.util.Arrays;
import java.util.Stack;

public class Questions_51 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(stockSpan(new int[]{2, 5, 9, 3, 1, 12, 6, 8, 7})));
    }

    public static int[] stockSpan(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] spn = new int[arr.length];// [1, 2, 3, 1, 1, 6, 1, 2, 1]
        stack.push(0);//2
        spn[0] = 1;//[1,
        for (int i = 1; i < arr.length; i++) {
            while (stack.size() > 0 && arr[i] > arr[stack.peek()]) { // size=1;  arr[i]=9; arr[stack.peek()]=3=3;
                stack.pop();
            }
            if (stack.size() == 0) {
                spn[i] = i + 1;
            } else {
                spn[i] = i - stack.peek();
            }
            stack.push(i);
        }
        return spn;
    }
}
