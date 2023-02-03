public class Questions_4 {

    public static void main(String[] args) {
        count_digit(9543);

    }
    public static void count_digit(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        System.out.println(count);
    }
}
