public class Questions_47 {
    public static void main(String[] args) {
        Difference_of_two_Arrays(new int[]{3,1,0,7,5},new int[]{6,3,8,5,9});
    }
    public static void Difference_of_two_Arrays(int[] a1, int[] a2) {
        int[] diff = new int[a2.length];
        int c = 0;
        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = diff.length - 1;

        while (k >= 0) {
            int d = 0;
            int a1v = i >= 0 ? a1[i] : 0;
            if (a2[j] + c >= a1v) {
                d = a2[j] + c - a1v;
            } else {
                d = a2[j] + c + 10 - a1v;
                c = -1;
            }
            diff[k] = d;
            i--;
            j--;
            k--;
        }
        int idx = 0;
        while (idx < diff.length) {
            if (diff[idx] == 0) {
                idx++;
            } else {
                break;
            }
            while (idx < diff.length) {
                System.out.println(diff[idx]);
                idx++;
            }
        }
    }
}
