import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 위쪽 삼각형 출력
        for (int i = 1; i <= n; i++) {
            int spaces = n - i;
            int stars = 2 * i - 1;
            String line = " ".repeat(spaces) + "*".repeat(stars);
            System.out.println(line);
        }

        // 아래쪽 삼각형 출력
        for (int i = n - 1; i >= 1; i--) {
            int spaces = n - i;
            int stars = 2 * i - 1;
            String line = " ".repeat(spaces) + "*".repeat(stars);
            System.out.println(line);
        }

        br.close();
    }
}
