import java.util.Scanner;

public class FactorialOfANumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int sum=1;
        for(int i=1;i<=n;i++){
            sum*=i;
        }
        input.close();
        System.out.println("The Factorial of number "+n+" is "+sum);

    }
}
