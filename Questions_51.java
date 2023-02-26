import java.util.Arrays;
import java.util.Stack;

public class Questions_51 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(Arrays.toString(stockSpan(new int[]{2,5,9,3,1,12,6,8,7})));
    }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }

    public static int[] stockSpan(int[] arr) {

        int[] nle = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        nle[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            while (stack.size() > 0 && arr[i] >= arr[stack.peek()]) {
                stack.pop();
            }
            if (stack.size()==0){
                nle[i]= i + 1;
            }else {
                nle[i]=i-stack.peek();
            }
            stack.push(i);
        }
        return nle;

    }

}
