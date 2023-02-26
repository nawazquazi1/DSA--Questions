import java.util.Arrays;
import java.util.Scanner;

public class Questions_47 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = scn.nextInt();
        }
        Difference_of_two_Arrays(arr1,arr2);
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
                c=0;
            } else {
                d = a2[j] + c + 10 - a1v;
                c = -1;
            }
            diff[k] = d;
            i--;
            j--;
            k--;
        }
        System.out.println(Arrays.toString(diff));
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
