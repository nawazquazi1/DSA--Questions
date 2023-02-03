public class Questions_7 {
    public static void main(String[] args) {
        inverse(21453);
    }

    public static void inverse(int num){
        int inv=0;
        int op=1;
        while (num!=0){
            int od=num%10;
            int id=op;
            int ip=od;
            inv=inv+id*(int) Math.pow(10,ip-1);
            num=num/10;
            op++;
        }
        System.out.println(inv);
    }
}
