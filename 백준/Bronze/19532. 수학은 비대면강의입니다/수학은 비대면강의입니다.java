import java.io.*;
import java.util.*;

public class Main {
	    public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        	
	        String[] inputs = br.readLine().split(" ");

	        // 문자열 배열을 정수형 변수로 변환
	        int a = Integer.parseInt(inputs[0]);
	        int b = Integer.parseInt(inputs[1]);
	        int c = Integer.parseInt(inputs[2]);
	        int d = Integer.parseInt(inputs[3]);
	        int e = Integer.parseInt(inputs[4]);
	        int f = Integer.parseInt(inputs[5]);
	            int x=0;
	            int y=0;
	            
	            for(int i=-999; i<=999; i++) {
	            	for(int j=-999; j<=999; j++) {
	            		
	            		if((a*i)+(b*j)==c && (d*i)+(e*j)==f){
	            			x=i;
	            			y=j;
	            			break;
	            		}

	            	}
	            	if(x!=0 && y!=0) {
	            		break;
	            	}
	            	
	            }
	            System.out.println(x+" "+y);
	        }
	    }