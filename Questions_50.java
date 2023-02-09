import javax.xml.parsers.SAXParser;
import java.util.Arrays;
import java.util.Stack;

public class Questions_50 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreaterElement(new int[]{2, 5, 9, 3, 1, 12, 6, 8, 7})));
    }


    public static int[] nextGreaterElement(int[] arr) {
        int[] nge = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[arr.length - 1]);
        nge[arr.length - 1] = -1;

        for (int i = arr.length - 2; i >= 0; i--) {
            while (stack.size() > 0 && arr[i] >=stack.peek()) {
                stack.pop();
            }
            if (stack.size() == 0) {
                nge[i] = -1;
            } else {
                nge[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return nge;




    }

    public static int[] nextGreaterElementRight(int[] arr) {//[2, 5, 9, 3, 1, 12, 6, 8, 7}]
        int[] nge = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 1; i < arr.length; i++) {
            while (stack.size() > 0 && arr[i] > arr[stack.peek()]) {
                int pop = stack.peek();//0
                nge[pop] = arr[i];
                stack.pop();
            }
            stack.push(i);
        }
        while (stack.size() > 0) {
            int pop = stack.pop();
            nge[pop] = -1;
            stack.pop();
        }
        return nge;
    }


}
