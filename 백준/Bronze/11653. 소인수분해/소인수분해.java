import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        if(x==1) {
        	return;
        }
        for(int i=2; i*i<=x; i++) {
        	while(x%i==0) {
        		System.out.println(i);
        		x/=i;
        	}
        }
        if(x>1) {
        	System.out.println(x);
        }
        }
    }