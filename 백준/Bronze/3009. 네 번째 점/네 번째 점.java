import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int[][] square = new int [3][2];
    	
    	for(int i=0; i<3; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		square[i][0] = Integer.parseInt(st.nextToken()); 
    		square[i][1] = Integer.parseInt(st.nextToken());
    	}
    	int x = square[0][0] == square[1][0] ? square[2][0]:(square[0][0] == square[2][0]? square[1][0] : square[0][0]);
    	int y = square[0][1] == square[1][1] ? square[2][1]:(square[0][1] == square[2][1]? square[1][1] : square[0][1]);
  
    	System.out.println(x + " " + y);
        }
    }
