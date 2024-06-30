import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int[] triangle = new int[3];
        triangle[0] = Integer.parseInt(input[0]);
        triangle[1] = Integer.parseInt(input[1]);
        triangle[2] = Integer.parseInt(input[2]);

        Arrays.sort(triangle);

        while (triangle[0] + triangle[1] <= triangle[2]) {
        	triangle[2]--;
        }

        int perimeter = triangle[0] + triangle[1] + triangle[2];

        System.out.println(perimeter);
    }
}
