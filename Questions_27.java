public class Questions_27 {
    public static void main(String[] args) {
        int n = 5;
        int st = 1;
        int sp = n / 2;
        int val=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < sp; j++) {
                System.out.print("\t");
            }
            int cvl=val;
            for (int j = 0; j < st; j++) {
                System.out.print(cvl+"\t");
                if (j<st/2) {
                    cvl++;
                }else {
                    cvl--;
                }
            }
            if (i<n/2) {
                st += 2;
                sp--;
                val++;
            }else {
                sp++;
                st-=2;
                val--;
            }
            System.out.println();
        }


        }
    }

