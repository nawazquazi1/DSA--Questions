public class Questions_15 {
    public static void main(String[] args) {
        Pattern_2(5);

    }
    public static void Pattern_2(int n){
        for (int i=1;i<=n;i++){
            for (int j=n;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
