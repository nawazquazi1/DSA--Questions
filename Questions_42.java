public class Questions_42 {
    public static int any_base_to_multiplication(int base, int number1, int number2) {
        int rv = 0;
        int p = 1;
        while (number2 > 0) {
            int d2 = number2 % 10;
            number2 = number2 / 10;
            int sprd = GetProductWithSingleDigit(base, number1, d2);
            rv =Questions_40.any_base_to_Addition(base, rv, sprd * p);
            p = p * 10;
        }
        return rv;
    }



    public static int GetProductWithSingleDigit(int base, int number1, int d2) {
        int c = 0;
        int rv = 0;
        int p = 1;
        while (number1 > 0 || c > 0) {
            int d1 = number1 % 10;
            number1 = number1 / 10;

            int d = d1 * d2 + c;
            c = d / base;
            d = d % base;
            rv = rv + d * p;
            p *= 10;
        }
        return rv;
    }

}
