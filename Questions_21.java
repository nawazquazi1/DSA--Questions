public class Questions_21 {
    public static void main(String[] args) {
        pattern(5);

    }
    public static void pattern(int n){
        for (int i=1;i<=n;i++){
            for (int j=n;j>=1;j--){
                if (i==j){
                    System.out.print("*\t");
                }else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
