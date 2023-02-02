import java.util.Scanner;

public class Questions_1 {
    // is number prime
    public static void main(String[] args) {
        is_prime(19);
    }

    public static void is_prime(int n) {
        int count = 0;
        for (int i = 2; i*i<= n; i++) {
            if (n % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("number is prime");
        } else {
            System.out.println("number is not prime");
        }
    }




}
