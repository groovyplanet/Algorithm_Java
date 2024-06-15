import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String x = scan.nextLine();
        int cnt =0;
        String[] abc = {"c=","c-","dz=","d-","lj","nj","s=","z="};        		
        int index = 0;
        
        while (index < x.length()) {
            boolean tf = false;
            for (String a : abc) {
                if (x.startsWith(a, index)) {
                    cnt++;
                    index += a.length();  
                    tf = true;
                    break;
                }
            }
            
            if (!tf) { 
                cnt++;
                index++;
            }
        }
        
        System.out.println(cnt);
    }
}
