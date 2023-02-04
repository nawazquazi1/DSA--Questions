public class Questions_19 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n) {
        int st = n / 2 + 1;
        int sp = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            System.out.println();
            if (i<=n/2){
                st--;
                sp+=2;
            }else {
                sp-=2;
                st++;
            }

        }
    }
}
