import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class Questions_107 {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();

        public Node() {

        }

        public Node(int data) {
            this.data = data;
        }

    }

    public static void display(Node node) {
        String str = node.data + " -> ";
        for (Node child : node.children) {
            str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);

        for (Node child : node.children) {
            display(child);
        }
    }

    public static Node construct(int[] arr) {
        Node root = null;
        Stack<Node> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                st.pop();
            } else {
                Node t = new Node();
                t.data = arr[i];

                if (st.size() > 0) {
                    st.peek().children.add(t);
                } else {
                    root = t;
                }

                st.push(t);
            }
        }

        return root;
    }

    public static int size(Node node) {
        int s = 0;

        for (Node child : node.children) {
            s += size(child);
        }
        s += 1;

        return s;
    }

    public static int max(Node node) {
        int m = Integer.MIN_VALUE;

        for (Node child : node.children) {
            int cm = max(child);
            m = Math.max(m, cm);
        }
        m = Math.max(m, node.data);

        return m;
    }

    public static int height(Node node) {
        int h = -1;

        for (Node child : node.children) {
            int ch = height(child);
            h = Math.max(h, ch);
        }
        h += 1;

        return h;
    }

    public static void traversals(Node node) {
        System.out.println("Node Pre " + node.data);

        for (Node child : node.children) {
            System.out.println("Edge Pre " + node.data + "--" + child.data);
            traversals(child);
            System.out.println("Edge Post " + node.data + "--" + child.data);
        }

        System.out.println("Node Post " + node.data);
    }

    public static void levelOrderLinewise(Node node) {
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);

        Queue<Node> cqueue = new ArrayDeque<>();
        while (queue.size() > 0) {
            node = queue.remove();
            System.out.print(node.data + " ");

            for (Node child : node.children) {
                cqueue.add(child);
            }

            if (queue.size() == 0) {
                queue = cqueue;
                cqueue = new ArrayDeque<>();
                System.out.println();
            }
        }
    }

    public static void levelOrderLinewiseDummyNode(Node node) {
        Queue<Node> mq = new ArrayDeque<>();

        mq.add(node);
        mq.add(new Node(-1));

        while (mq.size() > 0) {
            node = mq.remove();
            if (node.data != -1) {
                System.out.print(node.data + " ");

                for (Node child : node.children) {
                    mq.add(child);
                }
            } else {
                if (mq.size() > 0) {
                    mq.add(new Node(-1));
                    System.out.println();
                }
            }

        }
    }

    public static void levelOrderLinewiseSize(Node node) {
        Queue < Node > mq = new ArrayDeque < > ( );

        mq.add(node);

        while (mq.size() > 0) {
            int cicl = mq.size();
            for (int i = 0; i < cicl; i++) {
                node = mq.remove();
                System.out.print(node.data + " ");

                for (Node child : node.children) {
                    mq.add(child);
                }
            }
            System.out.println();
        }
    }

    private static class Pair{
        int level;
        Node node;
        Pair(Node node,int level){
            this.level=level;
            this.node=node;
        }
    }
    public static void levelOrderLinewiseLevel(Node node) {
        Queue < Pair > mq = new ArrayDeque < > ( );

        mq.add(new Pair(node, 1));

        int level = 1;
        while (mq.size() > 0) {
            Pair p = mq.remove();
            if (p.level > level) {
                level = p.level;
                System.out.println();
            }

            System.out.print(p.node.data + " ");
            for (Node child : p.node.children) {
                Pair cp = new Pair(child, p.level + 1);
                mq.add(cp);
            }
        }
    }



    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(values[i]);
        }

        Node root = construct(arr);
        levelOrderLinewiseLevel(root);
    }




}
