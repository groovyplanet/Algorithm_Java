import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            int n = Integer.parseInt(br.readLine().trim());
            if (n == 0) break; 
            
            String answer = null; 
            
            for (int i = 0; i < n; i++) {
                String word = br.readLine();

                if (answer == null) {
                    answer = word;
                } else {
                    if (word.toLowerCase().compareTo(answer.toLowerCase()) < 0) {
                        answer = word;
                    }
                }
            }
            System.out.println(answer);
        }
    }
}
