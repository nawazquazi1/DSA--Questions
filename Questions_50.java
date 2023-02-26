import java.util.Arrays;
import java.util.Stack;

public class Questions_50 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(NextGretElement(new int[]{5, 3, 8, -2, 7})));
        System.out.println(Arrays.toString(nextGreaterElement(new int[]{5, 3, 8, -2, 7})));
    }

    public static int[] NextGretElement(int[] arr) {

        int[] ngh = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[arr.length - 1]);
        ngh[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            while (stack.size() > 0 && arr[i] >= stack.peek()) {
                stack.pop();
            }
            if (stack.size() > 0) {
                ngh[i] = stack.peek();
            } else {
                ngh[i] = -1;
            }
            stack.push(arr[i]);
        }
        return ngh;

    }

    //5, 3, 8, 2, 7
    public static int[] nextGreaterElement(int[] arr) {
        int[] ngh = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 1; i < arr.length; i++) {
            while (stack.size() > 0 && arr[i] >= arr[stack.peek()]) {
                int pos = stack.peek();
                ngh[pos] = arr[i];
                stack.pop();
            }
            stack.push(i);
        }

        while (stack.size() > 0) {
            int pos = stack.peek();
            ngh[pos] = -1;
            stack.pop();
        }
        return ngh;
    }
}
