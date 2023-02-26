import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Questions_59 {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(Merge_Overlapping_Intervals(new int[][]{{1,4}, {4,5}})));
        System.out.println((Arrays.toString(Merge_Overlapping_Intervals1(new int[][]{{22, 28}, {1, 8}, {25, 27}, {14, 19}, {27, 30}, {5, 12}}))));
    }

    public static int[][] Merge_Overlapping_Intervals(int time[][]) {
        Arrays.sort(time, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> list = new ArrayList<>();
        for (int[] interval : time) {
            if (list.size() == 0) {
                list.add(interval);
            } else {
                int pervi[] = list.get(list.size() - 1);
                if (interval[0] <= pervi[1]) {
                    pervi[1] = Math.max(pervi[1], interval[1]);
                } else {
                    list.add(interval);
                }
            }
        }
        return list.toArray(new int[list.size() - 1][]);
    }

    public static Object[] Merge_Overlapping_Intervals1(int[][] time) {
        pair[] pairs = new pair[time.length];
        for (int i = 0; i < time.length; i++) {
            pairs[i] = new pair(time[i][0], time[i][1]);
        }
        Arrays.sort(pairs);
        Stack<pair> stack = new Stack<>();
        for (int i = 0; i < time.length; i++) {
            if (i==0){
                stack.push(pairs[i]);
            }else {
                pair top=stack.peek();
                if (pairs[i].st>top.et){
                    stack.push(pairs[i]);
                }else {
                    top.et=Math.max(top.et,pairs[i].et);
                }
            }
        }

        Stack<pair> stack1=new Stack<>();
        while (stack.size()>0){
            stack1.push(stack.pop());
        }
        while (stack1.size()>0){
            System.out.println(stack1.pop());
        }

        return pairs;
    }


}


class pair implements Comparable<pair> {

    int st;
    int et;

    pair(int st, int et) {
        this.et = et;
        this.st = st;
    }

    @Override
    public int compareTo(pair o) {
        if (this.st != o.st) {
            return this.st - o.st;
        } else {
            return this.et - o.et;
        }
    }
}
