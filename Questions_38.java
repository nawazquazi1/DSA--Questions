public class Questions_38 {
    public static void main(String[] args) {
        System.out.println(any_base_to_Decimal(1172,8));
    }

    public static int any_base_to_Decimal(int number, int base) {
        int p = 1;
        int rv = 0;
        while (number > 0) {
            int dig = number % 10;
            number = number / 10;
            rv += dig * p;
            p = p * base;
        }
        return rv;
    }
}


