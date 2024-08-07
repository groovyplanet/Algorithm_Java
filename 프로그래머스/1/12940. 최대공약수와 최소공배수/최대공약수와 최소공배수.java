import java.util.Arrays;

public class Solution {

    public static int[] solution(int n, int m) {

        int a = n;
        int b = m;
        int gcd = 0;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        gcd = a;

        int lcm = (n * m) / gcd;

        return new int[]{gcd, lcm};
    }

    
}
