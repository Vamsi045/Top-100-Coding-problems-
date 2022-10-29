import java.util.Scanner;

public class Sum_Of_Two_Primes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to chcke wheather the number can be expressed in sum of two primes");
        int n = input.nextInt();
        input.close();
        int i = 0;
        int g=0;
        for (i = 2; i <= n / 2; i++) {
            if (CheckPrime(i) == true) {
                if (CheckPrime(n - i) == true) {
                    g=1;
                    System.out.println("The given number can be expressed in sum of two primes--" + i + " : " + (n - i));
                    break;
                }
            }

        }
        if(g==0){
            System.out.println("The given number cant be expressed in sum of two primes");
        }

    }

    static boolean CheckPrime(int n) {
        boolean flag = true;
        ;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
