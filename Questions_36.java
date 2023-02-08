public class Questions_36 {
    public static void main(String[] args) {

        System.out.println(getDigitFrequency(23234442,4));

    }

    public static int getDigitFrequency(int n,int d){
        int counter=0;
        while (n>0){
            int dig=n%10;
            n/=10;
            if (dig==d) {
                counter++;
            }
        }
        return counter;
    }
}
