public class Questions_16 {
    public static void main(String[] args) {
        Pattern_1(5);
    }

    public static void Pattern_1(int n){
        for (int i=1;i<=n;i++) {
           for (int j=n-1;j>=i;j--){
               System.out.print("\t");
           }
           for (int j=1;j<=i;j++){
               System.out.print("*\t");
           }
            System.out.println();
        }
    }
}