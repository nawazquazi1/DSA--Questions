public class Questions_25 {
    public static void main(String[] args){
        pattern(6);
    }
    public static void pattern(int n){
        for (int i=0;i<n;i++){
            int icj=1;
            for (int j=0;j<=i;j++){
                System.out.print(icj+"\t");
                int icjpi=icj*(i-j)/(j+1);
                icj=icjpi;
            }
            System.out.println();
        }
    }
}
