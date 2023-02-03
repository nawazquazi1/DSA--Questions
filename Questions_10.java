import java.util.Scanner;

public class Questions_10 {
    public static void main(String[] args) {
        gcd_lcm(36,24);

    }
    public static void gcd_lcm(int n1,int n2){
        int on1=n1;
        int on2=n2;
        while (n1%n2!=0){
            int rem=n1%n2;
            n1=n2;
            n2=rem;
        }
        int gcd=n2;
        int lcm=(on1*on2)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }

}
