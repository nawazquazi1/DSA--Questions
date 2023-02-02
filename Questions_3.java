public class Questions_3 {
    public static void main(String[] args) {
fibonacci(11);
    }
    public static void fibonacci(int n){
        int first=0;
        int secound=1;
       for (int i=0;i<n;i++){
            System.out.println(first);
            int c=first+secound;
            first=secound;
           secound=c;
        }
    }


}
