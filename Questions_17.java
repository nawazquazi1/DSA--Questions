public class Questions_17 {
    public static void main(String[] args) {
        pattern_4(5);
    }
    public static void pattern_4(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<i;j++){
                System.out.print("\t");
            }
            for (int j=i;j<=n;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
