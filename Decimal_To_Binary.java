public class Decimal_To_Binary {
    public static void main(String[] args) {
        int n = 123;
        int g = 0;
        while (n > 0) {
            int temp = n % 2;
            g = g * 10 + temp;
            System.out.println(temp);
            n = n / 2;
        }
        String h = Integer.toString(g);
        char[] digits = h.toCharArray();
        char[] reve = new char[digits.length];
        for (int i = digits.length - 1; i >= 0; i--) {
            reve[digits.length - 1 - i] = digits[i];
        }

        System.out.println(reve);
    }
}
