public class Questions_40 {
    public static void main(String[] args) {
        System.out.println(any_base_to_Addition(8,777,1));

    }
        public static int any_base_to_Addition(int base, int number1, int number2) {
            int rv = 0;
            int p = 1;
            int c = 0;
            while (number1 > 0 || number2 > 0 || c > 0) {
                int d1 = number1 % 10;
                int d2 = number2 % 10;
                number1 = number1 / 10;
                number2 = number2 / 10;
                int d = d1 + d2 + c;
                c = d / base;
                d = d % base;
                rv += d * p;
                p = p * 10;
            }
            return rv;
        }
    }
