public class Questions_5 {
    public static void main(String[] args) {
        digits_of_a_number(7600);
    }
    public static void digits_of_a_number(int n){
        int nod=0;
        int temp=n;
        while (temp!=0){
            temp=temp/10;
            nod++;
        }
        int div=(int) Math.pow(10,nod-1);
        while (div!=0) {
            int r = n / div;
            System.out.println(r);
            n%=div;
            div/=10;
        }
    }
}
