import java.util.Scanner;

public class Greatest_two_numbers {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int s=input.nextInt();
            int e=input.nextInt();
            System.out.println("The greates of two number"+"("+s+" ,"+ e+")"+ "is "+ (s>e?s:e));
        }
    }
}
