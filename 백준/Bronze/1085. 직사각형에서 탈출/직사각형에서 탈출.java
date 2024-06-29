import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	 String[] arr = br.readLine().split(" ");
         int x = Integer.parseInt(arr[0]);
         int y = Integer.parseInt(arr[1]);
         int z = Integer.parseInt(arr[2]);
         int q = Integer.parseInt(arr[3]);
        
        int xz = z-x;
        int yq = q-y;
        
        System.out.println(Math.min(Math.min(x, xz), Math.min(y, yq))); 
  
        }
    }