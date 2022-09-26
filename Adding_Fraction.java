public class Adding_Fraction {
    public static void main(String[] args) {
        int a = 1, b = 3, c = 3, d = 9;
        
                
        int de=LCM(b, d);
         a=a*(de/b);
         c=c*(de/d);
         int n=a+c;
         System.out.println(n+"/"+de);


    }

    static int LCM(int n, int m) {
        int hcf=1, c = 2;

        if (n > m) {
            while (c <= n/ 2) {
                if (m % c == 0 && n % c == 0) {
                    hcf = c;
                }
                c++;
            }
        } else {
            while (c <= m / 2) {
                if (m % c == 0 && n % c == 0) {
                    hcf = c;
                }
                c++;
            }
        }
        return n * m / hcf;
    }
}
