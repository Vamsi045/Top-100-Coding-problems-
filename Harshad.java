import java.util.*;

public class Harshad {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt(), temp = i;
        int sum = 0;
        while (i > 0) {
            sum += i % 10;
            i = i / 10;
        }
        input.close();
        if (temp % sum == 0) {
            System.out.println("The given number is harshad number");
        } else {
            System.out.println("The given number is not a harshad number");
        }

    }
}
