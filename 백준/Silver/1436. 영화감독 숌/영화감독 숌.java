import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int number = 666;

        while (count < N) {
       
            if (Integer.toString(number).contains("666")) {
                count++;
            }
            number++;
        }

   
        System.out.println(number - 1);
    }
}
