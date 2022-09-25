public class Octal_To_Decimal {
    public static void main(String[] args) {
        int temp, dec = 0, g = 0;
        int n = 567;
        while (n > 0) {
            temp = n % 10;
            dec += temp * Math.pow(8, g++);
            n = n / 10;
        }
        System.out.println(dec);

    }
}
