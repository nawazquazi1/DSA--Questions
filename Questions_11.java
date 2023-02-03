public class Questions_11 {
    public static void main(String[] args) {
        Factorization(545341149);
    }


    public static void Factorization(int n){
        for (int div=2;div*div<=n;div++){
          while (n%div==0){
              n/=div;
              System.out.println(div);
          }
        }
        if (n!=1){
            System.out.println(n);
        }

    }
}
