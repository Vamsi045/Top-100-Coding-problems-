import java.util.*;

class MinimumOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char arr[] = str.toCharArray();
        char f = 'z';
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] == arr[j]) {
                        count = count + 1;

                    }
                }
            }
            if (min > count) {
                min = count;
                f = arr[i];
            }
        }
        sc.close();
        System.out.println(f);

    }
}