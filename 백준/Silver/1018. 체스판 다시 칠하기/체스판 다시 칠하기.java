import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken()); 
        int M = Integer.parseInt(st.nextToken()); 
        
        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            board[i] = line.toCharArray();
        }
        
        int answer = Integer.MAX_VALUE; 
        
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
              
                int count1 = countRepaints(board, i, j, 'W'); 
                int count2 = countRepaints(board, i, j, 'B');
                int currentMin = Math.min(count1, count2);
                answer = Math.min(answer, currentMin);
            }
        }
        
        System.out.println(answer);
    }
    

    private static int countRepaints(char[][] board, int row, int col, char topLeftColor) {
        int count = 0;
        for (int i = row; i < row + 8; i++) {
            for (int j = col; j < col + 8; j++) {
                char expected;
                if ((i - row + j - col) % 2 == 0) {
                    expected = topLeftColor;
                } else {
                    expected = (topLeftColor == 'W' ? 'B' : 'W');
                }
                if (board[i][j] != expected) {
                    count++;
                }
            }
        }
        return count;
    }
}
