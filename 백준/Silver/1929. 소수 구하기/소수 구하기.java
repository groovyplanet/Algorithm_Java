import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        
        // M부터 N까지 순회하며 isPrime 판별
        StringBuilder sb = new StringBuilder();
        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                sb.append(i).append("\n");
            }
        }
        
        System.out.print(sb);
    }
    
    // 소수 판별 메서드
    private static boolean isPrime(int num) {
        // 1은 소수가 아니므로 바로 false
        if(num <= 1) {
            return false;
        }
        
        // 2부터 sqrt(num)까지 나눠떨어지면 소수가 아님
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}