import java.util.Arrays;
import java.util.Stack;

public class Questions_53 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(SlidingWindowMaximum(new int[]{1,3,-1,-3,5,3,6,7}, 3)));
                        //1,6,3,6,5,6
    }

    public static int[] SlidingWindowMaximum(int[] arr, int k) {
        int[] nge = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(arr.length - 1);
        nge[arr.length - 1] = arr.length;
        for (int i = arr.length - 2; i >= 0; --i) {
            while (!stack.isEmpty()&& arr[i] >= arr[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nge[i] = arr.length;
            } else {
                nge[i] = stack.peek();
            }
            stack.push(i);
        }
        int j = 0;
        int[] ans = new int[arr.length - k + 1];
        for (int i = 0; i <= arr.length - k; ++i) {
            if (j < i) {
                j = i;
            }
            while (nge[j] < i + k) {
                j=nge[j];
            }
            ans[i] = arr[j];
        }
        return  ans;
    }

    public static int[] SlidingWindowMaximum1(int[] arr, int k) {
        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr.length - 1);
        nge[arr.length - 1] = arr.length;
        for (int i = arr.length - 2; i >= 0; --i) {
            while (!st.isEmpty() && arr[i] >= arr[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty()) {
                nge[i] = arr.length;
            } else {
                nge[i] = st.peek();
            }
            st.push(i);
        }

        int[] ans = new int[arr.length - k + 1];
        int j = 0; // To travel in nge
        for (int i = 0; i <= arr.length - k; ++i) {
            if (j < i){
                j = i;
            }
            while (nge[j] < i + k){
                j = nge[j];
            }
            ans[i] = arr[j];
        }

        return ans;
    }

}
