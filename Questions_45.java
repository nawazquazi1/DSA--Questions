public class Questions_45 {
    public static void main(String[] args) {
        int[] arrr = {2, 3, 5, 5, 3};
        Arrays_Bar_Chart(arrr);

    }


    public static void Arrays_Bar_Chart(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        for (int floor = max; floor >= 1; floor--) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >=floor) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
