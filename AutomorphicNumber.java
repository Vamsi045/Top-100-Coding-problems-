public class AutomorphicNumber {
    public static void main(String[] args) {
        int n=25;
        int square=n*n;
        boolean flag=false;
        while(n>0){
            if((n%10)!=(square%10)){
                flag=true;
                break;
            }
            n=n/10;
            square=square/10;
        }
        if(flag==false){
            System.out.println("The given number is automorphic number");
        }else{
            System.out.println("The given number is not automorphic number");
        }
    }
}
