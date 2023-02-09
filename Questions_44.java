public class Questions_44 {
    public static void main(String[] args) {
        System.out.println(Find_Element_in_Array(new int[]{15,30,40,4,11,9},12));

    }

    public static int Find_Element_in_Array(int[] arr, int val) {
        for (int i=0;i<arr.length;i++){
            if (arr[i]==val){
                return i;
            }
        }
        return -1;
    }
}
