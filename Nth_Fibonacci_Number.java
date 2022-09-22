import java.util.Scanner;

public class Nth_Fibonacci_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Nth number");
        int b = input.nextInt();
        int l, n = 0;
        int m = 1;
        for (int i = 1; i < b; i++) {
            l=m;
            m=n+m;
            n=l;
        }
        input.close();
        System.out.println("The Nth "+b+" Fibonacci number is"+m);
    }
}
