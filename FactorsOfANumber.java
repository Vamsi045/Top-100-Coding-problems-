import java.util.*;
public class FactorsOfANumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int r=input.nextInt();
        int i=2;
        while(r*r>=i){
            if(r%i==0){
                System.out.println(i);

            }
            i++;
        }
        input.close();

    }
}
