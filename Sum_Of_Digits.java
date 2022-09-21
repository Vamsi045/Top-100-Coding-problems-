public class Sum_Of_Digits {
    public static void main(String[] args) {
        int g=234;
        int sum=0;
        while(g>0){
            sum+=(g%10);
            g=g/10;
            
        }
        System.out.println("Sum of digits is(234) "+sum);
    }
}
