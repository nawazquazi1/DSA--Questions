public class Questions_37 {
    public static void main(String[] args) {
        System.out.println(Decimal_to_any_base(634,8));

    }

    public static int Decimal_to_any_base(int decimal, int bace) {
        int r = 0;
        int p = 1;
        while (decimal > 0) {
            int digit = decimal % bace;
            decimal/= bace;
            r += digit*p;
            p*=10;
        }
        return r;
    }
}
