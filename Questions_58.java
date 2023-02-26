import java.util.Stack;

public class Questions_58 {
    public static void main(String[] args) {

        Celebrity_Problem(new int[][]{{0, 1, 1, 1, 1},
                                      {1, 0, 1, 1, 0},
                                      {1, 1, 0, 1, 1},
                                      {0, 0, 0, 0, 0},
                                      {0, 0, 0, 1, 0}});
    }

    public static void Celebrity_Problem(int[][] arr) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            st.push(i);
        }
        while (st.size() >= 2) {
            int i = st.pop();
            int j = st.pop();
            if (arr[i][j] == 1) {
                st.push(j);
            } else {
                st.push(i);
            }
         }
        int pot = st.pop();
        for (int i = 0; i < arr.length; i++) {
            if (i != pot) {
                if (arr[i][pot] == 0 || arr[pot][i] == 1) {
                    System.out.println("none");
                    return;
                }
            }
        }
        System.out.println(pot);
    }
}
