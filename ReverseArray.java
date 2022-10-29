import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] m={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(reverse(m)));
    }
    public static int[] reverse(int[] a) {

        int[] solution=new int[a.length];
        for(int i=a.length-1;i>=0;i--){
            solution[a.length-i-1]=a[i];
        }

        return solution;
    }
    
}
