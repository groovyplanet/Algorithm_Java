import java.io.*;
import java.util.*;
//Scanner scan = new Scanner(System.in);
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int i=x; i<=y; i++) {
        	boolean tf = true;
        	if(i==1) {
        		tf = false;
        	}
        	for(int j=2; j*j<=i; j++) { //math.sqrt() j*j <= i
        		
        		if(i%j==0) {
        			tf = false;
        			break;
        		}
        	}
        	
        	if(tf) {
        		if(min>i) {
        			min=i;
        		}
        		sum+=i;
        	}
        }
        	if(sum==0) {
        		System.out.println(-1);
        	}else {
        		System.out.println(sum+ "\n" +min);
        	}
  
        	
        }
    }
