import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Ënter the upper bound for fibnocci series");
        Scanner input=new Scanner(System.in);
        int k=input.nextInt();
        int l,n=0;
        int m=1;
        System.out.println("The fibonacci Series is");
        System.out.println(n);
        for(int i=1;i<k;i++){

            System.out.println(m);
            l=m;
            m=n+m;
            n=l;

        }
        input.close();
    }
}
