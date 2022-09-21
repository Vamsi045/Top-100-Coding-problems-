import java.util.Scanner;

public class Prime_or_Not {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int k=input.nextInt();
        System.out.println("The given number "+k+" is prime or not ? "+Primeornot(k) );

    }
    static boolean Primeornot(int n){
        int i=2;
        while((i*i)<=n){
            if(n%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}