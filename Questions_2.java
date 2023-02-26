import java.util.Arrays;

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

    public static int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }
        int a = 0;
        int count = 0;
        for (int i = 2;i< n; i++) {
            count = 0;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                a = a + 1;
            }
        }
        return a;
    }

    public static int countPrimes1(int n) {
        if (n<2) {
            return  0;
        }
        boolean[] primes = new boolean[n+1];
        Arrays.fill(primes,true);
        int count=0;
        for (int i = 2; i*i<=n ; i++){
            //if index is true i.e. number is prime, marks all the multiples of it as false
            if (primes[i]){
                for (int j = i*2; j <= n; j=j+i) {
                    primes[j] = false;
                }
            }
        }
        for (int i = 2; i <n ; i++) {
            if (primes[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes1(10));

        prime(1, 10);

    }
}

