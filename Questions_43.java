public class Questions_43 {

    public static void main(String[] args) {
        System.out.println(Span(new int[]{6,15,30,40,4,11,9}));
    }
    public static int Span(int[] arr) {
        int max=arr[0];
        int min=arr[0];
        for (int i=1;i<arr.length;i++){
            if (max<=arr[i]){
                max=arr[i];
            }
            if (min>=arr[i]){
                min=arr[i];
            }
        }
        return max-min;
    }
}
