public class ReverseNumber {
    public static void main(String[] args) {
        int n = 123;
        int i = 0;
        int reverse = 0;
        while (n > 0) {
            i = n % 10;
            reverse = reverse * 10 + i;
            n = n / 10;
        }
        System.out.println(reverse);
    }
}
