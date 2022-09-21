import java.util.Scanner;

public class Sum_of_numbers_in_range {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the range of n");
            int s=input.nextInt();
            int e=input.nextInt();
            int sum=0;
            System.out.println("Sum of numbers from range "+s+" to "+e+" is:");
            for(int i=s;i<=e;i++){
                sum+=i;
            }
System.out.print(sum);
        }
        
    }
}
