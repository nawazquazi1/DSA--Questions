public class Questions_22 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n) {
        int dig=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(dig+"\t");
                dig++;
            }
            System.out.println();

        }
    }
}
