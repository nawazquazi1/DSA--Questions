import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Questions_69 {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }

            size++;
        }


        public Node removeElements(Node head, int val) {
            if (head == null) {
                return null;
            }
            head.next = removeElements(head.next, val);
            return head.data == val ? head.next : head;
        }

        public int size() {
            return size;
        }

        public void display() {
            for (Node temp = head; temp != null; temp = temp.next) {
                System.out.print(temp.data + " ");
            }
            System.out.println();
        }

        public void removeFirst() {
            if (size == 0) {
                System.out.println("List is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                head = head.next;
                size--;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList list = new LinkedList();
//
//        String str = br.readLine();
//        while (!str.equals("quit")) {
//            if (str.startsWith("addLast")) {
//                int val = Integer.parseInt(str.split(" ")[1]);
//                list.addLast(val);
//            } else if (str.startsWith("size")) {
//                System.out.println(list.size());
//            } else if (str.startsWith("display")) {
//                list.display();
//            } else if (str.startsWith("removeFirst")) {
//                list.removeFirst();
//            }
//            str = br.readLine();
//        }

        list.addLast(100);
        list.addLast(90);
        list.addLast(80);
        list.addLast(70);
        list.addLast(60);
        list.addLast(50);
        list.addLast(40);
        list.addLast(30);
        list.addLast(20);
        list.addLast(10);
        list.display();
        Node node= list.head;
        list.removeElements(node,60);
        list.display();
    }
}
