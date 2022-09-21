import java.util.Scanner;

public class Prime_Between_Range {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int s=input.nextInt();
            int e=input.nextInt();
            for(int i=s;i<=e;i++){
                int h=2;
                boolean flag=true;
                while((h*h)<=2){
                    if(i%h==0){
                        flag=false;
                        break;
                    }
                    h++;
                }
                if(flag==true){
                    System.out.println(i);
                }
            }
        }
    }
}
