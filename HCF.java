import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter two number to find their hcf and lcm");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=2;
        int hcf=1;
        input.close();
        if(a>b){
            while(c<=a/2){
                if(a%c==0 && b%c==0){
                    hcf=c;
                }
                c++;
            }
        }else{
            while(c<=b/2){
                if(a%c==0 && b%c==0){
                    hcf=c;
                }
                c++;
            }
        }
        System.out.println("HCF :"+hcf);
        int lcm=a*b/hcf;
        System.out.println("LCM :"+lcm);
    }
}
