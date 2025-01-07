import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        
        // 인덱스를 숫자로 보고 해당 숫자가 소수인지 여부를 저장할 배열
        boolean[] isPrime = new boolean[N + 1];
        
        // 2부터 N까지 일단 모두 소수(true)라고 가정 (단, 0과 1은 소수가 아니므로 제외)
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }
        
        // 에라토스테네스의 체 : i가 소수라면, i의 배수들을 모두 소수가 아니라고 표시(false)
        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        // M 이상 N 이하인 소수만 출력
        StringBuilder sb = new StringBuilder();
        for (int i = M; i <= N; i++) {
            if (isPrime[i]) {
                sb.append(i).append("\n");
            }
        }
        
        // 한꺼번에 결과 출력
        System.out.print(sb);
    }
}