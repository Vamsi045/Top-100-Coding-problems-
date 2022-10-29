import java.util.Arrays;

public class TwoOrdersInArrays {
    public static void main(String[] args) {
        int[] array={1,4,3,2,6,8,5};
        System.out.println(Arrays.toString(method1(array)));
        
    }
    public static int[] method1(int[] a){
       int temp=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length/2;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    
                }
            }
            for(int k=a.length/2;k<a.length-1;k++){
                if(a[k]<a[k+1]){
                    temp=a[k];
                    a[k]=a[k+1];
                    a[k+1]=temp;
                    
                }
            }
            
            }
            return a;
        }
      
    }

