public class FriendlyPair {
    public static void main(String[] args) {
        int n = 6;
        int h = 41;
        if (sumofprimes(n) / n == sumofprimes(h) / h) {
            System.out.println("The given two numbers is a friendly pairs");
        } else {
            System.out.println("The given two numbers is not a friendly pair");
        }

    }

    static int sumofprimes(int n) {
        int sum = 1;
        int c = 2;
        while ((c * c) <= n) {
            if (n % c == 0) {
                sum += c;
                sum += n / c;
            }
            c++;
        }
        return sum;
    }
}
