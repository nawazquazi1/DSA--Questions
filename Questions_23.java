public class Questions_23 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n){
        int st=1;
        int os=-1;
        int sp=n/2;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=sp;j++) {
                System.out.print("\t");
            }
            System.out.print("*\t");
            for (int j=1;j<=os;j++){
                System.out.print("\t");
            }
            if (i>1&&i<n){
                System.out.print("*\t");
            }
            if (i<=n/2){
                os+=2;
                sp--;
            }else {
                os-=2;
                sp++;
            }
            System.out.println();
        }
    }
}
