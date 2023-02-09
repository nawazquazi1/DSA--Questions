import java.util.Arrays;
import java.util.Stack;

public class Questions_53 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new int[]{SlidingWindowMaximum(new int[]{2, 9, 3, 8, 1, 7, 12, 6, 14, 4, 32, 0, 7, 19, 8, 12, 6}, 4)}));
    }

    public static int SlidingWindowMaximum(int[] arr, int k) {
        int[] nge = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(arr.length - 1);
        nge[arr.length - 1] = arr.length;

        for (int i = arr.length - 2; i >= 0; i--) {
            while (stack.size() > 0 && arr[i] >= arr[stack.peek()]) {
                stack.pop();
            }
            if (stack.size() == 0) {
                nge[i] = arr.length;
            } else {
                nge[i] = stack.peek();
            }
            stack.push(i);
        }
        int j = 0;
        for (int i = 0; i <= arr.length - k; i++) {
            if (j < i) {
                j = i;
            }
            while (nge[j] < i + k) {
                j = arr[j];
            }
            System.out.println(arr[j]);
        }
        return 0;
    }
}
