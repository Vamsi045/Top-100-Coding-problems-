import java.util.Scanner;

public class PowerOfANumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int b=input.nextInt();
        int p=input.nextInt();

       b=(int) Math.pow(b, p);
        System.out.println(b);
        input.close();

    }
}
