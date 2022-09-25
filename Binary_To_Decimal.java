
public class Binary_To_Decimal {
    public static void main(String[] args) {
        int g = 101101;
        int sum = 0;
        int base = 1;
        int k = 0;
        while (g > 0) {
            int las = g % 10;
            sum += las * Math.pow(2, k++);
            base = base * 2;
            g = g / 10;
        }
        System.out.println(sum);
    }
}
