import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Questions_60 {
//    public static void main(String[] args) {
////        Smallest_number_following_Pattern("ddddiiii");
//
//
//    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Stack<Integer> st = new Stack<>();
        int num = 1;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'd') {
                st.push(num);
                num++;
            } else {
                st.push(num);
                num++;
                while (st.size() > 0) {
                    System.out.print(st.pop());
                }
            }
        }
        st.push(num);
        while (st.size() > 0) {
            System.out.print(st.pop());
//    d-d-d-i+d-d-d
//    4-3-2-1+7-6-5
        }

    }
    public static void Smallest_number_following_Pattern(String str) {
        Stack<Integer> st = new Stack<>();
        int num = 1;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'd') {
                st.push(num);
                num++;
            } else {
                st.push(num);
                num++;
                while (st.size() > 0) {
                    System.out.println(st.pop());
                }
            }
        }
        st.push(num);
        while (st.size() > 0) {
            System.out.println(st.pop());
//    d-d-d-i+d-d-d
//    4-3-2-1+7-6-5
        }
    }
}
