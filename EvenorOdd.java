// Check if a Number is Positive or Negative
public class EvenorOdd {
    public static void main(String[] args) {
        System.out.println("Is the given number "+23+" even or odd ? "+Method1(23));
        System.out.println("Is the given number "+23+" even or odd ? "+Method2(23));

    }
    static String Method1(int n){
        if(n%2==0){
            return "yes";
        }
        return "no";
    }
    static String Method2(int n){
        if((n&1)==1){
            return "No";
        }
        return "Yes";
    }
    
}
