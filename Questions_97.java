import java.util.ArrayList;
import java.util.Stack;

public class Questions_97 {

    public static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }


    public static void display(Node root) {
        String str = root.data + " -> ";
        for (Node child : root.children) {
            str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);
        for (Node child : root.children) {
            display(child);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
        Node root = null;
        Stack<Node> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                stack.pop();
            } else {
                Node t = new Node();
                t.data = arr[i];
                if (stack.size() > 0) {
                    stack.peek().children.add(t);
                } else {
                    root = t;
                }
                stack.push(t);
            }
        }
        display(root);
    }
}
