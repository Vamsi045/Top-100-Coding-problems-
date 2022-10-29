import java.util.Arrays;

public class Copycat_in_exam {
    public static void main(String[] args) {
        String g = "cAd";
        String h = "cia";
        g = g.toLowerCase();
        h = h.toLowerCase();
        char[] n = g.toCharArray();
        char[] b = h.toCharArray();
        Arrays.sort(n);
        Arrays.sort(b);
        g = new String(n);
        h = new String(b);
        System.out.println(g.equals(h));

    }
}
