
public class hh {
    static int MAX = 1000000;
    static boolean prime[] = new boolean[MAX + 1];
    public static void runSieveOfEratosthenes() {
        for (int i = 0; i < MAX + 1; i++)
            prime[i] = true;
        prime[1] = false;
        for (int p = 2; p * p <= MAX; p++) {
            if (prime[p]) {
                for (int i = p * 2; i <= MAX; i += p)
                    prime[i] = false;
            }
        }
    }
    public static int difference(int arr[]) {
        int min = MAX + 2;
        int max = -1;
        for (int i = 0; i < arr.length; i++) {           
            if (prime[arr[i]] == true) {              
                if (arr[i] > max)
                    max = arr[i];
                if (arr[i] < min)
                    min = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
        return max +min;
    }

    static int prime(int l, int r) {
        int n = (r - l)+1;
        int[] arr = new int[n];
        for (int i = 0; i <= n; i++) {
            arr[i] = l++;
        }               
        return difference(arr);
    }

    public static void main(String[] args) {
        System.out.println(prime(2, 10));
    }
}
