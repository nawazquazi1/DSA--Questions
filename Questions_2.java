public class Questions_2 {

    public static void prime(int low, int high) {
        for (int i = low; i <= high; i++) {
            int count = 0;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        prime(12,13);
    }
}
