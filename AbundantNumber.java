public class AbundantNumber {
    public static void main(String[] args) {
        int n = 36;
        int sum = 1;
        int c = 2;
        while (c*c <= n) {
            if (n % c == 0) {
                sum += c;
                sum+=n/c;
                System.out.println(c);
            }
            c++;
        }
        if (sum > n) {
            System.out.println("The given number is abundant number");
        } else {
            System.out.println("The given number is not abundant number");
        }
    }
}
