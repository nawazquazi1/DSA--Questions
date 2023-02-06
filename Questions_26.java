public class Questions_26 {

    public static void main(String[] args) {
        pattern(10);
    }

    public static void pattern(int n) {
        for (int i = 1; i <= 10; i++) {
            int v = i * n;
            System.out.println(i+"*"+n+"="+v);;
        }
    }
}

