public class Questions_14 {

    public static void main(String[] args) {
        Pattern_1(5);
    }
    public static void Pattern_1(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
