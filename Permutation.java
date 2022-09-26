import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of players");
        int n=input.nextInt();
        System.out.println("Enter number of chairs");
        int r=input.nextInt();
        input.close();
        int p=factorila(n)/factorila(n-r);
        System.out.println("The number of ways players can be arrrangedd are "
        +p);

    }
    static int factorila(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
}
