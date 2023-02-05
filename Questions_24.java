public class Questions_24 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n) {
        int a = 0;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + "\t");
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }

    }
}
