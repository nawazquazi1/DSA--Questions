import java.util.Arrays;

public class Questions_46 {
    public static void main(String[] args) {
//        SUM_tow_ARRAY(new int[]{3,1,0,7,5},new int[]{1,1,1,1,1,1});
        SUM_tow_ARRAY(new int[]{3,1,0,7,5},new int[]{6,3,8,5,9});
    }

    public static void SUM_tow_ARRAY(int [] arr1,int[]arr2) {
        int[] sum = new int[Math.max(arr1.length, arr2.length)];
        int c = 0;
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = sum.length - 1;
        while (k >= 0) {
            int d = c;
            if (i >= 0) {
                d += arr1[i];
            }
            if (j >= 0) {
                d += arr2[j];
            }
            c = d / 10;
            d = d % 10;
            sum[k] = d;
            i--;
            j--;
            k--;
        }
        if (c != 0) {
            System.out.println(c);
        }
        for (int val : sum) {
            System.out.println(val);
        }

    }
}
