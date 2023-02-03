import java.util.Scanner;

public class Questions_12 {

    public static void main(String[] args) {
    }

    public static void pythagorean_triplets(int a, int b, int c) {
        int max = a;
        if (b >= max) {
            max = b;
        }
        if (c >= max) {
            max = c;
        }
        if (max==a){
            boolean flag=(b*b+c*c)==(a*a);
            System.out.println(flag);
        }else if (max==b){
            boolean flag=(a*a+c*c)==(b*b);
            System.out.println(flag);
        }else {
            boolean flag=(b*b+a*a)==(c*c);
            System.out.println(flag);

        }

    }
}
