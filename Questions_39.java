public class Questions_39 {

    public static void main(String[] args) {
        System.out.println(any_base_to_any_base(172,8,2));
    }
    public static int any_base_to_any_base(int number, int base1, int base2) {
     int dec=Questions_38.any_base_to_Decimal(number,base1);
        return Questions_37.Decimal_to_any_base(dec, base2);
    }
}
