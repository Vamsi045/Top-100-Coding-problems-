public class PerfectSquare {
    public static void main(String[] args) {
        int n = 49;
        boolean flag=false;
        int s = 0;
        int e = 49;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if ((mid * mid) == n) {
                flag=true;
                break;
                // return true;
            }else if((mid*mid)>n){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        if(flag==true){
            System.out.println("The given numbe is perfect square");
        }else{
            System.out.println("The given number is not a perfect square");
        }
    }
}
