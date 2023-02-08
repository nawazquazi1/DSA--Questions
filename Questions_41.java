public class Questions_41 {
    public static void main(String[] args) {
        System.out.println(any_base_to_subtraction(8,256,1212));
    }

    public static int any_base_to_subtraction(int base, int number1, int number2) {
        int rv = 0;
        int c = 0;
        int p = 1;
        while (number2 > 0) {
            int d1 = number1 % 10;
            int d2 = number2 % 10;
            number1 /= 10;
            number2 /= 10;
            int d = 0;
            d2 += c;

            if (d2 >= d1) {
                c = 0;
                d = d2 - d1;
            } else {
                c = -1;
                d = d2 + base - d1;
            }
            rv = rv + d * p;
            p *= 10;
        }


        return rv;
    }
}
