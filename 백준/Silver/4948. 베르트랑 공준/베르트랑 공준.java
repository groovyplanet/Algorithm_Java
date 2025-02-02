import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int max = 246912;
        // 2n의 최대값은 246912
        boolean[] isPrime = new boolean[max + 1];
        // true = 소수, false = 소수가 아님
        Arrays.fill(isPrime, true); 
        // 기본값 모두 true로 설정
        isPrime[0] = isPrime[1] = false;
        // 0과 1은 소수가 아니므로 false
        
        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;
                    // 여기서 에라토스테네스의 체: i가 소수일 때, i의 배수들은 소수가 아님.
                }
            }
        }
        
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if(n == 0) break;
            int count = 0;
            for (int i = n + 1; i <= 2 * n; i++) {
             // n보다 큰 소수 중, 2n 이하에 있는 소수의 개수 세기
                if (isPrime[i]) {
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.print(sb);
    }
}