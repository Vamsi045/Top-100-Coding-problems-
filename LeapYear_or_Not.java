import java.util.Scanner;

public class LeapYear_or_Not {
    public static void main(String[] args) {
        System.out.println("Enter Year");
        try (Scanner input = new Scanner(System.in)) {
            int k = input.nextInt();
            if (((k % 4 == 0) && (k % 100 != 0)) || (k % 400 == 0))
                System.out.println("Specified year is a leap year");
            else
                System.out.println("Specified year is not a leap year");
        }
    }
}
