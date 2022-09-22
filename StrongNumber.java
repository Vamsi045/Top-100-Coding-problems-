import java.util.*;
public class StrongNumber {
    public static void main(String[] args) {
        int i,sum=0;
        System.out.println("Enter a number to checke wheater it is factorial or not");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int temp=n;
        while(n>0){
            i=n%10;
            sum+=fact(i);
            n=n/10;
        }
        input.close();
        if(temp==sum){
            System.out.println("The given number is strong number");
        }else{
            System.out.println("The given number is not a strong number");
        }
        System.out.println(sum);
    }
    static int fact(int n){
        if(n==1){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
}
