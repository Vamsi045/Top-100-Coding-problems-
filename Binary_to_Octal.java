public class Binary_to_Octal {
    public static void main(String[] args) {
        int n=10110;
        int temp,oct=0;
        int i=0;
        while(n>0){
            temp=n%8;
            oct+=temp*Math.pow(8, i++);
            n=n/8;
        }
        System.out.println(oct);
    }
}
