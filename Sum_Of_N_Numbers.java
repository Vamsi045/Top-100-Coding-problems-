import java.util.Scanner;

public class Sum_Of_N_Numbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the range of n");
        int k=input.nextInt();
        int sum=0;
       
        System.out.println("Sum of "+k+" numbers is ");
        for(int i=1;i<=k;i++){
            sum+=i;
        }
       
System.out.print(sum);

    }
}
