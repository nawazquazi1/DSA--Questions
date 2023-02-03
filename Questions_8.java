public class Questions_8 {
    public static void main(String[] args) {
        rotate_number(234567,3);
    }
    public static void rotate_number(int num, int ro) {
        int temp = num;
        int nod = 0;
        while (temp != 0) {
            temp = temp / 10;
            nod++;
        }
        ro = ro % nod;
        if (ro < 0) {
            ro += nod;
        }
        int div = 1;
        int mul = 1;
        for (int i = 1; i <= nod; i++) {
            if (i <= ro) {
                div *= 10;
            } else {
                mul *= 10;
            }
        }
        int q = num / div;
        int r = num % div;
        int rot = r * mul + q;
        System.out.println(rot);
    }
}
