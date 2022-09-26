public class Replace_0_With_1 {
    public static void main(String[] args) {
        int g = 1007050;
        String h = Integer.toString(g);
        char[] b = h.toCharArray();
        for (int i = 0; i < b.length; i++) {
            if (b[i] == '0') {
                b[i] = '1';
            }
        }
        System.out.println(b);
        int num = 0;
        int res = 1;
        while (g > 0) {
            res = g % 10;
            if (res == 0) {
                num = num * 10 + 1;
            } else {
                num = num * 10 + res;
            }
            g = g / 10;
        }
        System.out.println(num);
        int num1 = 0;
        while (num > 0) {
            res = num % 10;
            num1 = num1 * 10 + res;
            num = num / 10;
        }
        System.out.println(num1);

    }
}
