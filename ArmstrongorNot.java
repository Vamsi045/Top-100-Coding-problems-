public class ArmstrongorNot {
    public static void main(String[] args) {
        int g=153;
        int temp=g;
        int h=1;
        int sum=0;
        int len=Integer.toString(g).length();
        while(g>0){
            h=g%10;
            sum+=Math.pow(h, len);
            g=g/10;
            
        }
        if(sum==temp){
            System.out.println("The given number "+temp+" is Amstrong");
        }else{
            System.out.println("The given number "+temp+" is not Amstrong");
        }
    }
}
