import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
      
        
        
        int cnt = 0;
        int five = 5;
        
        while (n >= five) {
            cnt += n / five;
            five *= 5;
        }
        
        System.out.println(cnt);
    }
}