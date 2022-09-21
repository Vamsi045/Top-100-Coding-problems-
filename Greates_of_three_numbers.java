import java.util.Scanner;

public class Greates_of_three_numbers {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int s=input.nextInt();
            int m=input.nextInt();
            int e=input.nextInt();
            System.out.println("The Greatest of three number is ("+s+" "+m+" "+e+") is");
            if(s>e && s>m){
                System.out.print(s);
            }else if(e>s && e>m){
                System.out.print(e);
            }else{
                System.out.print(m);
            }
        }
        
    }
}
